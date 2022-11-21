import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Scanner input = new Scanner(System.in);
        int sum = 0;

        for (int i = 0 ; i< 10 ; i++)
        {
            System.out.println(" Please enter the " +(i + 1) + " number");
            numbers[i]=input.nextInt();
        }


        for (int i = 0 ; i< 10 ; i++)
        {
            sum+=numbers[i];
        }

        System.out.println("Sum is "+ sum);
        System.out.println("Average is "+ sum/numbers.length);
    }
}