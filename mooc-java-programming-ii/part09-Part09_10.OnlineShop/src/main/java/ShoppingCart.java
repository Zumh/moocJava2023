/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */
import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<String, Item> items;

    public ShoppingCart(){
        this.items = new HashMap<>();
    }
    
    public void add(String product, int price){
        if(this.items.containsKey(product)){
          
            this.items.get(product).increaseQuantity();
        } else {
            this.items.put(product, new Item(product, 1, price));
    
        }
    }
    
    public int price(){
        // calculate the total price
        int totalPrice = 0;
        for(Item item : this.items.values()){
            totalPrice += item.price();
        }
        return totalPrice;
    }
    
    
    public void print(){
        for(Item item : this.items.values()){
            System.out.println(item);
        }
    }
}
