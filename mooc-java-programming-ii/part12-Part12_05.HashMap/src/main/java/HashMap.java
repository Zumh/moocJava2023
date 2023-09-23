/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */
import java.util.List;
import java.util.ArrayList;

public class HashMap <K, V> {
    // attribute
    private ArrayList<Pair<K, V>>[] values;
    private int freeIndex;

    // build constructor 
    public HashMap(){
        this.values = new ArrayList[32];
        this.freeIndex = 0;
    }
    
    
    // build getValue from the hashmap
    public V getValue(K key){
        // caclulate the hash 
        int hashValue = Math.abs(key.hashCode() % this.values.length);
        // check if element in values exist 
        // if not return null;
        if(this.values[hashValue] == null){
            return null;
        }
        
        // if hashcode exist in the values key
        ArrayList<Pair<K, V>> currentPair = this.values[hashValue];
        
        // traverse and return the value. 
        for(int index = 0; index < currentPair.size(); index++){
            if(currentPair.get(index).getKey().equals(key)){
////                return currentPair.get(index).getValue();
            }
        }
        // if we can't find the key in pair then we return null
        return null;
    }
    
    // add value to the hashmap
    public void addValue(K key, V value){
        
        // get the Array list from that hash value 
        ArrayList<Pair<K, V>> newList = this.getListOfMatchHash(key);
        
      
        int newIndex = this.getIndexOfValue(newList, key);
        // check if that index is less than 0
        // if it does that we need to create a pair object within ArrayList container
        // else we add our value in that particular index with same key and same value
        if ( newIndex < 0 ){
            newList.add(new Pair(key, value));
            this.freeIndex++;
        } else {
            newList.get(newIndex).setValue(value);
        }
        
        // grow the size of a hash if it is 75% capacity is full
        if(1.0 * this.freeIndex/this.values.length > 0.75){
            this.grow();
        }
    }
    
    public void grow(){
        // create new size with new HashMap
        ArrayList<Pair<K, V>>[] newList = new ArrayList[this.values.length * 2];
        // traverse through current values in the Hashmap
        for(int rowIndex = 0; rowIndex < this.values.length; rowIndex++){
            // copy old values to newList
            this.copy(newList, rowIndex);
        }
        
        this.values = newList;
    }
    
    private void copy(ArrayList<Pair<K, V>>[] newList, int rowIndex){
        for(int columnIndex = 0; columnIndex < this.values[rowIndex].size(); columnIndex++){
            

            // calculate column hash value from the key for a newlist key
            Pair oldPair = this.values[rowIndex].get(columnIndex);
          
            // we recalculate a new hashvalue just to re-organize or store data that are related in hash code
            int hashValue = oldPair.hashCode() % this.values.length;
            // if the slot is not empty then change the value
            if(newList[hashValue] == null){
                newList[hashValue] = new ArrayList<>();
                
            } 
            newList[hashValue].add(oldPair);  
            
        }
    }
    
    public V removePair(K key){
        // get a list of match key
        ArrayList<Pair<K, V>> currentList = this.getListOfMatchHash(key);
        // get a index value
        int index = this.getIndexOfValue(currentList, key);
        
        // extract pair with matchign index
        Pair<K, V> removedPair = currentList.get(index);
        
        // remove pair 
        currentList.remove(removedPair);
        
        // return pair's value that we just remove from a list
        return removedPair.getValue();
    }
    
    // find the index of match key from extracted list
    private int getIndexOfValue(ArrayList<Pair<K, V>> newList, K key){
        int newIndex = -1;
        //traverse through the list using index and the size of current list 
        // if we find the matching key from a pair object we break out of the loop
        for(int index = 0; index < newList.size(); index++){
            if(newList.get(index).getKey().equals(key)){
                newIndex = index;
                break;
            }
        }
        return newIndex;
    }
    // find a list of match hashcode base on key
    private ArrayList<Pair<K, V>> getListOfMatchHash(K key){
         // calculate the hash value
        int hashValue = key.hashCode() % this.values.length;
        
        // check if the hash value is null 
        // if it is null then create a new Array list or initialize it
        if(this.values[hashValue] == null){
            this.values[hashValue] = new ArrayList<>();
        }
        
        // get the Array list from that hash value 
        ArrayList<Pair<K, V>> newList = this.values[hashValue];
        
        return newList;
    }
}
