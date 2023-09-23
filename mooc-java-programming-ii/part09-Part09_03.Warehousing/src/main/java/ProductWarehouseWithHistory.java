/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */
public class ProductWarehouseWithHistory extends ProductWarehouse {
    private ChangeHistory historyManager;
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance){
        super(productName, capacity);
        super.addToWarehouse(initialBalance);
        this.historyManager = new ChangeHistory();
        this.historyManager.add(initialBalance);   
        
        
    }
    
    
    public String history(){
        return this.historyManager.toString();
    }
    
    @Override
    public void addToWarehouse(double amount){
        /*
            the value recorded in the history should be the warehouse's balance after adding, not the amount added!
        */
        if (amount < 0 ){
            return;
        }
        super.addToWarehouse(amount);
        //update the change of history state
        this.historyManager.add(super.getBalance());
    }
    
    @Override
    public double takeFromWarehouse(double amount){
        /*
        the value recorded in the history should be the warehouse's balance after removing, not the amount removed!
        */
        if (amount < 0) {
            return 0.0;
        }
        
        amount = super.takeFromWarehouse(amount);
        double newBalance = super.getBalance();
        //update the change of history state
        this.historyManager.add(newBalance);
        return amount;
    }
    
    public void printAnalysis(){
        System.out.println("Product: " + super.getName());
        System.out.println("History: " + this.historyManager.toString());
        System.out.println("Largest amount of product: " + this.historyManager.maxValue());
        System.out.println("Smallest amount of product: " + this.historyManager.minValue());
        System.out.println("Average: " + this.historyManager.average());
    }
}
