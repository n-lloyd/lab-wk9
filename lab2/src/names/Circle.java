package names;
/**
 * Area & circumference of a circle assignment for lab 2.
 * @author Nathan Lloyd
 * @version 1
 */
public class Circle {
/**
 * Print the area of a circle with two different radii.
 * @param args unused
 */
    public static void main(String[] args) {
        final double pi = 3.14159;
        int radius = 10;
        double area1 = pi * radius * radius;
        double area2;
        double circumference1 = radius * pi * 2;
        double circumference2;
        double areaDifference;
        double circumferenceDiff;
        
        System.out.println("The area of a circle with radius "
                + radius + " is " + area1);
        System.out.println("The circumference of a circle with radius "
                + radius + " and area " + area1 + " is " + circumference1);
        radius = radius * 2;
        area2 = pi * radius * radius;
        circumference2 = radius * pi * 2;
        System.out.println("The area of a circle with radius "
                + radius + " is " + area2);
        System.out.println("The circumference of a circle with radius "
                + radius + " and area " + area2 + " is " + circumference2);
        areaDifference = area2 / area1;
        circumferenceDiff = circumference2 / circumference1;
        System.out.println("The area of the circle grew by a multiple of "
                + areaDifference);
        System.out.println("The circumferences of the circle grew by a multiple"
                + " of " + circumferenceDiff);
    }
}
