package cj.c03;

public class MoreString {
    public static void main(String[] args) {
        ///////////////////////////////////////////////////////////////////////
        // Do not use the == operator to test whether two strings are equal! //
        // It only determines whether or not the strings are stored in       //
        // the same location. Sure, if strings are in the same location,     //
        // they must be equal. But it is entirely possible to store multiple //
        // copies of identical strings in different places.                  //
        ///////////////////////////////////////////////////////////////////////
        String greeting = "Hello";
        if (greeting == "Hello") {
            System.out.println("They are at same address, not means they are equal");
        }
        if (greeting.substring(0, 3) != "Hel") {
            System.out.println("They are NOT at same address, although they are same content");
        }
        // use equels instead of '=='
        if (greeting.substring(0, 3).equals("Hel")) {
            System.out.println("They are same contents, use equals test contents");
        }
    }
}
