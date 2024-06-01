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
    
}
