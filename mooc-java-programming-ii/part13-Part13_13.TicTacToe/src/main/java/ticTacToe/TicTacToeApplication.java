package ticTacToe;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class TicTacToeApplication extends Application {
    private String[] players;
    private Integer currentPlayer;

    private Integer boardSize;
    private Label turn;
    private GridPane buttonsLayout;
    private Boolean gameStatus;
 
    @Override
    public void start(Stage window) throws Exception {
        this.players = new String[]{"X", "O"};
        this.turn = new Label();
        this.currentPlayer = 0;
        this.boardSize = 3;
   
        this.buttonsLayout = new GridPane();
        
        this.buttonsLayout.setPrefSize(300, 300);
        this.buttonsLayout.setAlignment(Pos.CENTER);
        this.buttonsLayout.setVgap(10);
        this.buttonsLayout.setHgap(10);
        this.buttonsLayout.setPadding(new Insets(20,20,20,20));
        this.gameStatus = false;
        
     
        
        this.turn.setText("Turn: "+this.players[0]);
        BorderPane layout = new BorderPane();
        
  
     
        // create 3x3 buttons
        for(int row = 0; row < this.boardSize; row++){
            for(int column = 0; column < this.boardSize; column++){
                Button button = createButton();
                buttonsLayout.add(button, column, row);
            }
        }
 
        
        layout.setTop(this.turn);
        layout.setCenter(this.buttonsLayout);
                
        Scene view = new Scene(layout);
        window.setScene(view);
        window.show();
    }

    
    
    private boolean isOver(){
        int numRows = this.buttonsLayout.getRowCount();
        int numColumn = this.buttonsLayout.getColumnCount();
        String[][] cellValues = new String[numRows][numColumn];
        
        // Fill the cellValues array with button text
        for(Node node : this.buttonsLayout.getChildren()){
            if (node instanceof Button){
                int row = GridPane.getRowIndex(node);
                int col = GridPane.getColumnIndex(node);
                
                cellValues[row][col] = ((Button) node).getText();
                
                
            }
        }
        
        // Check rows, columns, and diagonals for a win
        for (int index = 0; index < numRows; index++){
            if(checkLine(cellValues[index]) || checkLine(getColumn(cellValues, index))){
                return true; // Row or column win
            }
        }
        
        if (checkLine(getDiagonal(cellValues, true)) || checkLine(getDiagonal(cellValues, false))) {
            return true; // Diagonal win
        }
        
        // Check for a tie (board is full)
        for(String[] row : cellValues){
            for(String cell : row){
                if(cell.isEmpty()){
                    return false; // There's an empty cell, the game is not over yet
                }
            }
        }
        
        return true; // If there are no empty cells, it's a tie
    }
    
    // check line for the win
    private boolean checkLine(String[] line){
        // get all the character for each row
        String firstCellText = line[0];
        for(String cellText : line){
            if(!cellText.equals(firstCellText) || cellText.isEmpty()){
                return false;
            }
        }
        return !firstCellText.isEmpty();
    }
    
    // Helper function to get a column from the 2D array
    // get all the character for each column
    private String[] getColumn(String[][] array, int col){
        String[] column = new String[array.length];
        for(int index = 0; index < array.length; index++){
            column[index] = array[index][col];
        }
        
        return column;
    }
    
    
    // Helper function to get a diagonal from the 2D array (main digonal if isMainDiagonal is true, anti-diagonal otherwise)
    private String[] getDiagonal(String[][] array, boolean isMainDiagonal){
        int size = array.length;
        String[] diagonal = new String[size];
        for(int index = 0; index < size; index++){
            if(isMainDiagonal){
                // top to bottom from left to right
                diagonal[index] = array[index][index];
                
            } else {
                // top to bottom from right to left
                diagonal[index] = array[index][size - 1 - index];
            }
        }
        
        return diagonal;
    }
    
  
    private Button createButton() {
        Button button = new Button("");
        button.setFont(Font.font("Monospaced", 40));

        // Use a lambda expression for the button click handler
        button.setOnAction(event -> {
            Button clickedButton = (Button) event.getSource();
            String buttonText = clickedButton.getText();

            // If the current button is not empty, don't update anything, just skip and continue
            if (!buttonText.equals("")) {
                return;
            }
            
            if (this.gameStatus == false){
                // Set up the turn text and update the board
                clickedButton.setText(this.players[this.currentPlayer]);
                this.turn.setText("Turn: " + players[1 - this.currentPlayer]);
                // Toggle player
                this.currentPlayer = 1 - this.currentPlayer;
            }
            
            this.gameStatus = isOver();
            
            // Check if the game is over
            if (this.gameStatus) {
               
                this.turn.setText("The end!"); 
                
            }
            
           
            
            
        });

        return button;
    }

    public static void main(String[] args) {
        
        launch(TicTacToeApplication.class);
    }

}
