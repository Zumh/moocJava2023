package notifier;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class NotifierApplication extends Application{
    @Override
    public void start(Stage window){
        TextField inputText = new TextField();
        Label messageBox = new Label();
        Button button = new Button("Update");
        
        // event handler for button
        button.setOnAction((event) -> {
            messageBox.setText(inputText.getText());
        });
        
        VBox componentGroup = new VBox();
        componentGroup.setSpacing(10);
        componentGroup.getChildren().addAll(inputText, button, messageBox);
        
        
        // generate the window
        Scene viewPort = new Scene(componentGroup);
        // generate the scene
        window.setScene(viewPort);
        // show
        window.show();
    }

    public static void main(String[] args) {
        launch(NotifierApplication.class);
        System.out.println("Hello world!");
    }

}
