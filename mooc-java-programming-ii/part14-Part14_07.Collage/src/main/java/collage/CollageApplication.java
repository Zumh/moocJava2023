package collage;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.PixelReader;
import javafx.scene.image.PixelWriter;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class CollageApplication extends Application {

    @Override
    public void start(Stage stage) {
        
        // the example opens the image, creates a new image, and copies the opened image
        // into the new one, pixel by pixel
        Image sourceImage = new Image("file:monalisa.png");
        Pane pane = new Pane();
        
        
        int width = (int) sourceImage.getWidth();
        int height = (int) sourceImage.getHeight();
        
        ImageView image = newImage(sourceImage);
        
        
        pane.getChildren().addAll(image);
        Scene scene = new Scene(pane, width, height);
        stage.setScene(scene);
        stage.show();
    }
    private ImageView newImage(Image sourceImage){
        PixelReader imageReader = sourceImage.getPixelReader();

        int width = (int) sourceImage.getWidth();
        int height = (int) sourceImage.getHeight();

        WritableImage targetImage = new WritableImage(width, height);
        PixelWriter imageWriter = targetImage.getPixelWriter();
        // we want whole value for the pixel and not a decimal so we increment by 2
        for (int yCoordinate = 0; yCoordinate < height; yCoordinate += 2) {
            for (int xCoordinate = 0; xCoordinate < width; xCoordinate += 2) {

                Color color = imageReader.getColor(xCoordinate, yCoordinate);
                double red = color.getRed();
                double green = color.getGreen();
                double blue = color.getBlue();
                double opacity = color.getOpacity();

                Color newColor = new Color(1.0 - red, 1.0 - green, 1.0 - blue, opacity);
                // divide each pixel value into half or shrink it
                int newX = xCoordinate/2;
                int newY = yCoordinate/2;
                // top left corner
                //imageWriter.setColor(xCoordinate, yCoordinate, newColor);
                imageWriter.setColor(newX, newY, newColor);
                
                // top right corner
                // the start is original x's coordinate and the continue with a newX coordinate that increase till the end of original image's width
                imageWriter.setColor(width/2 + newX, newY, newColor);
                
                // bottom left corner
                // basically start from half of the height and cotinue adding as new pixel is added till the end of the image
                imageWriter.setColor(newX, height/2 + newY, newColor);
                
                // bottom right corner
                // start x value from half of th width and keep adding till the end of the width
                // start y value from half of the height and keep adding the end of the height
                imageWriter.setColor(width/2 + newX, height/2 + newY, newColor);
                
            }
        }

        ImageView img = new ImageView(targetImage);
        return img;
    }
    public static void main(String[] args) {
        launch(args);
    }

}
