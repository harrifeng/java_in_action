package tmp.util;


import java.util.Collections;
import java.util.Stack;

public class TestCode {
    public final String[] STR = {"hello", "world"};

    public static void main(String[] args) {
        TestCode tc = new TestCode();
        System.out.println(tc.STR[0]);
        tc.STR[0] = "www";
        System.out.println(tc.STR[0]);


    }
}
