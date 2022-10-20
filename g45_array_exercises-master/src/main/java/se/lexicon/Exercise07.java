package se.lexicon;

import java.util.Arrays;

public class Exercise07 {

    /**
     * 7. Write a program which will set up an array to hold 10 numbers and print out only the uneven numbers.
     * Expected output: Array: 1 2 4 7 9 12
     * Odd Array: 1 7 9
     */
    public static void ex7() {
        int array[] = new int[]{33, 54, 44, 12, 78, 59, 47, 65, 87, 99};
        int array1[] = new int[10];
        int index = 0;

        for (int Odd : array) {
            int temp = Odd % 2;
            if (temp != 0) {
                array1[index] = Odd;
                index++;
            }
        }
        System.out.println("Original Array:" +Arrays.toString(array));
        System.out.println("Odd Array:");
             for (int j:array1) {
                 if (j != 0){
                     System.out.print(j +"\t");
                 }

             }
        System.out.println("\n");

    }

}
