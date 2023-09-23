package textstatistics;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.control.Label;

public class TextStatisticsApplication extends Application {
    
    @Override
    public void start(Stage window){
       
        TextArea text = new TextArea();
        BorderPane layout = new BorderPane();
        HBox labels = new HBox();
       
        
        Label letterLabel = new Label("Letters: ");
        Label wordsLabel = new Label("Words: ");
        Label longestWordLabel = new Label("The longest word is: ");
        
      
        
        text.textProperty().addListener((change, oldValue, newValue) -> {
            String[] data  = newValue.split(" ");
           
            
            String longestWord = "";
            for(String currentWord : data){
                
                if(currentWord.length() > longestWord.length()){
                    longestWord = currentWord;
                }
            }
            
            letterLabel.setText("Letters: " + newValue.length());
            
            wordsLabel.setText("Words: " + data.length);
            longestWordLabel.setText("The longest word is: " + longestWord);
        });
        
        labels.setSpacing(10);
        labels.getChildren().addAll(letterLabel, wordsLabel, longestWordLabel);
        layout.setCenter(text);
        layout.setBottom(labels);
        
        Scene view = new Scene(layout);
        window.setScene(view);
        window.show();
   
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(TextStatisticsApplication.class);
        
        
    }

}
