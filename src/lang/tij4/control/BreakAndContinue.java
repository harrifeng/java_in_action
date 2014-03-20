package lang.tij4.control;

import lang.tij4.util.Range;

public class BreakAndContinue {

  public static void main(String[] args) {
    for (int i = 0; i < 100; i++) {
      if (i == 74) {
        break; // Out of for loop
      }
      if (i % 9 != 0) {
        continue; // Next iteration
      }
      System.out.print(i + " ");
    }
    System.out.println();
    // Using foreach:
    for (int i : Range.range(100)) {
      if (i == 74) {
        break; // Out ot for loop
      }
      if (i % 9 != 0) {
        continue;  // Next iteration
      }
      System.out.print(i + " ");
    }
    System.out.println();
    int i = 0;
    // An "infinite loop"
    while (true) {
      i++;
      int j = i * 27;
      if (j == 1269) {
        break; // Out of loop
      }
      if (i % 10 != 0) {
        continue; // Top of loop
      }
      System.out.print(i + " ");
    }
  }
}
////////////////////////////////////////////////////
// <===================OUTPUT===================> //
// 0 9 18 27 36 45 54 63 72                       //
// 0 9 18 27 36 45 54 63 72                       //
// 10 20 30 40                                    //
////////////////////////////////////////////////////
