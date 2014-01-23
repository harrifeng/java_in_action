package algo;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by hfeng on 14-1-6.
 */
public class TestCode {
    public static void main(String[] args) {
        HashMap<Integer, Foo> hm = new HashMap<Integer, Foo>();
        Foo foo = new Foo(15);
        Foo foo2 = new Foo(35);
        hm.put(1, foo);
        hm.put(2, foo2);

        for (Map.Entry<Integer, Foo> e : hm.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }

        foo.setVal(115);
        System.out.println(hm.entrySet());

    }
}

class Foo{
    public void setVal(int val) {
        this.val = val;
    }

    private int val;
    public Foo(int v) {
        val = v;
    }

    public String toString() {
        return "" + val;
    }
}
