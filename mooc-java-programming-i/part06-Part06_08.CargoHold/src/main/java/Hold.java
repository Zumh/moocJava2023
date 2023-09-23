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

public class Hold {
    private ArrayList<Suitcase> suitcases;
    private int maxWeight;
    
    public Hold(int maxWeight){
        this.suitcases = new ArrayList<>();
        this.maxWeight = maxWeight;
    }
    private int totalWeightHold(){
        int sumOfHoldedWeight = 0;
        for(Suitcase eachCase:this.suitcases){
            sumOfHoldedWeight += eachCase.totalWeight();
        }
        
        return sumOfHoldedWeight;
    }
    public void addSuitcase(Suitcase suitcase){
        // calculate the total weight that we can hold
        
        if (this.totalWeightHold() + suitcase.totalWeight() <= this.maxWeight){
            this.suitcases.add(suitcase);
        }
    }
    
    public void printItems(){
        for(Suitcase eachCase:this.suitcases){
            eachCase.printItems();
        }
    }
    
    
    @Override
    public String toString(){
        return this.suitcases.size() + " suitcases " + "("+ this.totalWeightHold() +" kg)";  
    }
}
