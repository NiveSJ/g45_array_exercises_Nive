package se.lexicon;

import java.util.Arrays;

public class Exercise01 {

    /**
     * 1. Write a program which will store elements in an array of type ‘int’ and
     * print it out.
     * Expected output: 11 23 39 etc.
     */
    public static void ex1() {
        int[] array = new int[]{14, 15, 16, 17};
        System.out.println("Program to print integer array content");
        for (int numbers : array)
            System.out.println(numbers);
    }


}
