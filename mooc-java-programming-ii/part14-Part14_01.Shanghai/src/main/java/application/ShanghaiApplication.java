package application;

import java.util.HashMap;
import java.util.Map;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;

public class ShanghaiApplication extends Application{
   
    @Override
    public void start(Stage window){
        // x and y axis for line chart
        NumberAxis xAxis = new NumberAxis(2006, 2018, 1);
        
        NumberAxis yAxis = new NumberAxis(0, 100, 5);
        // set the titles for the axes 
        xAxis.setLabel("Year");
        yAxis.setLabel("Ranking");
        
        // create line chart here 
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("University of Helsinki, Shanghai ranking");
        
       /*
        // Anonymous class initialization
          Map<Integer, Integer> values = new HashMap<>(){{
            put(2007, 73);
            put(2008, 68);
            put(2009, 72);
            put(2010, 72);
            put(2011, 74);
            put(2012, 73);
            put(2013, 76);
            put(2014, 73);
            put(2015, 67);
            put(2016, 56);
            put(2017, 56); 
        }};
        */
        Map<Integer, Integer> values = new HashMap<>();
        values.put(2007, 73);
        values.put(2008, 68);
        values.put(2009, 72);
        values.put(2010, 72);
        values.put(2011, 74);
        values.put(2012, 73);
        values.put(2013, 76);
        values.put(2014, 73);
        values.put(2015, 67);
        values.put(2016, 56);
        values.put(2017, 56);
        
        XYChart.Series data = new XYChart.Series();
        values.forEach((key, value) -> {
           
            data.getData().add(new XYChart.Data(key, value)); 
           
        });
        // and add the data set to the chart
        lineChart.getData().add(data);
        
        // create scene and show them here         
        Scene view = new Scene(lineChart, 640, 480);
        // display the line chart
        window.setScene(view);
        window.show();
    }
    public static void main(String[] args) {
       launch(ShanghaiApplication.class);
    }

}
