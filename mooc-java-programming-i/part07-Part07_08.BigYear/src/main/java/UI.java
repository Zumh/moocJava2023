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

public class UI {
    private Scanner scanner;
    private BirdDictionary birdDictionary;
    public UI(Scanner scanner, BirdDictionary birdDictionary){
        this.scanner = scanner;
        this.birdDictionary = birdDictionary;
    }
    
    public void start(){
        String userInput = "";

        
        while(true){
            System.out.print("? ");
            userInput = this.scanner.nextLine();
            if(userInput.equals("Quit")){
                break;
            } else if (userInput.equals("Add")) {
                this.add();
                
            } else if (userInput.equals("Observation")){
                this.observe();
            } else if (userInput.equals("All")){
                this.showAll();
            } else if (userInput.equals("One")){
                this.showOne();
            }
           
            
        }
        
        
        
    }
    private void showOne(){
        System.out.print("Bird? ");
        String searchBirdName = this.scanner.nextLine();
        Bird result = this.birdDictionary.searchOneBird(searchBirdName);
        System.out.println(result);
    }
    private void showAll(){
        this.birdDictionary.displayAll();
    }
    
    private void observe(){
        System.out.print("Bird? ");
        String searchWord = this.scanner.nextLine();
        String translatedWord = this.birdDictionary.birdTranslation(searchWord);
        
        if (translatedWord == null){
            System.out.println("Not a bird!");
        } 
        
       
    }
    
    private void add(){
       
        // word
        System.out.print("Name: ");
        String english = this.scanner.nextLine();

        // a translation
        System.out.print("Name in Latin: ");
        String latin = this.scanner.nextLine();

        // stored the words in dictionary
        this.birdDictionary.setTranslation(english, latin);
    }
    
}
