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
    private int container;
    private int maxAmount;
    public Container(){
        this.container = 0;
        this.maxAmount = 100;
    }
    public int contains(){
        return this.container;
    }
    
    public void add(int amount){
        
        if(amount > 0){
                amount += this.container;
                if (amount > this.maxAmount){
                    amount = this.maxAmount;
                }
                this.container = amount;
        }
    }
    
    public void remove(int amount){
        if (amount > this.container){
            amount = this.container;
        }
        this.container -= amount;
    }
    
    public String toString(){
        
        return container+"/"+this.maxAmount;
    }
}
