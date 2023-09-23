/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

/**
 *
 * @author student
 */
public class InputView {
    // we will have a dictionary that can contain information about the word and translation
    private Dictionary dictionary;
    
    // constructor 
    public InputView(Dictionary dictionary){
        // we feed a new dictionary that we got it from main
    
        this.dictionary = dictionary;
    }
    
    // getInputView();
    public Parent getView(){
        // this is a preparation for input layout
        
        // here we going to have a layout call Grid
        GridPane layout = new GridPane();
        
        // translation label and input text
        Label wordLabel = new Label("Word");
        // here we going to add a text field 
        TextField inPutWord = new TextField();
        
        // translation label and input text
        Label translationLabel = new Label("Translation");
        TextField inPutTranslation = new TextField();
        
        // here we going to need only one button for add word of pair
        Button addButton = new Button("Add the word pair");
        
        
        
        // layout the visual frame work for components;
        layout.setAlignment(Pos.CENTER);
        layout.setVgap(10);
        layout.setHgap(10);
        layout.setPadding(new Insets(10,10,10,10));

        // add all the components to visual layout
        layout.add(wordLabel, 0, 0);
        layout.add(inPutWord, 0, 1);
        
        layout.add(translationLabel, 0, 2);
        layout.add(inPutTranslation, 0, 3);
        
        layout.add(addButton, 0, 4);
        
        
        // action for the button
        addButton.setOnMouseClicked((event) -> {
            // saved the word and translation to dictionary
            String word = inPutWord.getText();
            String translation = inPutTranslation.getText();
            this.dictionary.add(word, translation);
            
            // clear input text field for another input
            inPutWord.clear();
            inPutTranslation.clear();
                    
        });
        // set up the layout
        return layout;
    }
    
   
}
