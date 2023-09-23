/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */
import java.util.List;
import java.util.ArrayList;

public class Herd implements Movable{
    
    private List<Movable> organs;
    
    public Herd(){
        organs = new ArrayList<>();
    }
    
    public String toString(){
        StringBuilder concatenatedString = new StringBuilder();
        for(Movable org : this.organs){
            concatenatedString.append(org).append("\n");
        }
        return concatenatedString.toString();
    }
    
    public void addToHerd(Movable movable){
        this.organs.add(movable);
    }
    
    @Override
    public void move(int dx, int dy){
        for(Movable org : this.organs){
            org.move(dx, dy);
        }
    }
}
