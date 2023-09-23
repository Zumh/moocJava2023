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
import java.util.HashMap;

public class StorageFacility {
    
    private HashMap<String, ArrayList<String>> unit;
    
    public StorageFacility(){
        this.unit = new HashMap<>();
    }
    
    public void add(String unit, String item){
        if (!this.unit.containsKey(unit)){
            this.unit.put(unit, new ArrayList<>());
        }
        this.unit.get(unit).add(item);
        
    }
    
    public ArrayList<String> contents(String storageUnit){
        ArrayList<String> items = this.unit.get(storageUnit);
        if (items == null){
            items = new ArrayList<>();
        }
        
        return items;
    }
    
    public void remove(String storageUnit, String item){
        // remove one item
        
        // if remove one item and empty unit then remove the whole unit
        if(this.unit.containsKey(storageUnit)){
            for(String eachItem : this.unit.get(storageUnit)){
                if(item.equals(eachItem)){
                    this.unit.get(storageUnit).remove(item);
                    
                    if(this.unit.get(storageUnit).isEmpty()){
                        this.unit.remove(storageUnit);
                    }
                    
                    break;
                }
                
                
            }
        }
    }
    
    public ArrayList<String> storageUnits(){
        ArrayList<String> unitNames = new ArrayList<>();
        for(String name :this.unit.keySet()){
            if (this.unit.get(name)!= null){
                unitNames.add(name);
            }
        }
        return unitNames;
    }
}
