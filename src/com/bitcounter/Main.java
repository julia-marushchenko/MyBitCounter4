// Given a positive integer n, count the total number of set bits in binary representation of all numbers from 1 to n.
// Source: Amazon Interview Question

package com.bitcounter;

//Main class
public class Main {

    // Method to count 1s in number
    public static int bitCounter(int number){
        // Local variable to store number of 1s
        int count = 0;
        while (number > 0){
            number &= (number - 1);
            count++;
        }
        return count;
    }

    // Method to count 1s in set of numbers
    public static int setBitCounter(int number){
        int counter = 0;
        for (int index = 0; index <= number; index++){
            counter += bitCounter(number);
        }
        return counter;
    }

    // Main method to run java program
    public static void main(String[] args) {

        // Calling method setBitCounter for 3
        System.out.println(setBitCounter(3));
    }
}