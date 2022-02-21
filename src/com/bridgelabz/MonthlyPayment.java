package com.bridgelabz;

import java.util.Scanner;

public class MonthlyPayment {
    public static void main(String[] args) {
        /**
         * Creating the scanner class to take 3 inputs from user
         * as principal amount,rate of interest and Number of years
         * and storing in principalAmount,rateOfInterest and numberOfYears respectively.
         */
        Scanner inputScanner = new Scanner(System.in);
        System.out.println(" Please enter Principal amount :");
        int principalAmount = inputScanner.nextInt();

        System.out.println("Please enter Rate Of Interest :");
        int rateOfInterest = inputScanner.nextInt();

        System.out.println("Please enter Number Of Years :");
        int numberOfYears = inputScanner.nextInt();
        inputScanner.close();
        System.out.println("Monthly Payment : "+monthlyPayment(principalAmount,rateOfInterest,numberOfYears));
    }

    /**
     * @param principalAmount,rateOfInterest,numberOfYears
     * @return returns Monthly Payment
     */
    public static double monthlyPayment(int principalAmount,int rateOfInterest,int numberOfYears) {

        double r = (double) rateOfInterest / (12 * 100);
        double monthlyPayment = (principalAmount * r) / (1 - (int) (Math.pow((1 + r),(-12 * numberOfYears))));
        return monthlyPayment;
    }
}






