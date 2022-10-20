package se.lexicon;

public class Exercise10 {

  /**
   * 10.Write a program which will represent multiplication table stored in multidimensional array.
   * Hint: You have two-dimensional array with values
   * [[1,2,3,4,5,6,7,8,9,10], [1,2,3,4,5,6,7,8,9,10]]
   */
  public static void ex10() {
    int[][] table = new int[][]{{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}};
    int row = 0;
    for (int i = 0; i < table[row].length; i++) {
      int f1 = table[row][i];
      System.out.println();

      for (int j = 0; j < table[row].length; j++) {
        int f2 = table[row][j];
        System.out.print(" " + (f1 * f2)+ "\t");
      }

    }


  }

}
