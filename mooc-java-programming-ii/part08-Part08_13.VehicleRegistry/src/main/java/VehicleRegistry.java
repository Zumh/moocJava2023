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
import java.util.ArrayList;

public class VehicleRegistry {
    
    private HashMap<LicensePlate, String> carOwner;
    
    public VehicleRegistry(){
        carOwner = new HashMap<>();
    }
    
    public boolean add(LicensePlate licensePlate, String owner){
      if(!carOwner.containsKey(licensePlate)){
          carOwner.put(licensePlate, owner);
          return true;
      } else {
          return false;
      }
    }
    
    public String get(LicensePlate licensePlate){
        return carOwner.get(licensePlate);
    }
    
    public boolean remove(LicensePlate licensePlate){
            if(carOwner.containsKey(licensePlate)){
                carOwner.remove(licensePlate);
                return true;
            } else {
                return false;
            }
    }
    
    public void printLicensePlates(){
        
        for(LicensePlate linumber : this.carOwner.keySet()){
            System.out.println(linumber);
        }
        
    }
    
    public void printOwners(){
        // remember owner that all ready print
        ArrayList<String> printedOwnerList = new ArrayList<>();
        String ownerName = "";
        for(LicensePlate owner : this.carOwner.keySet()){
            ownerName = this.carOwner.get(owner);
            if (!printedOwnerList.contains(ownerName)){
                System.out.println(ownerName);
                printedOwnerList.add(ownerName);
            }
        }
    }
    
}
