package dp.headfirst.c01.p02;

/**
 * Created by hfeng on 2/26/14.
 */
public class RubberDuck extends Duck{
    public RubberDuck() {
        quackBehavior = new Squeak();
        flyBehavior = new FlyNoWay();
    }
    public void display() {
        System.out.println("I am rubber duck");
    }
}
