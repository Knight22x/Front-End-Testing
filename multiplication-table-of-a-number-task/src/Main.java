import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number");
        int number=input.nextInt();

        for (int i = 0 ; i <= 10 ; i ++ )
        {
            System.out.println(number+ " * "+i+" = " + number * i);
        }
    }
}