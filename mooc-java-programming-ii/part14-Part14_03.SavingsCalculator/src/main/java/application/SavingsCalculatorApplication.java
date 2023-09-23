/*
This code is a Java application that calculates savings over time based on user input for monthly savings and interest rates. 
It uses JavaFX for the GUI components and displays the results in a line chart. 
The code is commented to explain each section's purpose and functionality. 
*/

package application;

// Importing necessary JavaFX classes
import java.util.ArrayList;
import java.util.List;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SavingsCalculatorApplication extends Application {

    // Declaring UI components
    private Slider monthlySlider;
    private Label monthlySavingValue;
    private Slider interestSlider;
    private Label interestRateValue;
    private BorderPane layout;
  
    // Declaring chart data series
    XYChart.Series monthlySavingChart;
    XYChart.Series monthlyWithInterestChart;
    
    // Constants for calculations
    private final int MONTH_IN_YEAR = 12;
    private final int YEARS = 30;

    @Override
    public void start(Stage window) {
        // Initializing chart data series
        monthlySavingChart = new XYChart.Series<>();
        monthlyWithInterestChart = new XYChart.Series<>();
        
        // Setting up the user interface
        setupUI();
        layout = new BorderPane();
        layout.setTop(createTopComponent());
        layout.setCenter(createLineChart());
        
        // Creating and setting the scene
        Scene view = new Scene(layout, 640, 480);
        window.setScene(view);
        window.show();
    }
    
    // Method to initialize UI components
    private void setupUI() {
        monthlySlider = new Slider(25, 250, 25);
        // Set slider properties
        monthlySlider.setSnapToTicks(true);
        monthlySlider.setShowTickLabels(true);
        monthlySlider.setShowTickMarks(true);
        monthlySlider.setBlockIncrement(500);
        
        monthlySavingValue = new Label("" + monthlySlider.getValue());
        
        interestSlider = new Slider(0, 10, 0);
        // Set slider properties
        interestSlider.setShowTickLabels(true);
        interestSlider.setShowTickMarks(true);
        
        interestRateValue = new Label("" + (int) interestSlider.getValue());
  
        // Set up listeners for slider changes
        handleSliderChange(false);
        
        monthlySlider.valueProperty().addListener((observable, oldValue, newValue) -> {
           handleSliderChange(false);
        });
        
        interestSlider.valueProperty().addListener((interestObservable, interestOldValue, interestValue) -> {
            handleSliderChange(true);
        });
    }
    
    // Method to handle slider changes and update charts
    private void handleSliderChange(boolean withInterest) {
        monthlySavingChart.getData().clear();
        monthlyWithInterestChart.getData().clear();

        try {
            double monthlyMoney =  Math.round(monthlySlider.getValue());
            monthlySavingValue.setText(String.valueOf(monthlyMoney));
            
            updateSaving(monthlyMoney, 0, monthlySavingChart);
            
            if(withInterest){
                double currentInterest = Math.round(interestSlider.getValue());
                interestRateValue.setText(String.valueOf(currentInterest));
                updateSaving(monthlyMoney, currentInterest, monthlyWithInterestChart);
            }
            
        } catch (NumberFormatException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    // Method to create the line chart
    private LineChart<Number, Number> createLineChart() {
        NumberAxis xAxis = new NumberAxis(0, 30, 1);
        NumberAxis yAxis = new NumberAxis();
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setAnimated(false);
        lineChart.setLegendVisible(false);
        lineChart.setTitle("Savings calculator");

        lineChart.getData().add(monthlySavingChart);
        lineChart.getData().add(monthlyWithInterestChart); 
        
        return lineChart;
    }
    
    // Method to create the top component (VBox with sliders and labels)
    private VBox createTopComponent() {
        BorderPane monthlySaving = new BorderPane();
        monthlySaving.setLeft(new Label("Monthly savings"));
        monthlySaving.setCenter(monthlySlider);
        monthlySaving.setRight(monthlySavingValue);
        monthlySaving.setPadding(new Insets(10));
        
        BorderPane interestRate = new BorderPane();
        interestRate.setLeft(new Label("Yearly interest rate"));
        interestRate.setCenter(interestSlider);
        interestRate.setRight(interestRateValue);
        interestRate.setPadding(new Insets(10));
        
        VBox topComponent = new VBox(monthlySaving, interestRate);
        return topComponent;
    }
   
    // Method to update the saving data for the charts
    private void updateSaving(double monthlyMoney, double interestRate,  XYChart.Series data) {
        
        data.getData().add(new XYChart.Data<>(0, 0.0));
        double savingEachYear = 0;
        
        for(int eachYear = 1; eachYear <= YEARS; eachYear++) {
            savingEachYear = calculateYearlySaving(savingEachYear, monthlyMoney, interestRate);
            data.getData().add(new XYChart.Data<>(eachYear, savingEachYear));
        }
    }
    
    // Method to calculate yearly saving with interest
    private double calculateYearlySaving(double totalSavings, double monthlyMoney, double yearlyInterestRate) {
        totalSavings += monthlyMoney * MONTH_IN_YEAR;
        double interest = totalSavings * (yearlyInterestRate / 100);
        totalSavings += interest;

        return totalSavings;
        
        
    }
    
    // Main method to launch the application
    public static void main(String[] args) {
        launch(SavingsCalculatorApplication.class);
    }
}
