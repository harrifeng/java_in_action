package tmp.util;

import java.math.BigInteger;
import java.util.Arrays;

public class OneValueCache {
    private final BigInteger lastNumber;
    private final BigInteger[] lastFactors;

    public OneValueCache(BigInteger i, BigInteger[] factors) {
        lastNumber = i;
        lastFactors = Arrays.copyOf(factors, factors.length);
    }

    public BigInteger[] getFactors(BigInteger i) {
        if (lastNumber == null || !lastNumber.equals(i)) {
            return null;
        } else {
            return Arrays.copyOf(lastFactors, lastFactors.length);
        }
    }

    public static void main(String[] args) {
        BigInteger[] tmpB = new BigInteger[] {BigInteger.ONE, BigInteger.TEN};
        OneValueCache ovc = new OneValueCache(BigInteger.ONE, tmpB);

        System.out.println(Arrays.toString(ovc.getFactors(BigInteger.ONE)));
    }
}
