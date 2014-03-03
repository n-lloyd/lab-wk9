package names;

import java.util.Scanner;

/**
 * Ideal Weight assignment for lab 2.
 * @author Nathan Lloyd
 * @version 1
 */

public class IdealWeight {
    /**
     * Calculates the ideal weight of males or females of certain heights.
     * @param args unused
     */

    public static void main(String[] args) {
        int heightFeet;
        int heightInches;
        final int baseMale = 106; //base ideal weight for males at 5ft
        final int baseFemale = 100; // base ideal weight for females at 5ft
        final int malePerInch = 6; // ideal weight increase per inch for male
        final int femalePerInch = 5; //ideal weight increase per inch for female
        final int baseHeight = 60; // 5ft in inches
        final int foot = 12; // 12 inches to a foot
        int idealWeightMale;
        int idealWeightFemale;
        final double percentMin = 0.85; // 15 percent below ideal weight
        final double percentMax = 1.15; // 15 percent above ideal weight
        
        try (Scanner scan = new Scanner(System.in)) {

            System.out.println("Enter your height in feet");
            heightFeet = scan.nextInt();
            System.out.println("Enter the inches");
            heightInches = scan.nextInt();
            System.out.println("Your height is " + heightFeet
                    + "\'" + heightInches);
            heightFeet = (heightFeet * foot) - baseHeight;
            idealWeightMale = (heightFeet + heightInches)
                    *  malePerInch + baseMale;
            idealWeightFemale = (heightFeet + heightInches)
                    * femalePerInch + baseFemale;
            System.out.println("Your ideal weight as a male would be "
                    + idealWeightMale + "lbs.");
            System.out.println("Your ideal weight range as a male would be "
                    + (idealWeightMale * percentMin) + " to "
                    + (idealWeightMale * percentMax) + "lbs.");
            System.out.println("Your ideal weight as a female would be "
                    + idealWeightFemale + "lbs.");
            System.out.println("Your ideal weight range as a female would be "
                    + (idealWeightFemale * percentMin) + " to "
                    + (idealWeightFemale * percentMax) + "lbs.");
            
        }
    }
}
