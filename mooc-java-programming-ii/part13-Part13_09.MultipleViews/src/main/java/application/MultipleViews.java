package application;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class MultipleViews extends Application{
    @Override
    public void start(Stage window){
         
        // buttons 
        Button toSecondView = new Button("To the second view!");
        Button toThirdView = new Button("To the third view!");
        Button toFirstView = new Button("To the first view!");
        
        // controlers
        BorderPane firstLayout = new BorderPane();
        firstLayout.setTop(new Label("First view!"));
        firstLayout.setCenter(toSecondView);
        
        VBox secondLayout = new VBox();
        secondLayout.getChildren().add(toThirdView);
        secondLayout.getChildren().add(new Label("Second view!"));
        
                
        GridPane thirdLayout = new GridPane();
        thirdLayout.add(new Label("Third view!"), 0, 0);
        thirdLayout.add(toFirstView, 1, 1);
        
        // Scenes 
        Scene firstScene = new Scene(firstLayout);
        Scene secondScene = new Scene(secondLayout);
        Scene thirdScene = new Scene(thirdLayout);
        
        toSecondView.setOnAction((event) -> {
            window.setScene(secondScene);
        });
        
        toThirdView.setOnAction((event) -> {
            window.setScene(thirdScene);
        });
        
        toFirstView.setOnAction((event) -> {
            window.setScene(firstScene);
        });
        
      
        
        window.setScene(firstScene);
        window.show();
        
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(MultipleViews.class);
    }

}
