package tmp.jcip;

/**
 * Created by hfeng on 14-1-15.
 */
public class EscapeTest {
    public int getI() {
        return i;
    }

    private int i;

    public static void main(String[] args) {
        EscapeTest et = new EscapeTest();

        System.out.println(et.getI());
    }
}
