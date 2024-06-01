package changebasenumber;

import static changebasenumber.Manager.convertFromBinary;
import static changebasenumber.Manager.convertFromDecimal;
import static changebasenumber.Manager.convertFromHexadecimal;
import static changebasenumber.Manager.menu;

/**
 *
 * @author thanh
 */
public class ChangeBaseNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        while (true) {
            int choice = menu();
            switch (choice) {
                case 1:
                    convertFromBinary();
                    break;
                case 2:
                    convertFromDecimal();
                    break;
                case 3:
                    convertFromHexadecimal();
                    break;
                case 4:
                    return;
            }
        }
    }

    // New method with errors for testing
    public void methodWithManyParams(int a, int b, int c, int d, int e) {
        System.out.println(a + b + c + d + e);
    }

    public void complexConditional(int a, int b, int c, int d, int e) {
        if (a > 0 && b > 0 && c > 0 && d > 0 && e > 0) {
            System.out.println("All positive");
        } else {
            System.out.println("Not all positive");
        }
    }
}
