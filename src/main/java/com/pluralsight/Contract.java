package com.pluralsight;

public abstract class Contract {
    protected String contractType;
    protected String DateOfContract;
    protected String Customername;
    protected String Customeremail;
    protected int findvehicleByVin;
    protected int year;
    protected String make;
    protected String model;
    protected String vehicleType;
    protected String color;
    protected double odometer;
    protected String Vehiclesold;
    protected int Totalprice;
    protected double Monthlypayment;


    public Contract(String contractType,String Dateofcontract, String customerName,
                    String customerEmail, int vehicleVin, int year,
                    String make, String model, String vehicleType,
                    String color, double odometer,Vehicle vehicleSold) {
        this.DateOfContract = DateOfContract;
        this.Customername = Customername;
        this.Customeremail = "";
        this.findvehicleByVin = findvehicleByVin;
        this.year = year;
        this.make = make;
        this.model = model;
        this.vehicleType = vehicleType;
        this.color = color;
        this.odometer = odometer;
        this.Vehiclesold = Vehiclesold;
        this.Totalprice = Totalprice;
        this.Monthlypayment = Monthlypayment;

    }
    public abstract double getTotalPrice();
    public abstract double getMonthlyPayment();

    public String getContractType() {
        return contractType;
    }

    public String getDateOfContract() {
        return dateOfContract;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public int getfindVehicleByVin() {
        return findvehicleByVin;
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

    public double getOdometer() {
        return odometer;
    }

    public String getVehicleSold() {
        return vehicleSold;
    }

    public double getTotalPriceValue() {
        return totalPrice;
    }

    public double getMonthlyPaymentValue() {
        return monthlyPayment;
    }


    public void setDateOfContract(String dateOfContract) {
        this.dateOfContract = dateOfContract;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void setVehicleSold(String vehicleSold) {
        this.vehicleSold = vehicleSold;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setMonthlyPayment(double monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }
}






