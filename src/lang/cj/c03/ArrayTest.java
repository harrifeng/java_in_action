package lang.cj.c03;

import java.util.Arrays;

public class ArrayTest {

  public static void main(String[] args) {
    int[] smallPrimes = {2, 3, 5, 7, 11, 13};
    System.out.println(Arrays.toString(smallPrimes));
    /////////////////////////////////////////////////////////////
    // be careful, the new int[] means a new array is created: //
    // They are short for                                      //
    // int[] anonymous = { 17, 19, 23, 29, 31, 37 };           //
    // smallPrimes = anonymous;                                //
    /////////////////////////////////////////////////////////////
    smallPrimes = new int[]{17, 19, 23, 29, 31, 37};
    System.out.println(Arrays.toString(smallPrimes));

    //////////////////////////////////////////////////////////////////
    // in java, the array name is actually a pointer, so the        //
    // following copy action really means to share contents with    //
    // new pointer                                                  //
    // +------------+                                               //
    // |smallPrimes |---------+                                     //
    // +------------+         |                                     //
    //                        +-------------> +------------+        //
    //                                        |    17      |        //
    //                        +-------------> +------------+        //
    // +------------+         |               |    19      |        //
    // |lucyNumbers |---------+               +------------+        //
    // +------------+                         |    23      |        //
    //                                        +------------+        //
    //                                        |    29      |        //
    //                                        +------------+        //
    //                                        |    31      |        //
    //                                        +------------+        //
    //                                        |    37      |        //
    //                                        +------------+        //
    //////////////////////////////////////////////////////////////////
    int[] luckyNumbers = smallPrimes;
    System.out.println("smallPrimes[3] is " + smallPrimes[3]);
    luckyNumbers[3] = 12;
    System.out.println("smallPrimes[3] is " + smallPrimes[3]);
    /////////////////////////////////////////////////////////////////////
    // If you actually want to copy all values of one array into a new //
    // array, you use the copyOf method in the Arrays class:           //
    /////////////////////////////////////////////////////////////////////
    int[] copiedLuckyNumbers = Arrays.copyOf(smallPrimes, smallPrimes.length);
    System.out.println("smallPrimes[3] is " + smallPrimes[3]);
    copiedLuckyNumbers[3] = 39;
    System.out.println("smallPrimes[3] is " + smallPrimes[3]);
    //////////////////////////////////////////////////////////////////////
    // A common use of this method is to increase the size of an array: //
    //////////////////////////////////////////////////////////////////////
    System.out.println("old length is " + luckyNumbers.length);
    luckyNumbers = Arrays.copyOf(luckyNumbers, 2 * luckyNumbers.length);
    System.out.println("new length is " + luckyNumbers.length);

    int[][] magicSquare =
        {
            {16, 3, 2, 13},
            {5, 10, 11, 8},
            {9, 6, 7, 12},
            {4, 15, 14, 1}
        };
    System.out.println(Arrays.deepToString(magicSquare));

    /////////////////////////////////////////////////////////////
    // java's array is pointers's collection, you can define a //
    // multidimensional arrays like following                  //
    // [[0],                                                   //
    //  [0, 0],                                                //
    //  [0, 0, 0],                                             //
    //  [0, 0, 0, 0],                                          //
    //  [0, 0, 0, 0, 0]]                                       //
    /////////////////////////////////////////////////////////////
    final int NMAX = 4;
    int[][] odds = new int[NMAX + 1][];
    for (int n = 0; n <= NMAX; n++) {
      odds[n] = new int[n + 1];
    }
    System.out.println(Arrays.deepToString(odds));

  }
}
