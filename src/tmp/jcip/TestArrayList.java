package tmp.jcip;

import java.util.ArrayList;

/**
 * Created by hfeng on 14-1-26.
 */
public class TestArrayList {


    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(1);
        al.add(2);
        al.add(3);

        ArrayList<Integer> al2 = new ArrayList<Integer>();
        al2.add(1);
        al2.add(2);
        al2.add(32);

        System.out.println(al);
        System.out.println(al2);

        al.removeAll(al2);
        System.out.println(al);
        System.out.println(al2);

    }

}
