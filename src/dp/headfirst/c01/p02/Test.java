package dp.headfirst.c01.p02;

/**
 * Created by hfeng on 2/26/14.
 */
public class Test {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.preformFly();
        mallard.preformQuack();

        Duck rubber = new RubberDuck();
        rubber.preformFly();
        rubber.preformQuack();

        Duck model = new ModelDuck();
        model.preformFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.preformFly();
    }
}
