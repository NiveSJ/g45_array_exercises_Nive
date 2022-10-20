package se.lexicon;

public class Exercise12 {

  /**
   * 12.Write a program which will print the diagonal elements of two dimensional array.
   * Expected output: 1 4 9
   */
  public static void ex12() {
    int[][] twodArray = new int[][]{{6, 3, 4}, {1, 2, 5,}, {7, 8, 9}};

    System.out.println("2D Array ");
    for (int i = 0; i < twodArray.length; i++) {
      for (int j = 0; j < twodArray.length; j++) {
        System.out.print(twodArray[i][j] + "\t");
      }
      System.out.println("\n");
    }

    int i = 0, j = 0;
    System.out.println("Diagonal Elements");
    while (i < twodArray.length && j < twodArray.length) {
      System.out.print(twodArray[i][j]+ "\t");
      i++;
      j++;

    }
    System.out.println("\n");
  }

}
