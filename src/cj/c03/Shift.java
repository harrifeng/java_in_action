package cj.c03;
public class Shift {
    public static void main(String[] args) {
        /////////////////////////////////////////////////////////////
        // a >>> operator fills the top bits with zero,            //
        // unlike >> which extends the sign bit into the top bits. //
        // There is no <<< operator.                               //
        /////////////////////////////////////////////////////////////
        int NUM = 64;
        System.out.println("NUM is " + NUM + " '>>' it by 2 is " + (NUM >> 2)
                           + " \n '>>>' it by 2 is " + (NUM >>> 2));
        NUM = -64;
        System.out.println("NUM is " + NUM + " '>>' it by 2 is " + (NUM >> 2)
                           + " \n '>>>' it by 2 is " + (NUM >>> 2));                           
    }
}
///////////////////////////////////////////////////////////////////////////////////
// In C/C++, there is no guarantee as to whether >> performs an arithmetic shift //
// (extending the sign bit) or a logical shift (filling in with zeroes).         //
// Implementors are free to choose whatever is more efficient.                   //
///////////////////////////////////////////////////////////////////////////////////
