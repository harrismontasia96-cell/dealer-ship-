package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Dealership dealership = new Dealership("AutoHub", "123 Main St", "555-1234");


        dealership.addVehicle(new Vehicle("VIN123", "Toyota", "Camry", 2023, 25000));
        dealership.addVehicle(new Vehicle("VIN456", "Honda", "Civic", 2019, 18000));

        dealership.sellOrLeaseVehicle();
    }
}

