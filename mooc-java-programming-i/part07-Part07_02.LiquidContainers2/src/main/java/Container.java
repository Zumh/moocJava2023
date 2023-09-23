/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */
public class Container {
    private int liquids;
    private int maxAmount;
    public Container(){
        this.liquids = 0;
        this.maxAmount = 100;
    }
    public int contains(){
        return liquids;
    }
    
    
    public void add(int amount){
     
        if (amount > 0){
            amount += this.liquids;
            if(amount > this.maxAmount){
                amount = this.maxAmount;
            }
            this.liquids = amount;
        }
    }
    
    public void remove(int amount){
      
        if (amount > 0 && this.liquids > 0){
          
            if(amount > this.liquids){
                amount = this.liquids;
            }
            // Update container levels
            this.liquids -= amount;
        }
    }
    
    @Override
    public String toString(){
        return liquids+"/"+this.maxAmount;
    }
}
