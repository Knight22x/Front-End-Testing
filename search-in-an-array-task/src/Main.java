import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] numbers = new int[5];
        Scanner input = new Scanner(System.in);
        int choice;
        boolean found = false;

        for (int i= 0; i<5 ; i++)
        {
            System.out.println(" Please enter the " +(i + 1) + " number");
            numbers[i]=input.nextInt();
        }

        System.out.println(" Please enter the desired number to be found ");

        choice=input.nextInt();

        for (int i= 0; i<5 ; i++)
        {
            if (choice == numbers[i]) {
                found = true;
                break;
            }
        }
        System.out.println("Found = "+ found);
    }
}