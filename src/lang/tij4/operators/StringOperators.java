package lang.tij4.operators;

public class StringOperators {
    public static void main(String[] args) {
        int x = 0, y = 1, z = 2;
        String s = "x, y, z ";
        System.out.println(s + x + y + z);     // example 1
        System.out.println(x + " " + s);       // example 2
        System.out.println(y + z + " " + s);
        s += "(summed) = ";
        System.out.println(s + (x + y + z));   // example 3
        System.out.println("" + x);            // example 4
    }
}

//////////////////////////
// Output===>           //
// x, y, z 012          //
// 0 x, y, z            //
// x, y, z (summed) = 3 //
// 0                    //
//////////////////////////
