import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please Enter your name");
        Scanner sc= new Scanner(System.in);
        String username = sc.next();
        sayWelcome(username);
        sc.close();
    }

    private static void sayWelcome(String username)
    {
        System.out.println("Welcome "+username);
    }
}