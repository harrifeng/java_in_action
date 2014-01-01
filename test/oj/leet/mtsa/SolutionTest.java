package test.oj.leet.mtsa;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import oj.leet.mtsa.*;

import static org.junit.Assert.assertEquals;

/**
 * Solution Tester.
 *
 * @author <Authors name>
 * @version 1.0
 */
public class SolutionTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: findMedianSortedArrays(int A[], int B[])
     */
    @Test
    public void testFindMedianSortedArrays() throws Exception {
        Solution solution = new Solution();
        int[] a = {1, 2};
        int[] b = {1, 1};
        final float delta = 0.0001F;
        assertEquals(1.0, solution.findMedianSortedArrays(a, b), delta);
    }


    /**
     * Method: findNth(int A[], int B[], int k)
     */
    @Test
    public void testFindNth() throws Exception {
        //TODO: Test goes here... 
        /* 
           try { 
           Method method = Solution.getClass().getMethod("findNth", int.class, int.class, int.class); 
           method.setAccessible(true); 
           method.invoke(<Object>, <Parameters>); 
           } catch(NoSuchMethodException e) { 
           } catch(IllegalAccessException e) { 
           } catch(InvocationTargetException e) { 
           } 
        */
    }

} 
