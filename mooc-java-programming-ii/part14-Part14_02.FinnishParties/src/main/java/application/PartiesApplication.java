package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class PartiesApplication extends Application {
    
    @Override
    public void start(Stage window){
        // x and y axis for line chart
        NumberAxis xAxis = new NumberAxis(1968, 2008, 4);
        
        NumberAxis yAxis = new NumberAxis(0, 30, 5);
        
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        
        lineChart.setTitle("Relative support of the parties");
        String fileName = "partiesdata.tsv";
        
        Map<String, Map<Integer, Double>> values = new HashMap<>();
        
        // read the files and store the data in Map
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            String[] years = null;
            
            while((line = reader.readLine()) != null){
                String[] piece = line.split("\t");
              
                // extract years first
                if (years == null){
                    years = piece;
                } else {
                    // extract the data from piece
                    Map<Integer, Double> partyData = new HashMap<>();
                    
                    for(int yearIndex = 1; yearIndex < piece.length; yearIndex++){
                        try {
                            double vote = Double.valueOf(piece[yearIndex]);
                            partyData.put(Integer.valueOf(years[yearIndex]), vote);    
                        } catch (NumberFormatException e) {
                            partyData.put(Integer.valueOf(years[yearIndex]), 0.0); 
                        }
                        
                    }
                    // store that data for piece[0] or the party name as key and partyData for year as key and double as votes
                    values.put(piece[0], partyData );
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        // read the data from Map and transform into lineChart
        values.keySet().stream().forEach(party -> {
            // a different data set for every party
            XYChart.Series data = new XYChart.Series();
            data.setName(party);
            
            // add the party's support numbers to the data set
            values.get(party).entrySet().stream().forEach(pair -> {
               data.getData().add(new XYChart.Data(pair.getKey(), pair.getValue()));
            });
            
            // and add the data set to the chart
            lineChart.getData().add(data);
        });
        
        // create scene and show them here         
        Scene view = new Scene(lineChart, 640, 480);
        // display the line chart
        window.setScene(view);
        window.show();
        
    }
    public static void main(String[] args) {
        launch(PartiesApplication.class);
    }

}
