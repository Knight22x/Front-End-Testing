import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] numbers = new int[5];
        Scanner input = new Scanner(System.in);
        int choice;
        int index=0;
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
                index = i;
                found = true;
                System.out.println("Number was found at " + "index: "+ index);
                break;
            }

        }
        if (!found) {
            System.out.println("Number was not found");
        }

    }
}