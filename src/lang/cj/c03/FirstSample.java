package lang.cj.c03;

public class FirstSample {
    public static void main(String[] args) {
        System.out.println("We will not sue 'Hello, World!'");
        ////////////////////////////////////////////////////////////////
        // Not get 0.9, got 0.8999999999999999                        //
        // Floating-point numbers are not suitable for financial      //
        // calculations in which roundoff errors cannot be tolerated. //
        // Use the BigDecimal class instead                           //
        ////////////////////////////////////////////////////////////////
        System.out.println(2.0 - 1.1);
    }
}
