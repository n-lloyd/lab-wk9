package q4;
import java.util.Scanner;

/**
 * <p>This program gets the radius, r, and height, h, from
 *    the user and then prints the volume of the cylinder.</p>
 *
 * @author Nathan Lloyd, Set C
 * @version 1.0
 */
public class Cylinder {
    
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        double r; /** Radius. */
        double h; /** Height. */
        double volume;
        final double pi = Math.PI;
        double square; /** To square the radius. */
        
        try (Scanner scan = new Scanner(System.in)) {
            
        System.out.println("Cylinder Volume Program.");
        System.out.println();
        System.out.print("Enter the radius of the cylinder: ");
        r = scan.nextDouble();
        square = r * r;
        System.out.print("Enter the height of the cylinder: ");
        h = scan.nextDouble();
        volume = pi * square * h;
        System.out.println("The volume of the cylinder is: " + volume);
        
        }
    }
    

       

};

