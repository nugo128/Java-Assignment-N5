package com.example.java_nugzari_rostiashvili;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FlightsUtil {
    FlightsUtil(){}

    public static void createTable() {

        String createSql = "CREATE TABLE FLIGHTS_SCHEDULES (" +
                "ID INTEGER NOT NULL AUTO_INCREMENT, " +
                "DESTINATION VARCHAR(255), " +
                "DATE VARCHAR(255)," +
                "AMOUNT_OF_SEATS INTEGER NOT NULL," +
                "PRICE INTEGER NOT NULL,"+
                "PRIMARY KEY(ID))";

        try {
            JDBCUtil.getStatement().executeUpdate(createSql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Created table in given database...");

    }
    public static void insert(Flights flights) {

        String insertSql = "INSERT INTO FLIGHTS_SCHEDULES(DESTINATION, DATE, AMOUNT_OF_SEATS, PRICE) VALUES(" +
                "'" + flights.getDestination() + "', " +
                "'" + flights.getDate() + "', " +
                "'" + flights.getAmountOfSeats() + "', " +
                "" + flights.getPrice() + ")";

        try {
            JDBCUtil.getStatement().executeUpdate(insertSql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    public static List<Flights> getAllFlights() {

        String selectSql = "SELECT * FROM FLIGHTS_SCHEDULES";

        List<Flights> flights = new ArrayList<>();

        try {

            ResultSet resultSet = JDBCUtil.getStatement().executeQuery(selectSql);

            while (resultSet.next()) {

                flights.add(new Flights(
                        resultSet.getString("DESTINATION"),
                        resultSet.getString("DATE"),
                        resultSet.getInt("AMOUNT_OF_SEATS"),
                        resultSet.getInt("PRICE")
                ));

            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return flights;

    }
    public static int totalFlightPrice(Flights flights){
        return flights.getPrice()*flights.getAmountOfSeats();
    }


}
