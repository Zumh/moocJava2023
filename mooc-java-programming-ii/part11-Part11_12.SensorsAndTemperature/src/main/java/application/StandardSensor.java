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
public class StandardSensor implements Sensor{
    private int sensor;
    
    public StandardSensor(int sensor){
        this.sensor = sensor;
    }
    
    @Override
    public boolean isOn(){    // returns true if the sensor is on
        return true;
    }
    
    
    @Override
    public void setOn(){};      // sets the sensor on
        
    

    @Override
    public void setOff(){};     // sets the sensor off
   
    @Override    
    public int read(){        // returns the value of the sensor if it's on
        return this.sensor;                       // if the sensor is not on throw a IllegalStateException
    }
}
