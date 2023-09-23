/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author student
 */

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor{
    private ArrayList<Sensor> sensors;
    private ArrayList<Integer> averages;
    
    public AverageSensor(){
        this.sensors = new ArrayList<>();
        this.averages = new ArrayList<>();
    }
    
    public void addSensor(Sensor toAdd){
        this.sensors.add(toAdd);
    }
    
    @Override
    public boolean isOn(){    // returns true if the sensor is on
        
        for(Sensor sensor : this.sensors){
            if(!sensor.isOn()){
                return false;
            }
        }
        
        return true;
    }
    
    
    @Override
    public void setOn(){
        for(Sensor sensor : this.sensors){
            sensor.setOn();
        }
    };      // sets the sensor on
        
    

    @Override
    public void setOff(){
        for(Sensor sensor : this.sensors){
            sensor.setOff();
        }
    };     // sets the sensor off
   
    @Override    
    public int read(){        // returns the value of the sensor if it's on
        // calculat the average of 
        if(this.sensors.size() == 0 || !this.isOn()){
            throw new IllegalStateException("There is no sensors");
        }
        
        int sumOfTemp = 0;
        for(Sensor sensor : this.sensors){
            sumOfTemp += sensor.read();
        }
       
        
        this.averages.add(sumOfTemp / this.sensors.size());
        return this.averages.get(this.averages.size() - 1);
        // if the sensor is not on throw a IllegalStateException
    }
    
    
    public List<Integer> readings(){
        return this.averages;
    }
}
