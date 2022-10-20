package se.lexicon;

import java.util.Arrays;

public class Exercise03 {

    /**
     * 3. Write a program which will sort string array.
     * Expected output:
     * String array: [Paris, London, New York, Stockholm]
     * Sort string array: [London, New York, Paris, Stockholm]
     */
    public static void ex3() {
        String[] array = {"Copenhagen", "Alaska", "Oslo", "Helsinki", "Berlin", "Rome"};
        System.out.println("Input Array");
        System.out.println(Arrays.toString(array));

        Arrays.sort(array);

        System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(array));

    }


}
