/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 *
 * @author student
 */
public class Dictionary {
    // here we going to store words
    // translation
    private List<String> words;
    private Map<String, String> translations;
    
    // this is for public construction
    public Dictionary(){
        this.words = new ArrayList<>();
        this.translations = new HashMap<>();
        
        // we initialize this first word in dictionary just so we have some to randomize when we call getRandomword
        add("sana", "word");
    
    }
    
    public void add(String word, String translation){
        // if translation doesn't have the word as a key
        // then we add the word in the words list first
        if(!this.translations.containsKey(word)){
            this.words.add(word);
        }
        
        // we use the word for key and translation for value
        this.translations.put(word, translation);
    }
    
    // return match word to 
    public String get(String word){
        return this.translations.get(word);
    }
    
    public String getRandomWord() {
        Random random = new Random();
        return this.words.get(random.nextInt(this.words.size()));
    }
}
