package com.bridgelabz;

import java.util.Scanner;

public class BinaryConversion {
    public static void main(String[] args) {
        int userInput = readUserInput();
        printBinaryRepresentation(userInput);
    }

    /**
     * @param userInput
     */
    private static void printBinaryRepresentation(int userInput) {
        StringBuffer binary = new StringBuffer("");
        while (userInput > 0) {
            binary.append(userInput%2);
            userInput = userInput/2;
        }
        System.out.println("Binary representation of: "+userInput+" is: "+binary.reverse());
    }

    /**
     * @return input given by the user as int
     */
    private static int readUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your input");
        int userInput = scanner.nextInt();
        scanner.close();
        return userInput;
    }


}
