package dp.headfirst.c01.p01;

/**
 * Created by hfeng on 1/7/14.
 */
public abstract class Duck {

  private String name;

  public Duck(String n) {
    this.name = n;
  }

  public String getName() {
    return this.name;
  }

  public void quack() {
    System.out.println("quack");
  }

  public void swim() {
    System.out.println("swim");
  }

  public void fly() {
    System.out.println("fly");
  }

  public abstract void display();
}
