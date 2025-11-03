package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        Dealership dealership = new Dealership("Barbie Benz", "123 Main St", "555-1234");


        dealership.addVehicle(new Vehicle(
                "VIN123",
                2023,
                "Barbie Toyota",
                "Camry",
                "Sedan",
                "Sparkly PinkyWhite",
                5000,
                25000.0
        ));

        dealership.addVehicle(new Vehicle(
                "VIN456",
                2019,
                " Barbie Honda",
                "Civic",
                "Sedan",
                "Pink + Black",
                30000,
                18000.0
        ));

        dealership.addVehicle(new Vehicle(
                "VIN789",
                2021,
                "Barbie Ford",
                "Explorer",
                "SUV",
                "Pink + Blue",
                15000,
                32000.0
        ));


        dealership.sellOrLeaseVehicle();
    }
}

