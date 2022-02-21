package com.bridgelabz;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        int userInput = readUserInput();
        System.out.println(userInput + " is " + (isPerfectNumber(userInput) ? "perfect number" : "not a perfect number"));
    }
    /**
     * This is designed to read input from user and return the same
     * @return userInput
     */
    public static int readUserInput() {

        /**
         * creating scanner object to take input from user
         * and storing the taken user input value in inputNumber
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number : ");
        int userInput = scanner.nextInt();
        scanner.close(); // closing the scanner object
        return userInput;
    }

    /**
     * This is method is checking given number is perfect or not
     * @param userInput
     * @return true if given number is perfect, false otherwise
     */
    public static boolean isPerfectNumber(int userInput) {
        /**
         * Iterating for loop to find the perfect number
         */
        int sumOfFactors = 0;
        for (int i = 1; i < userInput; i++) {
            if (userInput % i == 0) { // if we found divisible add it to sumOfFactors
                sumOfFactors+=i;
            }
        }
        return sumOfFactors == userInput; // check is someOfFactors is equal to given number
    }
}
