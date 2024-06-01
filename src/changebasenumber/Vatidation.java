package changebasenumber;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author thanh
 */
public class Vatidation {
    
    private static Scanner sc=new Scanner(System.in);
    
    public static int checkIntInput(int min,int max){
        while(true){
            try{
                int result=Integer.parseInt(sc.nextLine().trim());
                if(min>result || max<result){
                    throw new NumberFormatException();
                }else return result;
            }catch(NumberFormatException e){
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
}
