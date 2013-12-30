package cj.c03;
import java.util.*;

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
        smallPrimes = new int[] {17, 19, 23, 29, 31, 37};
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
    }
}
