package tmp.jcip;

import java.math.BigInteger;
import java.util.Arrays;

/**
 * List 3.12
 */

public class OneValueCache {

  private final BigInteger lastNumber;
  private final BigInteger[] lastFactors;

  public OneValueCache(BigInteger i, BigInteger[] factors) {
    lastNumber = i;
    lastFactors = Arrays.copyOf(factors, factors.length);
  }

  public static void main(String[] args) {

    int[] arr = {1, 2, 3};
    System.out.println(Arrays.toString(arr));
    int[] arr2 = Arrays.copyOf(arr, arr.length);
    arr2[2] = 222;
    System.out.println(Arrays.toString(arr2));
  }

  public BigInteger[] getLastFactors(BigInteger i) {
    if (lastNumber == null || !lastNumber.equals(i)) {
      return null;
    } else {
      return Arrays.copyOf(lastFactors, lastFactors.length);
    }
  }
}
