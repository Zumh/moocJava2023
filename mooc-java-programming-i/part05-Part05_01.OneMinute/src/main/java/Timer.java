/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */
public class Timer {
    private ClockHand hundredOfSeconds;
    private ClockHand seconds;
    
    public Timer(){
        // limits are 100 and 60
        this.hundredOfSeconds = new ClockHand(100);
        this.seconds = new ClockHand(60);
    }
    
    public void advance(){
        
        this.hundredOfSeconds.advance(); 
        if (this.hundredOfSeconds.value() == 0){
            this.seconds.advance();
        }
    }
    
    @Override
    public String toString(){
        return this.seconds + ":"+this.hundredOfSeconds;
    }
    
}
