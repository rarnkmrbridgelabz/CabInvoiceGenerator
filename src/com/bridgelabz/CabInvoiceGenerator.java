package com.bridgelabz;

import java.util.Scanner;

public class CabInvoiceGenerator {
    static final double COST_PER_KILOMETER = 10;
    static final double COST_PER_MINUTE = 1;
    static Scanner scanner = new Scanner(System.in);
    static double result;
    static final double MINIMUM_FARE = 5;

    public static void main(String[] args) {
        double distance1 = 2;
        double time1 = 5;
        CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();
        System.out.println(cabInvoiceGenerator.invoiceGenerator(distance1,time1));
        Rides[] rides = {new Rides(2.0,5),
                new Rides(0.1,1)};
        System.out.println(cabInvoiceGenerator.multipleInvoiceGenerator(rides));
    }
    double invoiceGenerator(double distance, double time) {
        double fare = COST_PER_KILOMETER * distance + time * COST_PER_MINUTE;
        if (fare < MINIMUM_FARE)
            return MINIMUM_FARE;
        else
            return fare;
    }

    double multipleInvoiceGenerator(Rides[] rides){
        double fare = 0.0;
        for (Rides rides1: rides) {
            fare = COST_PER_KILOMETER * rides1.distance + rides1.time * COST_PER_MINUTE;
        }
        return fare;
    }
}
