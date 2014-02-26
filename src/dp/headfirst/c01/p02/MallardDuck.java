package dp.headfirst.c01.p02;

/**
 * Created by hfeng on 2/26/14.
 */
public class MallardDuck extends Duck {
    void display() {
        System.out.println("MallardDuck in display");
    }
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
}
