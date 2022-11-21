import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        String [] arrayOfNames = new String[10];

        for ( int i=0 ; i<10; i++) {
            System.out.println("Please enter the " + (i + 1) + " name");
            arrayOfNames[i] = input.next();
        }
        for ( int i=0 ; i<10; i++)
        {
            System.out.println("Welcome "+ arrayOfNames[i]+ "!");
        }

    }
}