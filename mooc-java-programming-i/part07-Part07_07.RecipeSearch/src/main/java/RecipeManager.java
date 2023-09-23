
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */
public class RecipeManager {
    private ArrayList<Recipe> recipes;
    
    public RecipeManager(){
        this.recipes = new ArrayList<>();
    }
    
    public boolean loadRecipes(String file){
        boolean status = false;
        String eachContent = "";
     
        Recipe currentRecipe = null;
        
        try (Scanner recipeScanner = new Scanner(Paths.get(file))){
            while(recipeScanner.hasNextLine()){
                eachContent = recipeScanner.nextLine();  
                
                if (eachContent.equals("")) {
                    this.recipes.add(currentRecipe);
                    currentRecipe = null;
                    continue;
                }
                if (currentRecipe == null) {
                    currentRecipe = new Recipe();
                    currentRecipe.setName(eachContent);
                } else if (currentRecipe.getCookingTime() == 0) {
                    currentRecipe.setCookingTime(Integer.parseInt(eachContent));
                } else {
                    currentRecipe.setIngredients(eachContent);
                }
                
                
            }
            
            if (!currentRecipe.equals("")){
                this.recipes.add(currentRecipe);
            }
            
            status = true;
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        return status;
    }
    
    public ArrayList<Recipe> getRecipes(){
        return this.recipes;
    }
    
    public ArrayList<Recipe> searchRecipesByName(String searchedWord) {
        ArrayList<Recipe> searchResults = new ArrayList<>();
        for (Recipe recipe : recipes) {
            if (recipe.getName().toLowerCase().contains(searchedWord.toLowerCase())) {
                searchResults.add(recipe);
            }
        }
        return searchResults;
    }
    
    public ArrayList<Recipe> searchRecipesByCookingTime(int cookingTime){
        ArrayList<Recipe> searchResults = new ArrayList<>();
        for (Recipe recipe : recipes) {
            if (recipe.getCookingTime() <= cookingTime) {
                searchResults.add(recipe);
            }
        }
        return searchResults;
    }
    
    public ArrayList<Recipe> searchRecipesByingredient(String searchIngredient){
        ArrayList<Recipe> searchResults = new ArrayList<>();
        for (Recipe recipe : recipes) {
            if (recipe.getIngredients().contains(searchIngredient.toLowerCase())) {
                searchResults.add(recipe);
            }
        }
        return searchResults;
    }
    
}
