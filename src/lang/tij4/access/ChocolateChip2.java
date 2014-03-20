package lang.tij4.access;

import lang.tij4.access.cookie2.Cookie;

public class ChocolateChip2 extends Cookie {

  public ChocolateChip2() {
    System.out.println("ChocolateChip2 ctor");
  }

  public static void main(String[] args) {
    ChocolateChip2 x = new ChocolateChip2();
    ///////////////////////////////
    // can not use following way //
    // Cookie ck = new Cookie(); //
    // ck.bite();                //
    ///////////////////////////////
    x.chomp();
  }

  public void chomp() {
    bite();
  }
}
////////////////////////////////////////////////////
// <===================OUTPUT===================> //
// Cookie ctor                                    //
// ChocolateChip2 ctor                            //
// bite                                           //
////////////////////////////////////////////////////
