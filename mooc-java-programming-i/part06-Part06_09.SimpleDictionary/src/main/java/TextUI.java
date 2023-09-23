/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */

import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;
    public TextUI(Scanner scanner, SimpleDictionary dictionary){
        this.scanner = scanner;
        this.dictionary = dictionary;
    }
    public void start(){
        String userInput = "";

        
        while(true){
            System.out.print("Command: ");
            userInput = this.scanner.nextLine();
            if(userInput.equals("end")){
                break;
            } else if (userInput.equals("add")) {
                this.add();
                
            } else if (userInput.equals("search")){
                this.search();
            }else {
                System.out.println("Unknown command");
            }
           
            
        }
        
        System.out.println("Bye bye!");
        
    }
    
    private void search(){
        System.out.print("To be translated: ");
        String searchWord = this.scanner.nextLine();
        String translatedWord = "";
        // find the search word
        translatedWord = this.dictionary.translate(searchWord);
        
        if (translatedWord == null){
            System.out.println("Word "+searchWord+" was not found");
        } else {
            System.out.print("Translation: ");
        
            System.out.println(translatedWord);
        }
        
       
    }
    
    private void add(){
        String word = "";
        String translate = "";
        // word
        System.out.print("Word: ");
        word = this.scanner.nextLine();

        // a translation
        System.out.print("Translation: ");
        translate = this.scanner.nextLine();

        // stored the words in dictionary
        this.dictionary.add(word, translate);
    }
    
}
