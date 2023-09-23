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

public class BoxWithMaxWeight extends Box {
    private ArrayList<Item> items;
    private int capacity;
    public BoxWithMaxWeight(int capacity){
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }
    private int totalCapacity(){
        int weight = 0;
        for(Item item: items){
            weight += item.getWeight();
        }
        return weight;
    }
    
    // this is the abstract method that we modified the rule for this class
    @Override
    public void add(Item item){
        if(this.totalCapacity() + item.getWeight() <= this.capacity){
            this.items.add(item);
        }
    }
    
    @Override
    public boolean isInBox(Item item){
        return this.items.contains(item);
    }
}
