package changebasenumber;

/**
 *
 * @author thanh
 */
public class Manager {

    public static int menu() {
        System.out.println("1. Convert from Binary");
        System.out.println("2. Convert from Decimal");
        System.out.println("3. Convert from HexaDecimal");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        int choice = Vatidation.checkIntInput(1, 4);
        return choice;
    }

    public static int displayConvert(String case1, String case2, String case3) {
        System.out.println("1. Convert " + case1 + " to " + case2);
        System.out.println("2. Convert " + case1 + " to " + case3);
        System.out.print("Enter your choice: ");
        int choice = Vatidation.checkIntInput(1, 2);
        return choice;
    }

    public static void convertFromBinary() {
        String binary = Vatidation.checkBaseInput("[01]+", "binary");
        int choice = displayConvert("Binary", "Decimal", "Hexadecimal");
        switch (choice) {
            case 1:
                System.out.println("Decimal: " + BintoDec(binary));
                break;
            case 2:
                System.out.println("Hexadecimal: 0x" + BintoHex(binary));
        }
    }

    public static void convertFromDecimal() {
        String decimal = Vatidation.checkBaseInput("[0-9]+", "decimal");
        int choice = displayConvert("Decimal", "Binary", "Hexadecimal");
        switch (choice) {
            case 1:
                System.out.println("Binary: " + DectoBin(decimal));
                break;
            case 2:
                System.out.println("Hexadecimal: 0x" + DecToHex(decimal));
                break;
        }
    }

    public static void convertFromHexadecimal() {
        String hexadecimal = Vatidation.checkBaseInput("[0-9A-F]+", "Hexadecimal");
        int choice = displayConvert("Hexadecimal", "Binary", "Decimal");
        switch (choice) {
            case 1:
                System.out.println("Binary: " + HextoBin(hexadecimal));
                break;
            case 2:
                System.out.println("Hexadecimal: 0x" + HextoDec(hexadecimal));
        }
    }

    public static String BintoDec(String binary) {
        int decimal = Integer.parseInt(binary, 2);
        return Integer.toString(decimal);
    }

    public static String BintoHex(String binary) {
        return Integer.toHexString(Integer.parseInt(binary, 2)).toUpperCase();
    }

    public static String DectoBin(String decimal) {
        return Integer.toBinaryString(Integer.parseInt(decimal));
    }

    public static String DecToHex(String decimal) {
        int value = Integer.parseInt(decimal);
        return Integer.toHexString(value).toUpperCase();
    }

    public static String HextoBin(String hexadecimal) {
        return Integer.toBinaryString(Integer.parseInt(hexadecimal, 16));
    }

    public static String HextoDec(String hexadecimal) {
        return Integer.toString(Integer.parseInt(hexadecimal, 16));
    }

}
