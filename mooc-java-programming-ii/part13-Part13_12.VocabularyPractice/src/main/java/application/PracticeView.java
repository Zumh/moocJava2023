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
public class PracticeView {
     // we will have a dictionary that can contain information about the word and translation
    private Dictionary dictionary;
    private String randomWord;
    // constructor 
    public PracticeView(Dictionary dictionary){
        // we feed a new dictionary that we got it from main
        this.dictionary = dictionary;
        
        // this method trying to get a random word from dictionary
        this.randomWord = this.dictionary.getRandomWord();
    }
    
    // getView();
    public Parent getView(){
        // this is a preparation for input layout
        
        // here we going to have a layout call Grid
        GridPane layout = new GridPane();
        
        // word for translation
        Label randomWordLabel = new Label("Translate the word '" +  this.randomWord + "'");
        // here we going to add a text field 
        TextField translatedWord = new TextField();
        
        // show the answer is correct or incorrect 
        Label feedBackLabel = new Label("");
      
        
        // here we going to need only one button for add word of pair
        Button checkButton = new Button("Check");
           
        
        // layout the visual frame work for components;
        layout.setAlignment(Pos.CENTER);
        layout.setVgap(10);
        layout.setHgap(10);
        layout.setPadding(new Insets(10,10,10,10));

        // add all the components to visual layout
        layout.add(randomWordLabel, 0, 0);
        layout.add(translatedWord, 0, 1);
        layout.add(checkButton, 0, 2);
        layout.add(feedBackLabel, 0, 3);
    
        // action for checking if translation is correct
        checkButton.setOnMouseClicked((event) -> {
            
            
            // check if the word is in the dictionary
            // if the english word is in the dictionary
            if (this.dictionary.get(this.randomWord).equals(translatedWord.getText())){
                feedBackLabel.setText("Correct!");
            } else {
                // else we send it is not correct word
                feedBackLabel.setText("Incorrect! The Translation for the word '"+ this.randomWord + "' is '" + this.dictionary.get(this.randomWord) + "'.");
                return;
            }
            // set a new random word
            this.randomWord = this.dictionary.getRandomWord();
            randomWordLabel.setText("Translate the word '" +    this.randomWord + "'");
            // clear translation field box
            translatedWord.clear();
           
                    
        });
        
        // set up the layout
        return layout;
    }
    
}
