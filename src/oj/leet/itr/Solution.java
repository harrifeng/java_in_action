package oj.leet.itr;
public class Solution {
    private final String ROMA_NUM = "IVXLCDM";

    public String intToRoman(int num) {
        if (num < 0) {
            return null;
        }
        StringBuffer sb = new StringBuffer();
        int size = 1000;
        for (int i = 6; i >= 0; i = i - 2) {
            int dig = num / size;
            sb.append(dToR(dig, i));
            num = num % size;
            size /= 10;
        }
        return sb.toString();
    }
    private String dToR(int digit, int index) {
        StringBuffer sbf = new StringBuffer();

        if (digit <= 3) {
            for (int i = 0; i < digit; i++) {
                sbf.append(ROMA_NUM.charAt(index));
            }
        }
        if (digit == 4) {
            sbf.append(ROMA_NUM.charAt(index));
            sbf.append(ROMA_NUM.charAt(index+1));
        }
        if (digit >=5 && digit <= 8 ) {
            sbf.append(ROMA_NUM.charAt(index+1));
            for (int i = 0; i < digit - 5; i++) {
                sbf.append(ROMA_NUM.charAt(index));
            }
        }
        if (digit == 9) {
            sbf.append(ROMA_NUM.charAt(index));
            sbf.append(ROMA_NUM.charAt(index+2));
        }
        return sbf.toString();
    }
}

// 1I 5V 10X 50L 100C 500D 1000M