package lang.tij4.initialization;

class Window {

  Window(int marker) {
    System.out.println("Window(" + marker + ")");
  }
}

class House {

  Window w1 = new Window(1); // Before ctor
  Window w2 = new Window(2); // After ctor
  Window w3 = new Window(3); // At end

  House() {
    // show tat we're in the ctor
    System.out.println("House()");
    w3 = new Window(33); // Reinitialize w3
  }

  void f() {
    System.out.println("f()");
  }
}

public class OrderOfInitialization {

  public static void main(String[] args) {
    House h = new House();
    h.f(); // Shows that construction is done
  }
}
////////////////////////////////////////////////////
// <===================OUTPUT===================> //
// Window(1)                                      //
// Window(2)                                      //
// Window(3)                                      //
// House()                                        //
// Window(33)                                     //
// f()                                            //
////////////////////////////////////////////////////
