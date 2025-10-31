package com.pluralsight;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Dealership {
    private String name;
    private String address;
    private String phone;
    private List<Vehicle> inventory = new ArrayList<>();


    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public void sellOrLeaseVehicle() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter vehicle VIN: ");
        String date = scanner.nextLine();
        String vinInput = scanner.nextLine();

        Vehicle vehicleFound = findVehicleByVin(vinInput);

        if (vehicleFound == null) {
            System.out.println("Vehicle not found!");
            return;
        }

        System.out.println("Enter date (YYYY-MM-DD): ");
        String name = scanner.nextLine();

        System.out.println("Enter customer name: ");
        String email = scanner.nextLine();

        System.out.println("Enter customer email: ): ");
        String vin = scanner.nextLine();

        System.out.println("Is this a sale or lease? (S/L): ");
        String choice = scanner.nextLine().toUpperCase();

        Contract contract;

        if (choice.equals("S")) {
            System.out.println("Does the customer want to finance? (Y/N): ");
            boolean finance = scanner.nextLine().equalsIgnoreCase("Y");

            if (choice.equals("M")) {
                System.out.println("customer wants to finance + SalesContract: ");
                Contract = new SalesContract(date, customerName, customerEmail, vehicleFound, financeChoice);
                String Contract = scanner.nextLine();

            } else if (choice.equals("L")) {
                int currentYear = LocalDate.now().getYear();
                int vehicleAge = currentYear - vehicleFound.getYear();

                if (vehicleAge > 3) {
                    System.out.println("Sorry, vehicles older than 3 years cannot be leased.");
                    return;

                }
                contract = new LeaseContract(date, name, email, vehicle);

            } else {
                System.out.println("Invalid choice! Please enter 'S' or 'L'.");
                return;
            }

            System.out.println("----------------------------------");
            System.out.println("CONTRACT SUMMARY");
            System.out.println("Type: " + contract.getContractType());
            System.out.println("Customer: " + contract.getCustomerName());
            System.out.println("Vehicle: " + contract.getMake() + " " + contract.getModel());
            System.out.println("Total Price: $" + contract.getTotalPrice());
            System.out.println("Monthly Payment: $" + contract.getMonthlyPayment());
            System.out.println("----------------------------------");
        }


        public Vehicle findVehicleByVin (String vin){
            for (Vehicle v : inventory) {
                Dealership inventory = fileManager.getDealership();
                if (v.getVin().equalsIgnoreCase(vin)) {
                    return v;
                }
            }
            return null;
        }

        public void addVehicle (Vehicle v){
            inventory.add(v);
        }
        public void removeVehicle (Vehicle v){
            inventory.remove(v);
        }
        public List<Vehicle> getAllVehicles () {
            return inventory;
        }

        public List<Vehicle> getVehiclesByPrice ( double min, double max){
            List<Vehicle> matches = new ArrayList<>();
            for (Vehicle v : inventory) {
                if (v.getPrice() >= min && v.getPrice() <= max) {
                    matches.add(v);
                }
            }
            return matches;
        }

        public String getName () {
            return name;
        }
        public String getAddress () {
            return address;
        }
        public String getPhone () {
            return phone;
        }
    }
}







