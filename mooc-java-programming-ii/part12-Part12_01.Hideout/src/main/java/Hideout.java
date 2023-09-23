/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */
public class Hideout <T> {
    private T hideout;
    public Hideout(){
        this.hideout = null;
    }
    //puts an object with a type in accordance with the type parameter given to the 
    // the class into the hideout. In case an object is already in the hideout, 
    // it will disappear.
    public void putIntoHideout(T toHide){
        this.hideout = toHide;
    }
    //takes out the object with a type in accordance with the type parameter 
    // given to the the class from the hideout. In case there is nothing in 
    // the hideout, we return null. Calling the method returns the object in 
    // the hideout and removes the object from the hideout.
    public T takeFromHideout(){
        T newHideout = this.hideout;
        this.hideout = null;
        return newHideout;
    }
            
    //returns the value true if there is an object in the hideout. 
    //In case there isn't an object in the hideout, it should return the value false.        
    public boolean isInHideout(){
        if (this.hideout == null){
            return false;
        }
        return true;
    } 
        
}
