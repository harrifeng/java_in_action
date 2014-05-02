package lang.tij4.control;

public class WhileTest {
    static boolean condition() {
        // random generates number at [0,1)
        boolean result = Math.random() < 0.99;
        System.out.printf(result + ",");
        return result;
    }

    public static void main(String[] args) {
        while (condition()) {
            System.out.println("Inside 'while'");
        }
        System.out.println("Exited 'while'");
    }
}

////////////////////////////////////////////////////
// <===================OUTPUT===================> //
// true,Inside 'while'                            //
// true,Inside 'while'                            //
// true,Inside 'while'                            //
// true,Inside 'while'                            //
// true,Inside 'while'                            //
// true,Inside 'while'                            //
// true,Inside 'while'                            //
// true,Inside 'while'                            //
// true,Inside 'while'                            //
// true,Inside 'while'                            //
// true,Inside 'while'                            //
// true,Inside 'while'                            //
// true,Inside 'while'                            //
// true,Inside 'while'                            //
// true,Inside 'while'                            //
// true,Inside 'while'                            //
// true,Inside 'while'                            //
// true,Inside 'while'                            //
// true,Inside 'while'                            //
// false,Exited 'while'                           //
////////////////////////////////////////////////////

    
