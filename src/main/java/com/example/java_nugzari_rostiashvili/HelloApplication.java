package com.example.java_nugzari_rostiashvili;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        PieChart pieChart = new PieChart();
        pieChart.setTranslateX(100);
        pieChart.setTranslateY(200);
        pieChart.setData(getData());
        Group root = new Group();

        //n4 gamotana
        root.getChildren().add(pieChart);

        Scene scene = new Scene(root,600,800, Color.GREEN);

        stage.setScene(scene);
        stage.setTitle("My App");

        stage.show();
    }

    public static void main(String[] args) {
        launch();
//        FlightsUtil.insert(new Flights("Paris","02-09-2023",150,230));

    }

    private ObservableList<PieChart.Data> getData(){
        ArrayList<String> destinations = new ArrayList<String>();
        ArrayList<Integer> seats = new ArrayList<Integer>();


        FlightsUtil.getAllFlights().stream().forEach(data -> destinations.add(data.getDestination()));
        FlightsUtil.getAllFlights().stream().forEach(data -> seats.add(data.getAmountOfSeats()));
        System.out.println(destinations);
        String dest1 = destinations.get(0);
        String dest2 = destinations.get(1);
        String dest3 = destinations.get(2);
        int seats1 = seats.get(0);
        int seats2 = seats.get(1);
        int seats3 = seats.get(2);


        ObservableList<PieChart.Data> observableList = FXCollections.observableArrayList(
                new PieChart.Data(dest1, seats1),
                new PieChart.Data(dest2,seats2),
                new PieChart.Data(dest3, seats3)

        );
        return observableList;
    }

}
