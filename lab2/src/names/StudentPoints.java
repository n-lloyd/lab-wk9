package names;

/**
 * Student Points assignment for lab 2.
 * @author Nathan Lloyd
 * @version 1
 */
public class StudentPoints {
    /**
     * Prints a list of students and their earned grades.
     * @param args unused
     */
    public static void main(String[] args) {
        final int lab1 = 75;
        final int lab2 = 93;
        final int lab3 = 42;
        final int lab4 = 34;
        final int lab5 = 56;
        final int bonus1 = 12;
        final int bonus2 = 7;
        final int bonus3 = 20;
        final int bonus4 = 0;
        int total;
        
        System.out.println("///////////////////\\\\\\\\\\\\\\\\\\\\"
                + "\\\\\\\\\\\\\\\\\\");
        System.out.println("==\t    Student Points\t    ==");
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"
                + "///////////////////");
        System.out.println("Name\tLab\tBonus\tTotal");
        System.out.println("----\t---\t-----\t-----");
        total = lab1 + bonus3;
        System.out.println("Frank\t" + lab1 + "\t" + bonus3 + "\t" + total);
        total = lab2 + bonus1;
        System.out.println("Sally\t" + lab2 + "\t" + bonus1 + "\t" + total);
        total = lab3 + bonus3;
        System.out.println("Joey\t" + lab3 + "\t" + bonus3 + "\t" + total);
        total = lab4 + bonus4;
        System.out.println("Brutus\t" + lab4 + "\t" + bonus4 + "\t" + total);
        total = lab5 + bonus2;
        System.out.println("Aliyah\t" + lab5 + "\t" + bonus2 + "\t" + total);
    }
}
