/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asteroids;

import javafx.geometry.Point2D;
import javafx.scene.shape.Polygon;

/**
 *
 * @author student
 */
public abstract class Character {
    private Polygon character;
    private Point2D movement;
    
    public Character(Polygon polygon, int x, int y){
        this.character = polygon;
        this.character.setTranslateX(x);
        this.character.setTranslateY(y);
        
        // intialize the ship movement
        this.movement = new Point2D(0, 0);
    }
    
    public Polygon getCharacter() {
        return character;
    }
    
    public void turnLeft(){
        this.character.setRotate(this.character.getRotate() - 5);
    }
    
    public void turnRight(){
        this.character.setRotate(this.character.getRotate() + 5);
    }
    
    public void move(){
        this.character.setTranslateX(this.character.getTranslateX() + movement.getX());
        this.character.setTranslateY(this.character.getTranslateY() + movement.getY());
    }
    
    public void accelerate(){
        /*
            this accelerate() method calculates the horizontal and vertical components of acceleration based on the current rotation of the character, 
            scales them down, and then adds them to the current velocity of the object. 
            This can be used to simulate movement in a particular direction based on the rotation of the object.
        */
        double changeX = Math.cos(Math.toRadians(this.character.getRotate()));
        double changeY = Math.sin(Math.toRadians(this.character.getRotate()));
        
        // 50% for x and y coordinate
        changeX *= 0.05;
        changeY *= 0.05;
        
        this.movement = this.movement.add(changeX, changeY);
    }
}
