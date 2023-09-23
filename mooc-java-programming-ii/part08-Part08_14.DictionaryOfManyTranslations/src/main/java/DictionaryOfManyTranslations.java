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
import java.util.HashMap;

public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> dictionary;
    
    public DictionaryOfManyTranslations(){
        dictionary = new HashMap<>();
    }
    
    public void add(String word, String translation){
        if (!this.dictionary.containsKey(word)){
            this.dictionary.put(word, new ArrayList());
        }
        
        this.dictionary.get(word).add(translation);
    }
    
    public ArrayList<String> translate(String word){
        ArrayList<String> translatedWords = this.dictionary.get(word);
        if (translatedWords == null){
            translatedWords = new ArrayList<>();
        }
        return translatedWords;
    }
    
    public void remove(String word){
        if(this.dictionary.containsKey(word)){
            this.dictionary.remove(word);
        }
    }
}
