package com.pluralsight;

public class SalesContract extends Contract {
    private static final double SALES_TAX_RATE = 0.05;
    private static final double RECORDING_FEE = 100;
    private static final double PROCESSING_FEE_UNDER_10K = 295;
    private static final double PROCESSING_FEE_OVER_10K = 495;

    private boolean finance;

    public SalesContract(String date, String customerName, String customerEmail,
                         Vehicle vehicleSold, boolean finance) {
        super(date, customerName, customerEmail, vehicleSold);
        this.finance = finance;
    }
    @Override
    public double getTotalPrice() {
        double price = vehicleSold.getPrice();
        double salesTax = price * SALES_TAX_RATE;
        double processingFee = price < 10000 ? PROCESSING_FEE_UNDER_10K : PROCESSING_FEE_OVER_10K;

        return price + salesTax + RECORDING_FEE + processingFee;
    }
    @Override
    public double getMonthlyPayment() {
        if (!finance) {
            return 0.0;
        }

        double principal = getTotalPrice();
        double rate;
        int months;

        if (vehicleSold.getPrice() >= 10000) {
            rate = 0.0425;
            months = 48;
        } else {
            rate = 0.0525;
            months = 24;
        }

        double monthlyRate = rate / 12.0;
        return (principal * monthlyRate) / (1 - Math.pow(1 + monthlyRate, -months));
    }
}




