package oj.mycode.vpn;

/**
 * Created by hfeng on 1/6/14.
 */
public class MySolution {

  public boolean isPrime(long num) {
    if (num < 2) {
      return false;
    }
    /////////////////////////////////////////////////////////////
    // 1) Math.sqrt(NUM) is enougth !                          //
    // 2) Be carefull here, in JAVA, if (i < 2.1), it will run //
    //    for a third time.                                    //
    // 3) Also, long numbers should append a L at end:         //
    //    Math.sqrt(169123456789L);                            //
    /////////////////////////////////////////////////////////////
    for (long i = 2; i <= (long) Math.sqrt(num); i++) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }
}
