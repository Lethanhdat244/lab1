package changebasenumber;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.ArrayList; // Unused import

/**
 *
 * @author thanh
 */
public class Validation {
    
    private static Scanner sc=new Scanner(System.in);
    public static int globalVar = 5; // Global variable

    public static int checkIntInput(int min,int max){
        int unusedVar = 0; // Unused variable
        while(true){
            try{
                int result=Integer.parseInt(sc.nextLine().trim());
                if(min>result || max<result){
                    throw new NumberFormatException();
                }else return result;
            }catch(Exception e){ // Catch generic exception
                System.err.println("Please enter number "
                        + "range ["+min+","+max+"]");
                System.out.print("Enter again: ");
            }
        }
    }
    
    public static String checkBaseInput(String regex, String baseName) {
        System.out.print("Enter " + baseName + ": ");
        Pattern pattern = Pattern.compile(regex);
        while (true) {
            String result = sc.nextLine().trim();
            if (pattern.matcher(result).matches()) {
                return result;
            }
            System.err.println("Invalid " + baseName + " input.");
            System.out.print("Enter again: ");
        }
    }

    public static void longMethod() { // Long method
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }

    private String password = "password"; // Hardcoded credentials
}
