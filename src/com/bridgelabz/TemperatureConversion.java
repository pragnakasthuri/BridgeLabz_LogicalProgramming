package com.bridgelabz;

import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        /**
         * Using Scanner class to take the input from user and
         * storing it in chooseNumber to choose type of conversion.
         */
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please choose type of conversion \n 1.Fahrenheit to Celsius  \n 2.Celsius to Fahrenheit");
        int chooseNumber = userInput.nextInt();
        /**
         * Initializing two variables celsiusTemperature and fahrenheitTemperature
         * and using switch case choosing the type of conversion the user wants
         * and converting using formulae.
         */
        double celsiusTemperature ,fahrenheitTemperature ;

        switch (chooseNumber){
            case 1:
                System.out.println("Please enter Fahrenheit Temperature: ");
                fahrenheitTemperature = userInput.nextDouble();
                celsiusTemperature = (fahrenheitTemperature - 32) * 5 / 9;
                System.out.println("Celsius Temperature : " +celsiusTemperature);
                break;
            case 2:
                System.out.println("Please enter Celsius Temperature: ");
                celsiusTemperature = userInput.nextDouble();
                fahrenheitTemperature = (celsiusTemperature * 9)/5 + 32;
                System.out.println("Fahrenheit Temperature :" +fahrenheitTemperature);
                break;
            default:
                System.out.println("Please enter valid choice number: ");
        }
        userInput.close();
    }
}
