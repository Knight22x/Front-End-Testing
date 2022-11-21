import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        String [] arrayOfNames = new String[10];

        for ( int i=0 ; i<10; i++) {
            System.out.println("Please enter the " + (ordinal(i+1)) + " name");
            arrayOfNames[i] = input.next();
        }
        for ( int i=0 ; i<10; i++)
        {
            System.out.println("Welcome "+ arrayOfNames[i]+ "!");
        }

    }
    public static String ordinal(int i) {
        return i % 100 == 11 || i % 100 == 12 || i % 100 == 13 ? i + "th" : i + new String[]{"th", "st", "nd", "rd", "th", "th", "th", "th", "th", "th" }[i % 10];
    }
}