package dp.headfirst.c01.p02;

/**
 * Created by hfeng on 2/26/14.
 */
public class RedHeadDuck extends Duck {
    public RedHeadDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    public void display() {
        System.out.println("I am read headed duck");
    }
}
