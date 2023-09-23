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

public class IOU {
    private HashMap<String, Double> peopleWeOwe;

    
    public IOU(){
        this.peopleWeOwe = new HashMap<>();
    }
    
    public void setSum(String toWhom, double amount){
        this.peopleWeOwe.put(toWhom, amount);
        
    }
    
    public double howMuchDoIOweTo(String toWhom){
        return this.peopleWeOwe.getOrDefault(toWhom, 0.0);
    }
}
