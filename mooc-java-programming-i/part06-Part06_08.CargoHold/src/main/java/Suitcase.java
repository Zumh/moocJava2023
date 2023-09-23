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

public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;
    
    public Suitcase(int maxWeight){
        items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }
    
    private int getTotalWeight(){
        int weight = 0;
        for(Item item:this.items){
            weight += item.getWeight();
        }
        return weight;
    }
    
    public void addItem(Item item){
        if (this.maxWeight >= this.getTotalWeight()+item.getWeight()){
            this.items.add(item);
        }
    }
    
   public void printItems(){
        for(Item item:this.items){
            System.out.println(item);
        }
    }
    
    public int totalWeight(){
        int sumOfWeight = 0;
        for(Item item:this.items){
            sumOfWeight += item.getWeight();
        }
        
        return sumOfWeight;
    }
    
    public Item heaviestItem(){
        if(this.items.isEmpty()){
           return null;
        } else {
            Item maxWeightItem = this.items.get(0);
            for(Item item:items){
                if (maxWeightItem.getWeight() < item.getWeight()){
                    maxWeightItem = item;
                }
            }
            
            return maxWeightItem;
        }
        
    }
    
    
    @Override
    public String toString(){
        if (this.items.isEmpty()){
            return "no items (0 kg)";
        } else if (this.items.size() == 1){
            return "1 item (" + this.getTotalWeight() + " kg)"; 
        }
        return this.items.size() + " items ("+this.getTotalWeight()+" kg)";
    }
    
}
