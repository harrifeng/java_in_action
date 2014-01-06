package algo;

import java.util.Scanner;

/**
 * Created by hfeng on 14-1-6.
 */
public class TestCode {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int v = in.nextInt();
            if (v == 11) {
                break;
            }
            System.out.println(v);
        }
    }
}
