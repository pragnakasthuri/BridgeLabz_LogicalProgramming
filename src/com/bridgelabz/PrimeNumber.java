package com.bridgelabz;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        int userInput = readUserInput();
        System.out.println(userInput + " is " + (isPrime(userInput) ? "prime number" : "not a prime number"));
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
     * This is method is checking given number is prime or not
     * @param userInput
     * @return true if given number is prime, false otherwise
     */
    public static boolean isPrime(int userInput) {
        if (userInput <= 1) {
            return false;
        } else if (userInput == 2) {
            return true;
        } else if (userInput % 2 == 0) {
            return false;
        }
        for (int i = 3; i < userInput; i++) {
            if (userInput % i == 0) {
                return false;
            }
        }
        return true;
    }
}
