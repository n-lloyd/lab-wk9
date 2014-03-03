package names;

import java.util.Scanner;

/**
 * Base Conversion assignment for lab 2.
 * @author Nathan Lloyd
 * @version 1
 */

public class BaseConversion {
    /**
     * Converts base 10 numbers to another base to a max of 4 digits.
     * @param args unused
     */
    public static void main(String[] args) {
        int base; // the new base
        int base10Num; // the number in base 10
        int base10Num2; // the replacement
        int maxNumber; // the max number that will fit
        int place0; // digits in the the 1's place (base^0)
        int place1; //digits in the base^1 place
        int place2; // digits in the base^2 place
        int place3; // digits in the base^3 place
        String baseBNum;
        
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println();
            System.out.println("Base Conversion Program");
            System.out.println();
            System.out.println("Please enter a base (2-9):");
            base = scan.nextInt();
            maxNumber = (base * base * base * base) - 1;
            System.out.println("The maximum base 10 number that will fit "
                    + "in 4 digits is " + maxNumber);
            System.out.println("Please enter a base 10 number to convert: ");
            base10Num = scan.nextInt();
            place0 = base10Num % base;
            base10Num2 = base10Num / base;
            place1 = base10Num2 % base;
            base10Num2 = base10Num2 / base;
            place2 = base10Num2 % base;
            base10Num2 = base10Num2 / base;
            place3 = base10Num2 % base;
            baseBNum = "" + place3 +  "" + place2 + "" + place1 + "" + place0;
            System.out.println("The base " + base + " number for " 
                    + base10Num + " is " + baseBNum);
            
        }
    }

}
