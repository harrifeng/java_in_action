package lang.tij4.operators;

public class Overflow {

  public static void main(String[] args) {
    int big = Integer.MAX_VALUE;
    System.out.println("big = " + big);
    int bigger = big * 4;
    System.out.println("bigger = " + bigger);
  }
}

//////////////////////
// Output===>       //
// big = 2147483647 //
// bigger = -4      //
//////////////////////
