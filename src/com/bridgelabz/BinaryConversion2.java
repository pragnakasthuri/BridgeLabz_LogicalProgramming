package com.bridgelabz;

import java.util.Scanner;

public class BinaryConversion2 {
    public static void main(String[] args) {
        int userInput = readUserInput();
        String binary = toBinary(userInput);
        swapNibblesAndFindNewNumber(binary);
    }

    private static void swapNibblesAndFindNewNumber(String binary) {
        String nibble1 = binary.substring(0, 4);
        String nibble2 = binary.substring(4);
        String newBinary = nibble2+nibble1;
        System.out.println("New number is: "+binaryToDecimal(Integer.parseInt(newBinary)));
    }

    static int binaryToDecimal(int n)
    {
        int num = n;
        int dec_value = 0;

        // Initializing base
        // value to 1, i.e 2^0
        int base = 1;

        int temp = num;
        while (temp > 0) {
            int last_digit = temp % 10;
            temp = temp / 10;

            dec_value += last_digit * base;

            base = base * 2;
        }

        return dec_value;
    }

    private static String toBinary(int userInput) {
        StringBuffer binary = new StringBuffer("");
        while (userInput > 0) {
            binary.append(userInput%2);
            userInput = userInput/2;
        }

        while(binary.length() < 8) {
            binary.append("0");
        }

        System.out.println("Binary representation of: "+userInput+" is: "+binary.reverse());
        return binary.reverse().toString();
    }

    private static int readUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your input");
        int userInput = scanner.nextInt();
        scanner.close();
        return userInput;
    }


}
