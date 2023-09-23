/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;

/**
 *
 * @author student
 */
public class TemperatureSensor implements Sensor {
    private boolean sensor;
    public TemperatureSensor(){
        this.sensor = false;
    }
   
    @Override
    public boolean isOn(){    // returns true if the sensor is on
        return this.sensor;
    }
    
    
    @Override
    public void setOn(){
        this.sensor = true;
    };      // sets the sensor on
        
    

    @Override
    public void setOff(){
        this.sensor = false;
    };     // sets the sensor off
   
    @Override    
    public int read(){        // returns the value of the sensor if it's on
        if (this.sensor == false){
            throw new IllegalStateException ("sensor is off");
        }
        return new Random().nextInt(61) - 30;
                     // if the sensor is not on throw a IllegalStateException
        
    }
}
