package buttonandlabel;

import javafx.application.Application;

import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;

public class ButtonAndLabelApplication extends Application{
    @Override
    public void start(Stage window){
        // make the button on the top
        Button button = new Button("Button and Label Application");
        Label label1 = new Label("this is a new label");
        Pane spacerPane = new Pane();
        spacerPane.setMinSize(0, 0);
        
        FlowPane buttonPane = new FlowPane(button, spacerPane);
        //componentGroup.getChildren().add(button);
        
       
        FlowPane componentGroup = new FlowPane(buttonPane, label1);
        //flowPane.getChildren().add(label1);
     
        
        Scene view = new Scene(componentGroup);
        window.setScene(view);
        window.show();
        
    }

    public static void main(String[] args) {
        launch(ButtonAndLabelApplication.class);
    }

}
