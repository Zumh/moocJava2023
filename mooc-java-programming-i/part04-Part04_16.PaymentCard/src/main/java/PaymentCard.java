/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */
public class PaymentCard {
    private double balance;
    
    public PaymentCard(double openingBalance){
        this.balance = openingBalance;
    }
    
    public String toString(){
        return "The card has a balance of "+ this.balance +" euros";
    }
    
    public void eatAffordably() {
        double affordablePrice = 2.60;
        if (this.balance - affordablePrice >= 0){
            this.balance -= affordablePrice;
        }
    }
    
    public void eatHeartily() {
        double heartilyPrice = 4.60;
        
        if (this.balance - heartilyPrice >= 0){
            this.balance -= heartilyPrice;
        }
    }
    
    public void addMoney(double amount){
        double maxBalance = 150.0;
        if(this.balance + amount > maxBalance){
            // subtract exactly 150 
            this.balance = maxBalance;
            
        } else if (amount >= 0) {
            this.balance += amount;
        }
    }
    
}
