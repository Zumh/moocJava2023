package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JokeApplication extends Application {
    // setup the start
    @Override
    public void start(Stage window) throws Exception{
        
        // here we going to set up all the buttons 
        // for main layout
        BorderPane layout = new BorderPane();
        
        // the menu for main layout
        HBox menu = new HBox();
        menu.setPadding(new Insets(20, 20, 20, 20));
        menu.setSpacing(10);
        
        // set up buttons 
        Button jokeButton = new Button("Joke");
        Button answerButton = new Button("Answer");
        Button explainationButton = new Button("Explanation");
        
        menu.getChildren().addAll(jokeButton, answerButton, explainationButton);
        layout.setTop(menu);
        
        // sub views for the buttons
        Label jokeView=  new Label("What do you call a bear with no teeth?");
        Label answerView= new Label("A gummy bear.");
        Label explainationView = new Label("The joke uses wordplay between a toothless bear and \"gummy bear\" candy.");
        
        // actions for the button to show 
        jokeButton.setOnAction((event) -> layout.setCenter(jokeView));
        answerButton.setOnAction((event) -> layout.setCenter(answerView));
        explainationButton.setOnAction((event) -> layout.setCenter(explainationView));
        
        // set intiial view 
        layout.setCenter(jokeView);
        
        // create main scene with layout
        Scene scene = new Scene(layout);
        
        // show the main scene 
        window.setScene(scene);
        window.show();
    }
    // this is for advanced view in a small window
    private StackPane createView(String text){
        StackPane layout = new StackPane();
        layout.setPrefSize(300, 180);
        layout.getChildren().add(new Label(text));
        layout.setAlignment(Pos.CENTER);
        
        return layout;
    }
    
    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(JokeApplication.class);
    }   
}
