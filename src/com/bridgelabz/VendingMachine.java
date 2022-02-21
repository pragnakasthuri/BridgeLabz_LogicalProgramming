package com.bridgelabz;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        int userInput = readUserInput();
        printChangeAmount(userInput);
    }
    /**
     * @return Amount given by user
     */
    public static int readUserInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the change amount to be returned by the vending machine :");
        int changeAmount = scanner.nextInt();
        scanner.close();
        return changeAmount;
    }

    /**
     * @param amount
     */
    public static void printChangeAmount(int amount){
        Map<Integer, Integer> notesMap = new HashMap<>();
        notesMap = getDenomination(amount, notesMap);
        int noOfNotes = 0;
        for(Map.Entry<Integer, Integer> entry: notesMap.entrySet()) {
            noOfNotes+=entry.getValue();
            System.out.println(entry.getKey()+"Rs - "+entry.getValue()+" notes");
        }
        System.out.println("Total no. of notes: "+noOfNotes);
    }

    /**
     * @param amount
     * @param notesMap
     * @return Map
     */
    public static Map<Integer, Integer> getDenomination(int amount, Map<Integer, Integer> notesMap) {
        int[] notes = {1000,500,100,50,10,2,1};
        if (amount == 0) {
            return notesMap;
        } else {
            int note = Arrays.stream(notes).filter(note1 -> note1 <= amount).findFirst().getAsInt();
            if (notesMap.get(note) == null) {
                notesMap.put(note, 1);
            } else {
                notesMap.put(note, notesMap.get(note) + 1);
            }
            return getDenomination(amount - note, notesMap);
        }
    }
}
