package q3;
import java.util.Scanner;

/**
 * <p>This program takes a temperature in Farenheit inputed by the user
 *    and converts it into Celsius.</p>
 *
 * @author Nathan Lloyd, Set C
 * @version 1.0
 */
public class TempConvert {
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        /** C = (F - 32) * (5 / 9) */
        
        double farenheit;
        final double div1 = 5.0; /** Dividend */
        final double div2 = 9.0; /** Divisor. */
        final double div = div1 / div2; /** Part of the conversion formula. */
        final double sub = 32.0; /** To subtract from farenheit. */
        double subtraction; /** To be used for first part of the calculation. */
        double celsius;
        
        try (Scanner scan = new Scanner(System.in)) {
            
        System.out.println("Farenheit to Celsius conversion program");
        System.out.println();
        System.out.print("Enter a temperature in Farenheit: ");
        farenheit = scan.nextDouble();
        subtraction = farenheit - sub;
        celsius = subtraction * div;
        System.out.println("The temperature in Celsius is: "
                + celsius);
        
        }
    }

};
