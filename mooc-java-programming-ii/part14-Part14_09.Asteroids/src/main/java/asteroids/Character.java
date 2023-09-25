/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asteroids;

import javafx.geometry.Point2D;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Shape;

/**
 *
 * @author student
 */
public abstract class Character {
    private Polygon character;
    private Point2D movement;
    private boolean alive;
    
    public Character(Polygon polygon, int x, int y){
        this.character = polygon;
        this.character.setTranslateX(x);
        this.character.setTranslateY(y);
        
        // intialize the character new movement
        this.movement = new Point2D(0, 0);
        this.alive = true;
    }
    
     public boolean collide(Character other){
        /*
        The Shape class, which the Polygon class inherits, has a handy method for checking for collision. 
        The method public static Shape intersect(Shape shape1, Shape shape2) returns the intersection of two Shape objects.
        */
        
        // collide method use the intersect method.   
        // returns the intersection of two Shape objects.
        Shape collisionArea = Shape.intersect(this.character, other.getCharacter()); 
        /*
            collisionArea.getBoundsInLocal() returns the bounding box of the intersection area. 
            In other words, it gives you a rectangle that tightly encloses the area where the ship and the other object intersect.

            .getWidth() retrieves the width of this bounding box.

            != -1 checks if the width is not equal to -1. 
            If it's not equal to -1, it means that there is an actual intersection, because 
            a valid width value (greater than or equal to 0) indicates that the two shapes are overlapping.
        */
        return collisionArea.getBoundsInLocal().getWidth() != -1;
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
        
        // if the character is out of the window from the left side then reset them
        if (this.character.getTranslateX() < 0){
            this.character.setTranslateX(this.character.getTranslateX() + AsteroidsApplication.WIDTH);
        }
        
        // if the character is out of the window from the right side
        if (this.character.getTranslateX() > AsteroidsApplication.WIDTH){
            // we reset the location of x location to within the window frame like 900 % 300 = 0
            this.character.setTranslateX(this.character.getTranslateX() % AsteroidsApplication.WIDTH);
        }
        
        
          // if the character is out of the window from the left side then reset them
        if (this.character.getTranslateY() < 0){
            this.character.setTranslateY(this.character.getTranslateY() + AsteroidsApplication.HEIGHT);
        }
        
        
        // if the character is out of the window from the right side
        if (this.character.getTranslateY() > AsteroidsApplication.HEIGHT){
            
            // we reset the location of x location to within the window frame like 900 % 300 = 0
            this.character.setTranslateY(this.character.getTranslateY() % AsteroidsApplication.HEIGHT);
        }
    }
    
    public boolean isAlive(){
        return this.alive;
    }
    
    public void setAlive(boolean alive){
        this.alive = alive;
    }
    
    public Point2D getMovement(){
        return this.movement;
    }
    
    public void setMovement(Point2D inputMovement){
        this.movement = inputMovement;
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
