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

public class Pipe <T>{
    private List<T> pipe;
    public Pipe(){
        this.pipe = new ArrayList<>();
    }
    
    public void putIntoPipe(T value){
        this.pipe.add(value);
                
    } 
    //puts an object with a type in accordance with the type parameter given
    // to the the class into the pipe.
    
    public T takeFromPipe(){
        if(this.pipe.isEmpty()){
            return null;
        }
        
        return this.pipe.remove(0);
    } 
    //takes out the value, which has been in the pipe the longest. 
    // In case there is nothing in the pipe, return null. 
    // Calling the method returns the value, 
    // which has been in the pipe the longest, and removes it from the pipe.
    
    public boolean isInPipe(){
           return !this.pipe.isEmpty();
    } 
    //returns the value true if the pipe has values. 
    // In case the pipe is empty, it returns the value false.
}
