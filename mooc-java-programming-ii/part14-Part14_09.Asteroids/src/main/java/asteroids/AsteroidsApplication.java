package asteroids;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
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
    public static int WIDTH = 300;
    public static int HEIGHT = 200;
    @Override
    public void start(Stage stage) throws Exception {
 
        
        
        Pane pane = gameWindow(WIDTH, HEIGHT);
        Ship ship = new Ship(WIDTH/2, HEIGHT/2);
        List<Asteroid> asteroids = new ArrayList<>();
        List<Projectile> projectiles = new ArrayList<>();
        
        pane.setPrefSize(WIDTH, HEIGHT);
        // create a new asteroid and add them in the list
        for (int i = 0; i < 5; i++){
            Random rnd = new Random();
            // set 0 - WIDTH of the window out of 3 will be a new location for asteroid and the random height is 0 -HEIGHT
            Asteroid asteroid = new Asteroid(rnd.nextInt(WIDTH/3), rnd.nextInt(HEIGHT));
            asteroids.add(asteroid);
        }
        
        
        pane.getChildren().add(ship.getCharacter());
        asteroids.forEach(asteroid -> pane.getChildren().add(asteroid.getCharacter()));
        
        
        Scene scene = new Scene(pane);
        // make the ship and asteroid moves
        moveCharacters(scene, ship, asteroids, pane, projectiles);
        
        stage.setTitle("Asteroids!");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        // launch the application
        launch(args);
        
    }
    
    private void moveCharacters(Scene scene, Ship ship, List<Asteroid> asteroids, Pane pane, List<Projectile> projectiles){
        Map<KeyCode, Boolean> pressedKeys = new HashMap<>();
        // when press LEFT or RIGHT key from keyboard we turn by 5 degrees
        scene.setOnKeyPressed(event -> {
          pressedKeys.put(event.getCode(), Boolean.TRUE);
        });
        
        scene.setOnKeyReleased(event -> {
          pressedKeys.put(event.getCode(), Boolean.FALSE);

        });
        
       
       
       
        
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
                
                if (pressedKeys.getOrDefault(KeyCode.SPACE, false)){
                    // we initialize the projectile location to the same as current ship location of x and y coordinate.
                    Projectile projectile = new Projectile((int) ship.getCharacter().getTranslateX(), (int) ship.getCharacter().getTranslateY());
                    // It then sets the rotation of this character to the same rotation as the ship's character.
                    projectile.getCharacter().setRotate(ship.getCharacter().getRotate());
                    projectiles.add(projectile);

                    // so we set the speed of the projectile here
                    projectile.accelerate();
                    // we fire the projectile from current normal by 3
                    projectile.setMovement(projectile.getMovement().normalize().multiply(3));
                    

                    pane.getChildren().add(projectile.getCharacter());
                }
          

                
              
                
                // moving the ship
                ship.move();
                
                // make all the asteroid moves
                asteroids.forEach(asteroid -> asteroid.move());
                projectiles.forEach(projectile -> projectile.move());
                
                // we check if the projectiles and asteroids collide?
                // set both of their live as false if they are collide
                projectiles.forEach(projectile -> {
                    asteroids.forEach(asteroid -> {
                        if(projectile.collide(asteroid)) {
                            
                            projectile.setAlive(false);
                            asteroid.setAlive(false);
                        }
                    });
                });
                
                // if delete every projectile that hit asteroid from the window pane
                projectiles.stream()
                        .filter(projectile -> !projectile.isAlive())
                        .forEach(projectile -> pane.getChildren().remove(projectile.getCharacter()));
                
                // remove projectile that hit asteroid from the projectiles list
                projectiles.removeAll(projectiles.stream()
                .filter(projectile -> !projectile.isAlive())
                .collect(Collectors.toList()));
                
                
                
                
                // delete asteroid that got hit by projectile from the window pane
                asteroids.stream()
                        .filter(asteroid -> !asteroid.isAlive())
                        .forEach(asteroid -> pane.getChildren().remove(asteroid.getCharacter()));
                
                // cerate a new asteroids list that are alive
                asteroids.removeAll(asteroids.stream()
                .filter(asteroid -> !asteroid.isAlive())
                .collect(Collectors.toList()));
                
                
                // we add this at the end of Animation because we want to cretate new asteroids
                if(Math.random() < 0.005){
                    Asteroid asteroid = new Asteroid(WIDTH, HEIGHT);
                    if(!asteroid.collide(ship)){
                        asteroids.add(asteroid);
                        pane.getChildren().add(asteroid.getCharacter());
                    }

                }
              
              
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
