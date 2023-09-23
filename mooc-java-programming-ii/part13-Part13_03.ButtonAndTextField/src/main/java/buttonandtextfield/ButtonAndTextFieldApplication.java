package buttonandtextfield;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.control.TextField;

public class ButtonAndTextFieldApplication extends Application{

    @Override
    public void start(Stage window){
        Button button = new Button("button1");
        Pane spacerPane = new Pane();
        spacerPane.setMinSize(0, 0);
        TextField textfield = new TextField();
        FlowPane buttonPane = new FlowPane(button, spacerPane);
        FlowPane componentGroup = new FlowPane(buttonPane, textfield);
        Scene view = new Scene(componentGroup);
        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        
        launch(ButtonAndTextFieldApplication.class);
        
    }

}
