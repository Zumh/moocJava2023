package application;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class GreeterApplication extends Application {

    @Override
    public void start(Stage window) throws Exception {
        // tools for controling
        Label instructionText = new Label("Enter your name and press start.");
        TextField userInput = new TextField();
        Button button = new Button("start");
        
        
        // Group them in one grid
        GridPane layout = new GridPane();
        
        // first view for entering text and hit the button to activate action
        layout.add(instructionText, 0, 0);
        layout.add(userInput, 0, 1);
        layout.add(button, 0, 2);
        
        // styling of input scene
        layout.setPrefSize(300, 100);
        layout.setAlignment(Pos.CENTER);
        layout.setVgap(10);
        layout.setHgap(10);
        layout.setPadding(new Insets(20, 20, 20, 20));
        
        Scene userInputView = new Scene(layout);
        
        // 2. welcom scene
        Label greeting = new Label();
        // create view for welcome message
        StackPane welcomeLayout = new StackPane();
        welcomeLayout.setPrefSize(300, 180);
        welcomeLayout.getChildren().add(greeting);
        welcomeLayout.setAlignment(Pos.CENTER);
        
        Scene welcomeView = new Scene(welcomeLayout);
        
        // 3. adding an event handler to the login button
        // trigger button event 
        button.setOnAction((event) -> {
            greeting.setText("Welcome " + userInput.getText() + "!");
            window.setScene(welcomeView);
           
        });
        
        // view the user input scene
        window.setScene(userInputView);
        window.show();
        
    }

    public static void main(String[] args) {
        System.out.println("Hellow world! :3");
        launch(GreeterApplication.class);
    }
}
