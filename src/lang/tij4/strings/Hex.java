package lang.tij4.strings;

import lang.tij4.util.BinaryFile;

public class Hex {
    public static String format(byte[] data) {
        StringBuilder result = new StringBuilder();
        int n = 0;
        for (byte b : data) {
            if (n % 16 == 0) {
                result.append(String.format("%05X:", n));
            }
            result.append(String.format("%02X ", b));
            n++;
            if (n % 16 == 0) {
                result.append("\n");
            }
        }
        result.append("\n");
        return result.toString();
    }

    public static void main(String[] args) {
        try {
            System.out.println(format(BinaryFile.read(
                    "build/classes/lang/tij4/strings/Hex.class")));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

////////////////////////////////////////////////////////////
// <===================OUTPUT===================>         //
// 00000:CA FE BA BE 00 00 00 34 00 4F 0A 00 05 00 20 07  //
// 00010:00 21 0A 00 02 00 20 08 00 22 07 00 23 0A 00 24  //
// 00020:00 25 0A 00 26 00 27 0A 00 02 00 28 08 00 29 0A  //
// 00030:00 2A 00 2B 08 00 2C 0A 00 02 00 2D 09 00 2E 00  //
// .....                                                  //
////////////////////////////////////////////////////////////
