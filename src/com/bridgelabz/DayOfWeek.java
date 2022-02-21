package com.bridgelabz;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        int[] userInput = readUserInput();
        System.out.println("Day for the given input: "+printDayOfWeek(userInput));
    }

    private static int[] readUserInput() {
        int[] userInput = new int[3];
        /**
         * Using the Scanner class to take inputs from user as
         * date D month M and year Y and storing them in date,month and year variables
         * respectively
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter Date from 1 to 31 :");
        userInput[0] = scanner.nextInt();
        System.out.println("Please enter Month from 1 to 12 :");
        userInput[1] = scanner.nextInt();
        System.out.println("Please enter Year :");
        userInput[2] = scanner.nextInt();
        scanner.close();

        return userInput;
    }

    /**
     * @param userInput
     * @return
     */
    public static String printDayOfWeek(int[] userInput){
        int date = userInput[0];
        int month = userInput[1];
        int year = userInput[2];
        int y0 = (year - (14 - month))/12;
        int x = y0 + (y0/4) - (y0/100) + (y0/400);
        int m0 = (month + 12) * ((14 - month)/12) - 2;
        int day = (((date + x + (31 * m0))/12)) % 7;
        String dayOfTheWeek = "";
        /**
         * Using switch case to generate day for the given date
         */
        switch (day){
            case 0: dayOfTheWeek = "Sunday";
            break;
            case 1: dayOfTheWeek = "Monday";
            break;
            case 2: dayOfTheWeek = "Tuesday";
            break;
            case 3: dayOfTheWeek = "Wednesday";
            break;
            case 4: dayOfTheWeek = "Thursday";
            break;
            case 5: dayOfTheWeek = "Friday";
            break;
            case 6: dayOfTheWeek = "Saturday";
            break;
        }
        return dayOfTheWeek;
    }
}
