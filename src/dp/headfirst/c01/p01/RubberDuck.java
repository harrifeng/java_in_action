package dp.headfirst.c01.p01;

/**
 * Created by hfeng on 1/7/14.
 */
public class RubberDuck extends Duck {

  public RubberDuck() {
    super("rubber");
  }

  public void display() {
    System.out.println("Looks like a rubberduck");
  }

  public void quack() {
    System.out.println("Can not quack, Squeak");
  }

  public void fly() {
    // do nothing
  }
}
