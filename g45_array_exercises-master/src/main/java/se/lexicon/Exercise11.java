package se.lexicon;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise11 {

  /**
   * 11.Write a program that ask the user for an integer and repeat that
   * question until user give you a specific value that user already has been
   * told about as a message in your program. Store these values in an array
   * and print that array. After that reverse the array elements so that the
   * first element becomes the last element, the second element becomes
   * the second to last element, etc. Do not just reverse the order in which
   * they are printed. You need to change the way they are stored in the
   * array.
   */
  public static void ex11() {
    int[] array = new int[2];
    System.out.println("How many values do you want to enter in an array (minimum two values)");

    Scanner scan = new Scanner(System.in);
    int more = scan.nextInt();
    int temp1 = more - array.length;
    int temp2 = array.length + temp1;
    ;

    array = Arrays.copyOf(array, temp2);
    int[] revArray = Arrays.copyOf(array, array.length);
    System.out.println("Enter Array Elements");
    for (int i = 0; i < array.length; i++) {
      array[i] = scan.nextInt();
    }

    int i = array.length - 1;

    for (int j = 0; j < revArray.length; j++) {
      revArray[j] = array[i];
      i--;
    }
    System.out.println("Original Array");
    System.out.println(Arrays.toString(array));

    System.out.println("Reverse of array is ");
    System.out.println(Arrays.toString(revArray));

  }

}
