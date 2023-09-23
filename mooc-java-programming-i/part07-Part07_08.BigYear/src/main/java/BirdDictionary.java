
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */
public class BirdDictionary {
    private HashMap<String, Bird> birdTranslation;


    public BirdDictionary() {
        this.birdTranslation = new HashMap<>();
    }

    public String birdTranslation(String birdName) {
        Bird foundbird = this.birdTranslation.get(birdName);
        if(foundbird != null){
            this.birdTranslation.get(birdName).setObservation();
            return foundbird.getLatinName();
        }
        return null;
    }

    public void setTranslation(String english, String latin) {
        this.birdTranslation.put(english, new Bird(english, latin));
    }
    
    public void displayAll(){
      
        
        for (Map.Entry<String, Bird> entry : this.birdTranslation.entrySet()) {
            Bird value = entry.getValue();
            System.out.println(value);
        }
    }
    
    public Bird searchOneBird(String birdName){
        return this.birdTranslation.get(birdName);
    }
    
    
    
    
}
