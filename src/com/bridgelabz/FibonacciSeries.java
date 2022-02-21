/*Fibonacci series is a special type of series in which the next term is the sum of the
previous two terms. For example, if 0 and 1 are the two previous terms in a series, then
the next term will be 1(0+1)*/
package com.bridgelabz;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        /**
         * Asking user to enter till how many numbers the fibonacci series be printed
         * and storing it in userInput.
         */
        System.out.println("Please enter a number :");
        int userInput = inputScanner.nextInt();
        /**
         * Taking first number as 0 and second number as 1
         *  and storing in firstNum and secondNum.
         */
        int firstNum = 0;
        int secondNum = 1;
        for(int i=1; i<=userInput; i++){
            System.out.print(firstNum +"  ");
            // logic for fibonacci series(0 1  1  2  3  5  8....)
            int nextNum  = firstNum + secondNum;
            firstNum = secondNum;
            secondNum =nextNum;
        }
        inputScanner.close(); // closing the scanner object
    }
}
