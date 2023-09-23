package smiley;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;

import javafx.stage.Stage;


public class SmileyApplication extends Application {

    @Override
    public void start(Stage window){
        // Canvas object in the middle of the BorderPane. 
        int canvasLength = 640;
        int canvasWidth = 480;
        
        Canvas paintaingCanvas = new Canvas(canvasLength, canvasWidth);
        BorderPane layOut = new BorderPane();
        
        
        /*
            use the GraphicsContext object of the Canvas object to draw a smiley. 
            Use white (Color.WHITE) as the background color, and black (Color.BLACK) as the color of the smiley.
        */
        GraphicsContext graphicsContext  = paintaingCanvas.getGraphicsContext2D();
        // Set the background to white
        graphicsContext.setFill(Color.WHITE);
        graphicsContext.fillRect(0, 0, paintaingCanvas.getWidth(), paintaingCanvas.getHeight());
        
        
        
        // calculate half smile
        drawHalfSmile(graphicsContext, canvasLength, canvasWidth);
      
        // cheeek
        // half smile
        
        // mirror that 
        layOut.setCenter(paintaingCanvas);
        Scene view = new Scene(layOut);
        window.setScene(view);
        window.show();
    }
    
    private void drawHalfSmile(GraphicsContext graphicsContext,int canvasLength, int canvasWidth){
        int offset = minValue(canvasLength, canvasWidth)/6;
        int half = 2;
        // calculate the half of the length for width and length for the box
        int x = canvasWidth/half;
        int y = 0;
        
        // draw the half smile
        graphicsContext.setFill(Color.BLACK);
        
        drawLeft(x, y, offset, graphicsContext);
        drawRight(x, y, offset, graphicsContext);
    }
    
    private void drawLeft(int x, int y, int squareSize, GraphicsContext graphicsContext){
            int offset = squareSize;
            x -= offset;
            y += offset;
            // left eye
            graphicsContext.fillRect(x, y, squareSize, squareSize);

            // cheek
            x -= offset;
            y += offset*3;
            graphicsContext.fillRect(x, y, squareSize, squareSize);

            // smile
            x += offset;
            y += offset;
            graphicsContext.fillRect(x, y, squareSize*2, squareSize);

    }
    
    private void drawRight(int x, int y, int squareSize, GraphicsContext graphicsContext){
            int offset = squareSize;
            x += offset*2;
            y += offset;
            // right eye
            graphicsContext.fillRect(x, y, squareSize, squareSize);

            // cheek
            x += offset;
            y += offset*3;
            graphicsContext.fillRect(x, y, squareSize, squareSize);

            // smile
            x -= offset*2;
            y += offset;
            graphicsContext.fillRect(x, y, squareSize*2, squareSize);

    }
    
    private int minValue(int canvasLength, int canvasWidth) {
        if (canvasLength < canvasWidth){
            canvasWidth = canvasLength;
        }
        return canvasWidth;
    }
    
    public static void main(String[] args) {
        launch(SmileyApplication.class);
    }

   

}
