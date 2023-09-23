/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

/**
 *
 * @author student
 */

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.FileWriter;


public class SaveableDictionary {
    private Map<String, String> wordsToTranslate;
    private Map<String, String> translateToWords;
    private String file;
    public SaveableDictionary(){
        this.wordsToTranslate = new HashMap<>();
        this.translateToWords = new HashMap<>();
    }
   
   private boolean isWordExist(String words){
       return this.wordsToTranslate.containsKey(words) || this.translateToWords.containsKey(words);
   }
   
    
    public void add(String words, String translation){ 
        if (this.wordsToTranslate == null || !isWordExist(words)){
            this.wordsToTranslate.put(words, translation);
            this.translateToWords.put(translation, words);
        }
    }
    
    public String translate(String word){
        String translated = this.wordsToTranslate.get(word);
        if(translated == null){
            translated = this.translateToWords.get(word);
        } 
        return translated;
    }
    
    public void delete(String word){
        String translated = this.wordsToTranslate.remove(word);
        this.translateToWords.remove(translated);
        
        translated = this.translateToWords.remove(word);
        this.wordsToTranslate.remove(translated);
        
        
    }
    
    public SaveableDictionary(String file){
        this();
        this.file = file;
    }
    public boolean load(){
        try( Scanner fileReader = new Scanner(new File(file))){
            
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(":");   // split the line based on the ':' character

                this.add(parts[0], parts[1]);
            }
            return true;
        } catch (Exception e){
            return false;
        }
      
    }
    
    public boolean save(){
        try( FileWriter fileWriter = new FileWriter(this.file)){
            
            for(String key : this.wordsToTranslate.keySet()){
                fileWriter.write(key + ":" + this.wordsToTranslate.get(key)+"\n");
            }
            
            fileWriter.close();
            return true;
        } catch (Exception e){
            return false;
        }
      
    }
}
