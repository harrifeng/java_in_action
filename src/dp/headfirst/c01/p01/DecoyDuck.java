package dp.headfirst.c01.p01;

/**
 * Created by hfeng on 1/7/14.
 */
public class DecoyDuck extends Duck {

  public DecoyDuck() {
    super("decoy");
  }

  public void display() {
    System.out.println("Looks like decoyduck");
  }

  public void quack() {
    // do nothing
    System.out.println("override, do nothing");
  }

  public void fly() {
    // do nothing
    System.out.println("override, do nothing");
  }
}
