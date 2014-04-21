package oj.leet.itr;

public class Solution {

    private static final String RomanStr = "IVXLCDME";

    private String dToS(int digit, int level) {
        StringBuilder sb = new StringBuilder();
        if (digit > 0 && digit < 4) {
            for (int i = 0; i < digit; i++) {
                sb.append(RomanStr.charAt(level));
            }
        } else if (digit == 4) {
            sb.append(RomanStr.charAt(level));
            sb.append(RomanStr.charAt(level + 1));
        } else if (digit > 4 && digit < 9) {
            sb.append(RomanStr.charAt(level + 1));
            for (int i = 5; i < digit; i++) {
                sb.append(RomanStr.charAt(level));
            }
        } else if (digit == 9) {
            sb.append(RomanStr.charAt(level));
            sb.append(RomanStr.charAt(level + 2));
        }
        return sb.toString();
    }

    public String intToRoman(int num) {

        if (num > 3999) {
            return "";
        }
        String ret = "";

        int size = 1000;
        for (int i = 6; i >= 0; i = i - 2) {
            ret += dToS(num / size, i);
            num %= size;
            size /= 10;
        }

        return ret;
    }
}
