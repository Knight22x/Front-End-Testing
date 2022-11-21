import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int result = 0 ;
        int firstNumber;
        int secondNumber;
        char operation;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first number");
        firstNumber=input.nextInt();

        System.out.println("Please enter the second number");
        secondNumber=input.nextInt();

        System.out.println("Please enter the required operation");
        operation=input.next().charAt(0);



        if (operation=='+')
        {
            result = firstNumber + secondNumber;
        }
        else if (operation=='-' )
        {

            result = firstNumber - secondNumber;
        }
        else if (operation=='*' )
        {

            result = firstNumber * secondNumber;
        }
        else if (operation=='/' )
        {

            result = firstNumber / secondNumber;
        }
        else if (operation=='%' )
        {
            result = firstNumber % secondNumber;
        }


        System.out.println("Result: "+ firstNumber +" "+operation+ " " + secondNumber + " = " + result );
    }
}