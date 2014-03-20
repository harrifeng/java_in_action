package tmp.jcip;

/**
 * Created by hfeng on 14-1-15.
 */
public class EscapeTest {

  private int i;

  public static void main(String[] args) {
    EscapeTest et = new EscapeTest();

    System.out.println(et.getI());
  }

  public int getI() {
    return i;
  }
}
