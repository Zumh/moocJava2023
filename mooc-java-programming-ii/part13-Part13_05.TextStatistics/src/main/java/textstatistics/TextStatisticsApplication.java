package textstatistics;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.Label;
import javafx.application.Application;
import javafx.scene.layout.BorderPane;


public class TextStatisticsApplication extends Application{
    
    @Override
    public void start(Stage window){
        TextArea text = new TextArea();
        BorderPane layout = new BorderPane();
        HBox labels = new HBox();
        
        labels.setSpacing(10);
        labels.getChildren().add(new Label("Letters: 0"));
        labels.getChildren().add(new Label("Words: 0"));
        labels.getChildren().add(new Label("The longest word is:"));
        layout.setCenter(text);
        layout.setBottom(labels);
        
        
        Scene view = new Scene(layout);
        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
        System.out.println("Hello world!");
    }

}
