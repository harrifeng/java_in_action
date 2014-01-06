package oj.mycode.vpn;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * MySolution Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>Jan 6, 2014</pre>
 */
public class MySolutionTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: isPrime(long num)
     */
    @Test
    public void testIsPrime() throws Exception {
        //TODO: Test goes here...
        MySolution ms = new MySolution();
        assertTrue(ms.isPrime(2));
        assertTrue(ms.isPrime(3));
        assertTrue(ms.isPrime(5));
        assertTrue(ms.isPrime(7));
        assertTrue(ms.isPrime(17));
        assertTrue(ms.isPrime(13));
        assertTrue(ms.isPrime(101));
        assertTrue(ms.isPrime(103));
        assertTrue(ms.isPrime(16785407));
        assertTrue(ms.isPrime(1889));

        assertFalse(ms.isPrime(0));
        assertFalse(ms.isPrime(1));
        assertFalse(ms.isPrime(4));
        assertFalse(ms.isPrime(91));
        assertFalse(ms.isPrime(123453));
        assertFalse(ms.isPrime(697));
        assertFalse(ms.isPrime(123456789));
        assertFalse(ms.isPrime(5467));

    }
}
