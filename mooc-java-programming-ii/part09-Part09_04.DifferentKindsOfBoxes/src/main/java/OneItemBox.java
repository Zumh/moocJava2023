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
public class OneItemBox extends Box{
    private ArrayList<Item> items;
 
    public OneItemBox(){
       
        this.items = new ArrayList<>();
    }
    
    // this is the abstract method that we modified the rule for this class
    @Override
    public void add(Item item){
        if(this.items.isEmpty()){
            this.items.add(item);
        }
    }
    
    @Override
    public boolean isInBox(Item item){
        return this.items.contains(item);
    }
}
