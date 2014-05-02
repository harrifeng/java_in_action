package lang.tij4.innerclasses;

public interface ClassInInterface {
    void howdy();

    class Test implements ClassInInterface {
        public void howdy() {
            System.out.println("Howdy!");
        }

        public static void main(String[] args) {
            new Test().howdy();
        }
    }
}
/////////////////////////////////////////////////////////////
// bash-3.2$ ./runj.sh innerclasses/ClassInInterface\$Test //
// --------Begin----------                                 //
//                                                         //
// <===================OUTPUT===================>          //
// Howdy!                                                  //
//                                                         //
// --------End------------                                 //
/////////////////////////////////////////////////////////////
