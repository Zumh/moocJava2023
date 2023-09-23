/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */
public class List <Type> {
    // we need index for tracking index
    // we need values array for keeping data;
    private int freeIndex;
    private Type[] values;
    public List(){
        this.freeIndex = 0;
        this.values = (Type[]) new Object[10];
    }
    
    public void grow(){
        // resizing the array
        int newSize = this.values.length + this.values.length/2;
        
        Type[] newValues = (Type[]) new Object[newSize];
        
        for(int index  = 0; index < this.freeIndex; index++){
            newValues[index] = this.values[index];
        }
        this.values = newValues;
    }
    
    public void addValues(Type value){
        // check the length 
       
        if(this.values.length == this.freeIndex){
            this.grow();
        }
        
        this.values[this.freeIndex] = value;
        this.freeIndex++;
    }
    public Type value(int index){
        // throw Array index out of bound
        if(index >= this.values.length || index < 0){
            throw new ArrayIndexOutOfBoundsException("ArrayIndexOutOfBoundsException");
        }
        
        return this.values[index];
    }
    public int indexOfValue(Type value){
        if (this.values == null){
            return -1;
        }
        for(int index = 0; index < this.freeIndex; index++){
            if(this.values[index].equals(value)){
                return index;
            }
        }
        return -1;   
    }
    
    public boolean contains(Type value){
        return this.indexOfValue(value) >= 0;
    }
    
    public int size(){
        return this.freeIndex;
    }
    
    private void moveToLeft(int index){
        for(int currentIndex = index; currentIndex < this.freeIndex; currentIndex++){
            this.values[currentIndex] = this.values[currentIndex + 1];
        }
        
        // clean up all the
        if (this.values[0] == null){
            this.values = null;
        }
    }
    
    public void remove(Type value){
        // find the index of a value
        int index = this.indexOfValue(value);
        
        // move value to the left 
        this.moveToLeft(index);
    }
        
}
