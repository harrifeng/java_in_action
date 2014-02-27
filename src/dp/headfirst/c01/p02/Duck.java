package dp.headfirst.c01.p02;

/**
 * Created by hfeng on 2/26/14.
 */
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void preformQuack() {
        quackBehavior.quack();
    }

    public void preformFly(){
        flyBehavior.fly();
    }

    public void swim() {
        System.out.println("swim");
    }

    abstract void display();

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }
}
