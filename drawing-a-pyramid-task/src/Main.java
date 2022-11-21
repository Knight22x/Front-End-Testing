import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number");
        number=input.nextInt();

        for (int i =0 ; i<number;i++)
        {
            for (int j=0; j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}