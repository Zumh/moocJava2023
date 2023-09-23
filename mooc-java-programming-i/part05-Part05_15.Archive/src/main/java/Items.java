/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */
public class Items {
    private String id;
    private String name;
    
    public Items(String id, String name){
        this.id = id;
        this.name = name;
    }
    
    // this method is used by ArrayList.contains method to verify the object identity
    public boolean equals(Object compared){
        // if the variables are located in the same position, they are equal
        if (this == compared) {
            return true;
        }

        // if the compared object is not of type Bird, the objects are not equal
        if (!(compared instanceof Items)) {
            return false;
        }

        // convert the object to a Bird object
        Items comparedBook = (Items) compared;

        // if the values of the object variables are equal, the objects are, too
        return this.id.equals(comparedBook.id);
    }
    
    @Override
    public String toString(){
        return this.id + ": " + this.name;
    }
}
