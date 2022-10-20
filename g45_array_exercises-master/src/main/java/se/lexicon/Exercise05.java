package se.lexicon;

import java.util.Arrays;

public class Exercise05 {

  /**
   * 5. Create a two-dimensional string array [2][2]. Assign values to the 2d array containing any Country and City.
   * Expected output:
   *              France Paris
   *              Sweden Stockholm
   */
  public static void ex5() {
    String array[][] = new String[][]{{"Stockholm", "Sweden"}, {"Delhi", "India"}};

    for (String[] str : array)
      System.out.println(Arrays.toString(str));


  }

}
