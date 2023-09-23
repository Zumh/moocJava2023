package asteroids;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.geometry.Point2D;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class AsteroidsApplication extends Application {
    /*
        Creating the game window
        Creating the ship
        Turning the ship
        Moving the ship
        Creating an asteroid
        The collision between the ship and an asteroid
        Multiple asteroids
        Staying within the window
        Projectiles
        Adding points
        Continuous adding of asteroids
    */
    @Override
    public void start(Stage stage) throws Exception {
        int windowWidth = 600;
        int windowHeight = 400;
        
        
        Pane pane = gameWindow(windowWidth, windowHeight);
        Ship ship = new Ship(windowWidth/2, windowHeight/2);
        List<Asteroid> asteroids = new ArrayList<>();
        
        // create a new asteroid and add them in the list
        for (int i = 0; i < 5; i++){
            Random rnd = new Random();
            Asteroid asteroid = new Asteroid(rnd.nextInt(100), rnd.nextInt(100));
            asteroids.add(asteroid);
        }
        
        
        pane.getChildren().add(ship.getCharacter());
        asteroids.forEach(asteroid -> pane.getChildren().add(asteroid.getCharacter()));
        
        
        Scene scene = new Scene(pane);
        // make the ship and asteroid moves
        moveCharacters(scene, ship, asteroids);
        
        stage.setTitle("Asteroids!");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        // launch the application
        launch(args);
        
    }
    
    private void moveCharacters(Scene scene, Ship ship, List<Asteroid> asteroids){
        Map<KeyCode, Boolean> pressedKeys = new HashMap<>();
        // when press LEFT or RIGHT key from keyboard we turn by 5 degrees
        scene.setOnKeyPressed(event -> {
          pressedKeys.put(event.getCode(), Boolean.TRUE);
        });
        
        scene.setOnKeyReleased(event -> {
          pressedKeys.put(event.getCode(), Boolean.FALSE);

        });
        
        /*
        asteroids.turnRight();
        asteroids.turnRight();
        asteroids.accelerate();
        asteroids.accelerate();
        */
        new AnimationTimer() {
            @Override
            public void handle(long now){
                if (pressedKeys.getOrDefault(KeyCode.LEFT, false)){
                    // make the turn smoother by five degrees at a time from existing degree
                    ship.turnLeft();
                }
            
                if (pressedKeys.getOrDefault(KeyCode.RIGHT, false)){
                    ship.turnRight();
                }
                
                if (pressedKeys.getOrDefault(KeyCode.UP, false)){
                    ship.accelerate();
                }
                // moving the ship
                ship.move();
                
                // make all the asteroid moves
                asteroids.forEach(asteroid -> asteroid.move());
                
                // check if each asteroid hit with the ship if it does then stop the whole thing
                asteroids.forEach(asteroid -> {
                    
                    /// here we detect the collision 
                    if(ship.collide(asteroid)){

                        // stop is the build in method from Animation Timer that stop making character move
                        stop();
                    }
                });
              
            }
        }.start();
    }
    
    

 
    private Pane gameWindow(int windowWidth, int windowHeight){
        //(1) creating the game window
        Pane pane = new Pane();
        pane.setPrefSize(windowWidth, windowHeight);
        return pane;
    }
    
    public static int partsCompleted() {
        // State how many parts you have completed using the return value of this method
        /*
         (1) creating the game window, (2) creating the ship, and (3) turning the ship.
        */
        return 2;
    }

}
