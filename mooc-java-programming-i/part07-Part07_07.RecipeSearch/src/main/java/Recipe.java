
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */ 

public class Recipe {
   
    private String name;
    private int cookingTime;
    private ArrayList<String> ingredients;
    
    public Recipe(){
        this.name = "";
        this.cookingTime = 0;
        this.ingredients = new ArrayList<String>();
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getCookingTime(){
        return this.cookingTime;
    }
    
    public ArrayList<String> getIngredients(){
        return this.ingredients;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setCookingTime(int cookingTime){
        this.cookingTime = cookingTime;
    }
    
    public void setIngredients(String ingredient){
        this.ingredients.add(ingredient);
    }
    
    @Override
    public String toString(){
        return this.name + ", cooking time: " + this.cookingTime;
    }
}

