/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths; 

public class UserInterface {
    private RecipeManager recipieManager;
    private Scanner scan; 
    
    public UserInterface(Scanner scan){
        this.recipieManager = new RecipeManager();
        this.scan = scan;
       
    }
    
    public void commands(){
        System.out.println("\nCommands:\nlist - lists the recipes\n"
                + "stop - stops the program\n"
                + "find name - searches recipes by name\n"
                + "find cooking time - searches recipes by cooking time"
                + "find ingredient");
    }
    
    public void start(){
        // here we ask for file name
        System.out.print("File to read: ");
        String file = this.scan.nextLine();
        String command = "";
        
        
        // read the data from file and store them in a list
        if(!this.recipieManager.loadRecipes(file)){
            return;
        }
        
        
        System.out.println("");
        // then we print commands that user can interact with
        this.commands();
        
        while(true){
            System.out.print("\nEnter command: ");
            command = this.scan.nextLine();
            if(command.equals("stop")){
                break;
            }
            
            
            // show the list from store data base on the command
            this.operateCommands(command);

        }
    }
    
    private void displayRecipes(ArrayList<Recipe> recipeList) {
        System.out.println("\nRecipes:");
        for (Recipe recipe : recipeList) {
            System.out.println(recipe);
        }
    }
    
    
    private void operateCommands(String command){
        ArrayList<Recipe> recipes = null;
        if(command.equals("list")){
            // show name, cooking time: <time> all
            recipes = this.recipieManager.getRecipes();
            
        } else if (command.equals("find name")){
            System.out.print("Search word: ");
            recipes = this.recipieManager.searchRecipesByName(this.scan.nextLine());
        } else if (command.equals("find cooking time")){
            System.out.print("Max cooking time: ");
            recipes = this.recipieManager.searchRecipesByCookingTime(Integer.valueOf(this.scan.nextLine()));
        } else if (command.equals("find ingredient")){
            System.out.print("Ingredient: ");
            recipes = this.recipieManager.searchRecipesByingredient(this.scan.nextLine());
        }
        
        if (recipes != null){
            // dsiplay recipes here
            this.displayRecipes(recipes);
        }
    }
    
    
}
