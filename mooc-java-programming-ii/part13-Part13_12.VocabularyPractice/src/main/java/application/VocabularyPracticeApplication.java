package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


// END SOLUTION
public class VocabularyPracticeApplication extends Application {
    // initialize dictionary here 
    private Dictionary dictionary;
    
    // You have to mention override otherwise it just another sperate function.
    // this Override symbol allow us to initialize our private local variable and override it
    @Override
    public void init() throws Exception {
        
        // initialize the dictionary
        this.dictionary = new Dictionary();
    }
    
    
    @Override
    public void start(Stage window) throws Exception {
        
       
        
        // here we going to create view port for practice and input
        PracticeView practiceView = new PracticeView(dictionary);
      
        InputView inputView = new InputView(this.dictionary);
        
        //layout for the border pane
        BorderPane layout = new BorderPane();
        
        // here we going to need menu
        HBox menu = new HBox();
        menu.setPadding(new Insets(20,20,20,20));
        menu.setSpacing(10);
        
        // enter button and practice button for switching the layout
        Button enterButton = new Button("Enter new words");
        Button practiceButton = new Button("Practice");
        
                
        // add all the component to the menu
        menu.getChildren().addAll(enterButton, practiceButton);
        // set the position for menu in the layout
        layout.setTop(menu);
        
        // Action for button
        enterButton.setOnAction((event) -> layout.setCenter(inputView.getView()));
        practiceButton.setOnAction((event) -> layout.setCenter(practiceView.getView()));
        
        
        // set up a view for input
        layout.setCenter(inputView.getView());
        
        // set up a view for the whole layout
        Scene view = new Scene(layout, 400, 300);
        
        // set up stage for window
        window.setScene(view);
        window.show();
    }
    
    public static void main(String[] args) {
        // lauch the application for practice 
        launch(VocabularyPracticeApplication.class);
        
    }
}
