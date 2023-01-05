package com.example.java_nugzari_rostiashvili;

public class Flights {
    private String destination;
    private String date;
    private int amountOfSeats;
    private int price;

    public Flights(String destination, String date, int amountOfSeats, int price) {
        this.destination = destination;
        this.date = date;
        this.amountOfSeats = amountOfSeats;
        this.price = price;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getAmountOfSeats() {
        return amountOfSeats;
    }

    public void setAmountOfSeats(int amountOfSeats) {
        this.amountOfSeats = amountOfSeats;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Flights{" +
                "destination='" + destination + '\'' +
                ", date='" + date + '\'' +
                ", amountOfSeats=" + amountOfSeats +
                ", price=" + price +
                '}';
    }
}
