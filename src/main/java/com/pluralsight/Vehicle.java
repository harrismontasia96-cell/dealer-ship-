package com.pluralsight;

public class Vehicle {
    private int findVehicleByvin;
    private int year;
    private String make;
    private String model;
    private String vehicleType;
    private String color;
    private int odometer;
    private double price;


    public Vehicle(int findVehicleByvin, int year, String make, String model, String vehicleType, String color, int odometer, double price) {
        this.findVehicleByvin = findVehicleByvin;
        this.year = year;
        this.make = make;
        this.model = model;
        this.vehicleType = vehicleType;
        this.color = color;
        this.odometer = odometer;
        this.price = price;
    }
    public int getFindVehicleByvin() {
        return findVehicleByvin;
    }

    public double getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public String getColor() {
        return color;
    }

    public int getOdometer() {
        return odometer;
    }

    @Override
    public String toString() {
        return String.format("%d | %d | %s | %s | %s | %s | %d miles | $%.2f",
                findVehicleByvin, year, make, model, vehicleType, color, odometer, price);
    }
}

