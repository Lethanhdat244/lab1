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
            switch (choice) { // Deeply nested control structures
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

    public static String url = "http://example.com/api"; // Hardcoded URL

    public void methodWithManyParams(int a, int b, int c, int d, int e) { // Excessive parameters
        System.out.println(a + b + c + d + e);
    }

    public void nonUtilityStaticMethod() { // Static method in non-utility class
        System.out.println("Static method");
    }

    public void complexConditional(int a, int b, int c, int d, int e) { // Complex conditionals
        if (a > b && (c > d || e < d) && !(a == c)) {
            System.out.println("Complex condition met");
        }
    }

    public void methodWithMultipleReturns(int a, int b) { // Multiple return statements
        if (a > b) {
            System.out.println("a is greater");
            return;
        } else {
            System.out.println("b is greater");
            return;
        }
    }

    public void nestedTernaryOperator(int a, int b, int c, int d, int e) { // Nested ternary operators
        int result = a > b ? (c > d ? e : d) : b;
        System.out.println("Result: " + result);
    }
}
