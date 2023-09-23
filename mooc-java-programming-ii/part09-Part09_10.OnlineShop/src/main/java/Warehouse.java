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
import java.util.Map;
import java.util.Set;

public class Warehouse {
    private Map<String, Integer> products;
    private Map<String, Integer> stocks;

    
    public Warehouse(){
        this.products = new HashMap<>();
        this.stocks = new HashMap<>();
    }
    public void addProduct(String product, int price, int stock){
        
        this.products.put(product, price);
        this.stocks.put(product, stock);
    }
    
    public int price(String product){
        int productPrice = -99;
        // search for given product;
        if(products.containsKey(product)){
            productPrice = products.get(product);
        }
        return productPrice;
    }
    
    public int stock(String product){
        if(!this.stocks.containsKey(product)){
            return 0;
        }
        return this.stocks.get(product);
    }
    
    public boolean take(String product){
        if(!this.stocks.containsKey(product)){
            return false;
        }
        
        if(this.stocks.get(product) - 1 >= 0){
            this.stocks.put(product, this.stocks.get(product) - 1) ;
            return true;
        }
        return false;
    }
    
    public Set<String> products(){
        return this.products.keySet();
    }
}
