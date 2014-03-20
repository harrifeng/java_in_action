package lang.tij4.operators;

import java.util.Random;

public class Bool {

  public static void main(String[] args) {
    Random rand = new Random(47);
    int i = rand.nextInt(100);
    int j = rand.nextInt(100);

    System.out.println("i =" + i);
    System.out.println("j =" + j);
    System.out.println("(i > j) =" + (i > j));
    System.out.println("(i < j) =" + (i < j));
    System.out.println("(i >= j) =" + (i >= j));
    System.out.println("(i <= j) =" + (i <= j));
    System.out.println("(i == j) =" + (i == j));
    System.out.println("(i != j) =" + (i != j));
    System.out.println("((i < 10) && (j < 10)) =" + ((i < 10) && (j < 10)));
    System.out.println("((i < 10) || (j < 10)) =" + ((i < 10) || (j < 10)));
  }
}

///////////////////////////////////
// Output===>                    //
// i =58                         //
// j =55                         //
// (i > j) =true                 //
// (i < j) =false                //
// (i >= j) =true                //
// (i <= j) =false               //
// (i == j) =false               //
// (i != j) =true                //
// ((i < 10) && (j < 10)) =false //
// ((i < 10) || (j < 10)) =false //
///////////////////////////////////
