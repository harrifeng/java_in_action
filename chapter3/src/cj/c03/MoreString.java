package cj.c03;
import java.nio.charset.Charset;

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

        testEncoding();
    }
    private static void testEncoding() {
        System.out.println("---------------");
        String s = "我爱你中国";
        System.out.println("默认的编码格式Charset.defaultCharset()是一个cache的值，不一定受到file.encoding的影响");
        System.out.println("默认的编码格式Charset.defaultCharset()是 " + Charset.defaultCharset());
        System.out.println("s.getBytes() 等同于 s.getBytes(Charset.defaultCharset())");
        System.out.println("---------------");
        try {
            // System.out.prinln("GBK==>Unicode==>UTF-8 Failed to show");
            String s1 = new String(s.getBytes(), "UTF-8");
            System.out.println(Charset.defaultCharset() + "-->Unicode-->UTF-8");
            System.out.println(s1);

            String s3 = new String(s.getBytes("UTF-8"));
            System.out.println(" UTF-8-->Unicode-->" + Charset.defaultCharset());
            System.out.println(s3);

            String s5 = new String(s.getBytes("GBK"));
            System.out.println(" GBK-->Unicode-->" + Charset.defaultCharset());
            System.out.println(s5);
        }
        catch (Throwable e) {
            System.out.println("Error " + e.getMessage());
            e.printStackTrace();
        }
    }
}
