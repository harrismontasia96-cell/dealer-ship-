package com.pluralsight;

public class LeaseContract extends Contract {
    private static final double INTEREST_RATE = 0.04;
    private static final double LEASE_TERM_MONTHS = 36;

    public LeaseContract(String date, String customerName, String customerEmail,
                         Vehicle vehicleSold) {
        super(date, customerName, customerEmail, vehicleSold);
    }

    @Override
    public double getTotalPrice() {
        return vehicleSold.getPrice() * 0.6;
    }
    @Override
    public double getMonthlyPayment() {
        double leasePrice = getTotalPrice();
        double monthlyRate = INTEREST_RATE / 12;
        return (leasePrice * monthlyRate) / (1 - Math.pow(1 + monthlyRate, -LEASE_TERM_MONTHS));
    }
}

