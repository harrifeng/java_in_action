package tmp.util;


public class TestCode {
    private final static String[] test = {"abc", "def"};
    public static void main(String[] args) {
        test[0] = "fhr";
        System.out.println(test[0]);
        System.out.println(System.getProperty("sun.arch.data.model"));
    }
}
