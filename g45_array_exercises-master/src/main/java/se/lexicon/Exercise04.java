package se.lexicon;

import java.util.Arrays;

public class Exercise04 {

    /**
     * 4. Write a program which will copy the elements of one array into another array.
     * Expected output:
     * Elements from first array: 1 15 20
     * Elements from second array: 1 15 20
     */
    public static void ex4() {
        int[] array = {1000, 3000, 5000, 7000, 9000};
        System.out.println("Array before copy");
        System.out.println(Arrays.toString(array));

        // Array copy using copyof method
        int[] newArray = Arrays.copyOf(array, array.length);
        System.out.println("_____________________________________");
        System.out.println("Copied Array");
        System.out.println(Arrays.toString(newArray));

    }

}
