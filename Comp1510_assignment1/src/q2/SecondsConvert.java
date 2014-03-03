package q2;

import java.util.Scanner;

/**
 * <p>This program receives a time in hours, minutes, and seconds through user
 *   input and converts that time into seconds and then displays the result.</p>
 *
 * @author Nathan Lloyd, Set C
 * @version 1.0
 */
public class SecondsConvert {
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        int hours;
        int minutes;
        int seconds;
        int hoursSeconds;
        int minutesSeconds;
        int totalSeconds;
        final int minutesToSeconds = 60; /** Converts minutes into seconds. */
        final int hoursToSeconds = 3600; /** Converts hours into seconds. */
        
        try (Scanner scan = new Scanner(System.in)) {
        System.out.println("Seconds Converter Program.");
        System.out.println();
        System.out.println("Please enter a time in");
        System.out.print("Hours: ");
        hours = scan.nextInt();
        System.out.print("Minutes: ");
        minutes = scan.nextInt();
        System.out.print("Seconds: ");
        seconds = scan.nextInt();
        
        hoursSeconds = hours * hoursToSeconds;
        minutesSeconds = minutes * minutesToSeconds;
        totalSeconds = hoursSeconds + minutesSeconds + seconds;
        
        System.out.println("The total number of seconds in the time you" 
                + "entered is: " + totalSeconds);
        
        }
    }

};
