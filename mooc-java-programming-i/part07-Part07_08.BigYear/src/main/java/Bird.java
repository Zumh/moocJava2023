
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */
public class Bird {
    private String englishName;
    private String latinName;
    private int observation;
    
    public Bird(String english, String latin){
        this.observation = 0;
        this.englishName = english;
        this.latinName = latin;
    }
    
    public String getLatinName(){
        return latinName;
    }
    
    public void setLatinName(String latinName){
        this.latinName = latinName;
    }
    
    public String getEnglishName(){
        return englishName;
    }
    
    public void setEnglishName(String englishName){
        this.englishName = englishName;
    }
    
    public int getObservation(){
        return observation;
    }
    
    public void setObservation(){
        this.observation++;
    }
    
    @Override
    public String toString(){
        return this.englishName + "(" + this.latinName+"):" + " " + this.observation + " observations";
    }
    
}
