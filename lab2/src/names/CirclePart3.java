package names;

import java.util.Scanner;

/**
 * Part 3 of the circle assignment for lab 2.
 * @author Nathan Lloyd
 * @version 1
 */
public class CirclePart3 {
    /**
     * Gets the radius from user, calculates circumference and area.
     * then doubles radius and repeats
     * @param args unused
     */
    public static void main(String[] args) {
        int radius;
        double circumference;
        final double pi = 3.14159;
        double area;
        
        try (Scanner scan = new Scanner(System.in)) {
        
        System.out.println("Enter a radius for the circle.");
        radius = scan.nextInt();
        area = pi * radius * radius;
        circumference = radius * pi * 2;
        System.out.println("The radius of the circle you entered is " + radius 
                + " and the area of the circle is " + area + " and its"
                + " circumference is " + circumference);
        radius = radius * 2;
        area = pi * radius * radius;
        circumference = radius * pi * 2;
        System.out.println("The radius of a circle twice that size is " + radius
               + " and its area would be " + area + " and its circumference is "
                + circumference);
        }
    }

}
