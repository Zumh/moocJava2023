package hurraa;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import javafx.scene.media.AudioClip;

public class HurraaSovellus extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        BorderPane pane = new BorderPane();
        AudioClip sound = new AudioClip("file:Applause-Yannick_Lemieux.wav");
        Button nappi = new Button("Hurraa!");
        pane.setCenter(nappi);
        
        nappi.setOnAction((event) -> {
            // access the file and play the sound;
             
            sound.play();
        });
        Scene scene = new Scene(pane, 600, 400);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
