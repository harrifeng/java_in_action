package dp.headfirst.c01.p03;

public class Test {

  public static void main(String[] args) {
    Character king = new King();
    king.useWeapon();
    king.setWeapon(new SwordBehavior());
    king.useWeapon();
    king.fight();
  }
}
