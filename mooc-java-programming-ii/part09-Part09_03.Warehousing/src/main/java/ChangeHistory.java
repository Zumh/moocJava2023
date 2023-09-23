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

public class ChangeHistory {
    
    private ArrayList<Double> history;
    
    public ChangeHistory(){
        this.history = new ArrayList<>();
    }
    
    public void add(double status){
        this.history.add(status);
        
    }
    
    public void clear(){
        if(!this.history.isEmpty()){
            this.history.clear();
        }
    }
    
    @Override
    public String toString(){
        return history.toString();
    }
    
   public double maxValue(){
       if (this.history.size() == 0){
           return 0;
       }
       
      double largestStatus = this.history.get(0);
      for(double eachStatus : this.history){
          if (eachStatus > largestStatus){
              largestStatus = eachStatus;
          }
      }
      
      return largestStatus;
   }
   
    public double minValue(){
        if (this.history.size() == 0){
            return 0;
        }
       
        double smallestStatus = this.history.get(0);
        for(double eachStatus : this.history){
            if (eachStatus < smallestStatus){
                smallestStatus = eachStatus;
            }
        }
      
        return smallestStatus;
    }
   
   public double average(){
        if (this.history.size() == 0){
            return 0;
        }
        
        
        double sumOfChangeHistory = 0.0;
        
        for(double eachStatus : this.history){
            sumOfChangeHistory += eachStatus;
        }
        
        return (sumOfChangeHistory/this.history.size());
   }
}
