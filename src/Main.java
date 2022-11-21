import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String s1;
        String s2;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first statement");
        s1= input.next();
        System.out.println("Please enter the second statement");
        s2= input.next();

        System.out.println("Result: "+ s1.contains(s2));
    }
}