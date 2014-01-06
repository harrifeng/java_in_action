package algo;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by hfeng on 14-1-6.
 */
public class TestCode {
    public static boolean isPrime(long num) {

        if (num < 2) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
