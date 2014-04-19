package lang.tij4.holding;

import java.util.*;

public class Statistics {
    public static void main(String[] args) {
        Random rand = new Random(47);
        Map<Integer, Integer> m =
            new HashMap<Integer, Integer>();
        for (int i = 0; i < 10000; i++) {
            // Produce a number between 0 and 20:
            int r = rand.nextInt(20);
            Integer freq = m. get(r);
            m.put(r, freq == null ? 1 : freq + 1);
        }
        System.out.println(m);
    }
}

/////////////////////////////////////////////////////////////
// <===================OUTPUT===================>          //
// {0=481, 1=502, 2=489, 3=508, 4=481, 5=503, 6=519, \     //
//  7=471, 8=468, 9=549, 10=513, 11=531, 12=521, 13=506, \ //
//  14=477, 15=497, 17=509, 16=533, 19=464, 18=478}        //
/////////////////////////////////////////////////////////////
