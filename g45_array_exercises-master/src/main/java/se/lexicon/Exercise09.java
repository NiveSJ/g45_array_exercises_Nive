package se.lexicon;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise09 {

    /**
     * 9. Write a method which will add elements in an array.
     * Remember that arrays are fixed in size so you need to come up with a
     * solution to “expand” the array
     */
    public static void ex9() {

        int[] array = new int[4];
        Scanner scan = new Scanner(System.in);
        System.out.println("Expand array demo.Enter array values");
        for (int get = 0; get < array.length; get++) {
            array[get] = scan.nextInt();
        }


        System.out.println("For more values, enter how many numbers do you want to enter else press 0");

        int more = scan.nextInt();
        if (more != 0) {
            int[] newArray = Arrays.copyOf(array, array.length + more);
            System.out.println("Enter the values");

            for (int i = array.length; i < newArray.length; i++) {
                newArray[i] = scan.nextInt();
            }
            System.out.println("Original Array" + Arrays.toString(array));

            System.out.println("Expanded array" + Arrays.toString(newArray));
        } else {
            System.out.println("Array values");
            System.out.println(Arrays.toString(array));

        }


    }

}
