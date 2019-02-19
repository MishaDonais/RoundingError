/*
 * This program was made by Misha Donais
 * On Feb 18th 2019
 * To calculate rounding errors from java functions
 */
package roundingerror;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author misha
 */
public class RoundingError {


    public static void main(String[] args) {
        //Gets an initial value from the user
        System.out.println("Enter an integer");
        Scanner keyedInput = new Scanner(System.in);
        float userNumber = keyedInput.nextFloat();
        float userNumberRoot = (float)Math.sqrt(userNumber);
        float afterRounding = (float)Math.pow(userNumberRoot, 2);
        System.out.println("User number ^1/2 and then ^2 = " + afterRounding);
        System.out.println("Rounding Error = " + (afterRounding-userNumber));
        
    }
    
}
