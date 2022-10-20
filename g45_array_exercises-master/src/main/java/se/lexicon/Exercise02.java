package se.lexicon;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise02 {

    /**
     * 2. Create a program and create a method with name ‘indexOf’ which will find and return the index of an element in the array.
     * If the element does not exist your method should return -1 as value.
     * Expected output: Index position of number 5 is: 2.
     */
    public static void ex2() {
        int[] array = new int[5];
        int length = array.length;
        //Get user input
        System.out.println("Enter Array elements ");
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (i < length) {
            array[i] = scanner.nextInt();
            i++;
        }
        //Index search
        System.out.println("Enter an element to find its index ");
        Scanner sc = new Scanner(System.in);
        int Index = sc.nextInt();
        Arrays.sort(array);
        int index = Arrays.binarySearch(array, Index);


        if (index < 0)
            System.out.println("Element not found");
        else
            System.out.println("Element found at the index:" + index);


    }


}
