/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asteroids;

import java.util.Random;
import javafx.scene.shape.Polygon;

/**
 *
 * @author student
 */
public class Asteroid extends Character {
    private double rotationalMovement;
    
    public Asteroid(int x, int y) {
        //super(new Polygon(20, -20, 20, 20, -20, 20, -20, -20), x,y);
        
        super(new PolygonFactory().createPolygon(), x, y);
        
        Random rnd = new Random();
        
        super.getCharacter().setRotate(rnd.nextInt(360));
        
        int accelerationAmount = 1 + rnd.nextInt(10);
        
        for (int i = 0; i < accelerationAmount; i++){
            accelerate();
        }
        
        this.rotationalMovement = 0.5 - rnd.nextDouble();
    }
    
    // we override the movement here 
    public void move() {
        // make the asteroid move like chracter class
        super.move();
        
        // then we rotate with a new degree for rotational movement
        super.getCharacter().setRotate(super.getCharacter().getRotate() + rotationalMovement);
    }
}
