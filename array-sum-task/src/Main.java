import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] arrayOfNumbers  = new int [5];
        System.out.println(" Please enter the first number");
        Scanner input = new Scanner(System.in);
        arrayOfNumbers[0] = Integer.parseInt(input.next());
        System.out.println(" Please enter the second number");
        arrayOfNumbers[1] = Integer.parseInt(input.next());
        System.out.println(" Please enter the third number");
        arrayOfNumbers[2] = Integer.parseInt(input.next());
        System.out.println(" Please enter the fourth number");
        arrayOfNumbers[3] = Integer.parseInt(input.next());
        System.out.println(" Please enter the fifth number");
        arrayOfNumbers[4] = Integer.parseInt(input.next());

        int sum = arrayOfNumbers[0] + arrayOfNumbers[1] + arrayOfNumbers[2] + arrayOfNumbers[3] + arrayOfNumbers[4];

        System.out.println("Sum is "+ sum);

    }
}