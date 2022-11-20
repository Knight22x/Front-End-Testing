import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name = getName();
        printName(name);
        String age = getAge();
        printAge(age);
        String email =getEmail();
        printEmail(email);
        String faculty =getFaculty();
        printFaculty(faculty);
    }

    private static String getName()
    {
        System.out.println("Please enter your name ");
        Scanner scanner = new Scanner (System.in);
        return scanner.next();
    }

    private static String getAge()
    {
        System.out.println("Please enter your Age ");
        Scanner scanner = new Scanner (System.in);
        return scanner.next();
    }

    private static String getEmail()
    {
        System.out.println("Please enter your Email ");
        Scanner scanner = new Scanner (System.in);
        return scanner.next();
    }
    private static String getFaculty()
    {
        System.out.println("Please enter your Faculty ");
        Scanner scanner = new Scanner (System.in);
        return scanner.next();
    }

    private static void printName(String name)
    {
        System.out.println("Your name is " + name);
    }

    private static void printAge(String age)
    {
        System.out.println("Your age is " + age);
    }

    private static void printEmail(String email)
    {
        System.out.println("Your email is " + email);
    }
    private static void printFaculty(String faculty)
    {
        System.out.println("Your faculty is " + faculty);
    }
}