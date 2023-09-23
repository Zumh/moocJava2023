package borderpane;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.application.Application;
import javafx.scene.control.Label;

public class BorderPaneApplication extends Application{
    @Override
    public void start(Stage window){
        // initialize the scene and windows
        BorderPane textComponent  = new BorderPane();
        
        textComponent .setTop(new Label("NORTH"));
        textComponent .setRight(new Label("EAST"));
        textComponent .setBottom(new Label("SOUTH"));
        
        Scene view = new Scene(textComponent);
        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        // here we start the windows 
        launch(BorderPaneApplication.class);
        System.out.println("Hello world!");
    }

}
