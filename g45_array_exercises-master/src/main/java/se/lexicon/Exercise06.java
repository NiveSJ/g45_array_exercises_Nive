package se.lexicon;

import java.text.DecimalFormat;
import java.util.Arrays;

public class Exercise06 {

    /**
     * 6. Write a program which will set up an array to hold the next values in this order: 43, 5, 23, 17, 2, 14 and print the average of these 6 numbers.
     * Expected output: Average is: 17.3
     */
    public static void ex6() {

        double temp = 0;
        double array[] = new double[]{43, 5, 23, 17, 2, 14};
        Double Average = 0.0;
        DecimalFormat df = new DecimalFormat("0.0");

        int len = array.length;

        for (double arr : array) {
            temp += arr;
        }

        Average = temp / len;
        System.out.println("Array" + Arrays.toString(array));
        System.out.printf("Average of Array is" + " " + df.format(Average)+"\t");


    }

}
