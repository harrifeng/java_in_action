package dp.headfirst.c01.p03;

public abstract class Character {

  WeaponBehavior weapon;

  void setWeapon(WeaponBehavior w) {
    this.weapon = w;
  }

  public void useWeapon() {
    weapon.useWeapon();
  }

  public abstract void fight();
}
