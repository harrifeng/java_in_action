package dp.headfirst.c01.p03;



public class King extends Character {
    public King() {
        weapon = new KnifeBehavior();
    }
    @Override
    public void fight() {
        System.out.println("King fights with");
    }
}
