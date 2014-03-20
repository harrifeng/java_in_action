package lang.tij4.initialization;

public class Leaf {

  int i = 0;

  public static void main(String[] args) {
    Leaf x = new Leaf();
    x.increment().increment().increment().print();
  }

  Leaf increment() {
    i++;
    return this;
  }

  void print() {
    System.out.println("i = " + i);
  }
}
////////////////////////////////////////////////////
// <===================OUTPUT===================> //
// i = 3                                          //
////////////////////////////////////////////////////
