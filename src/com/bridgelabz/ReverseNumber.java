package com.bridgelabz;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        int userInput = readUserInput();
        System.out.println("Reverse of a given number :" + reverseNumber(userInput));
    }

    /**
     * @return The input number given by the user
     */
    public static int readUserInput() {
        /**
         * Creating the scanner object to take input from user and storing in userInput variable
         */
        Scanner inputScanner = new Scanner(System.in);
        System.out.println(" Please enter a number :");
        int userInput = inputScanner.nextInt();
        inputScanner.close();
        return userInput;
    }

    /**
     * @param userInput
     * @return returns reverse of a number
     */
    public static int reverseNumber(int userInput) {
        int reverseNumber =0;
        /**
         * Using while loop to check userInput != 0 and
         * compute to get the reverse of a number
         */
        while (userInput != 0){
            int remainder = userInput % 10;
            reverseNumber = (reverseNumber * 10) + remainder;
            userInput = userInput / 10;
        }
        return  reverseNumber;
    }
}




