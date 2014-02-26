package dp.headfirst.c01.p01;

/**
 * Created by hfeng on 2/26/14.
 */
public class Test {

    public static void main(String[] args) {
        MallardDuck md = new MallardDuck();
        md.display();
        Duck rd = new RedheadDuck();
        rd.display();

        rd.quack();

        Duck rub = new RubberDuck();
        rub.quack();

        Duck re = new DecoyDuck();
        re.quack();
        re.fly();
    }

}
