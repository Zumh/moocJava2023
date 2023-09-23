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

public class Box implements Packable{
    private ArrayList<Packable> items;
    private double maxWeight;
    public Box(double maxWeight){
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }
    
    @Override
    public double weight(){
        double sumOfWeight = 0.0;
        for(Packable item : this.items){
            sumOfWeight += item.weight();
        }
        return sumOfWeight;
    }
    
    public void add(Packable item){
        // calculate the total of packable weight and make sure it is not over maxweight;
        if(this.weight() + item.weight() <= this.maxWeight){
            this.items.add(item);
        }
    }
    
    @Override
    public String toString(){
        return "Box: " + this.items.size() + " items, total weight " + this.weight() + " kg";
    }
}
