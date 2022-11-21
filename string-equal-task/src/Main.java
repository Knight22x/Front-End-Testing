import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String s1;
        String s2;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the first name");
        s1=input.next();

        System.out.println("Please enter the second name");
        s2=input.next();

        System.out.println("Result equals: "+ s1.equals(s2));
        System.out.println("Result equals ignore-case: "+ s1.equalsIgnoreCase(s2));

    }
}