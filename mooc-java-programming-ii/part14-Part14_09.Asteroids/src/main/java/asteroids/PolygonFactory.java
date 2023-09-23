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
public class PolygonFactory {
    public Polygon createPolygon() {
        Random rnd = new Random();
        
        // tyring to get doulbe number between 0 - 10 
        double size = 10 + rnd.nextInt(10);
        
        // instatiate a polygon shape
        Polygon polygon = new Polygon();
        
        // calculate 
        double c1 = Math.cos(Math.PI * 2 / 5);
        double c2 = Math.cos(Math.PI / 5);
        double s1 = Math.sin(Math.PI * 2 / 5);
        double s2 = Math.sin(Math.PI * 4 / 5);
        
        // intialize the point to the polygon points
        polygon.getPoints().addAll(
                size, 0.0,
                size * c1, size * -1 * s1,
                size * -1 * c2, size * -1 * s2,
                size * -1 * c2, size * s2,
                size * c1, size * s1
                
        );
        
        // generate each points and set with arnadom difference points
        // to make the shape un even.
        for (int i = 0; i < polygon.getPoints().size(); i++){
            int change = rnd.nextInt(5) - 2;
            polygon.getPoints().set(i, polygon.getPoints().get(i) + change);
        }
        
        return polygon;
    }
}
