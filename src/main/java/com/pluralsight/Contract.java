package com.pluralsight;

public abstract class Contract {
    protected String DateOfContract;
    protected String Customername;
    protected String Vehiclesold;
    protected String Totalprice;
    protected String Monthlypayment;

    public String getDateOfContract() {
        return DateOfContract;
    }

    public String getCustomername() {
        return Customername;
    }

    public String getVehiclesold() {
        return Vehiclesold;
    }

    public String getTotalprice() {
        return Totalprice;
    }

    public String getMonthlypayment() {
        return Monthlypayment;
    }

    public void setDateOfContract(String dateOfContract) {
        DateOfContract = dateOfContract;
    }

    public void setCustomername(String customername) {
        Customername = customername;
    }

    public void setVehiclesold(String vehiclesold) {
        Vehiclesold = vehiclesold;
    }

    public void setTotalprice(String totalprice) {
        Totalprice = totalprice;
    }

    public void setMonthlypayment(String monthlypayment) {
        Monthlypayment = monthlypayment;
    }

    public Contract(String dateOfContract, String customername, String vehiclesold, String totalprice, String monthlypayment) {
        DateOfContract = dateOfContract;
        Customername = customername;
        Vehiclesold = vehiclesold;
        Totalprice = totalprice;
        Monthlypayment = monthlypayment;
    }
}
