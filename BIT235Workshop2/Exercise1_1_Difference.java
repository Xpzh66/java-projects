import java.util.Scanner;

/**
 * Exercise 1.1
 * Reads two integers from the user and displays their difference.
 */
public class Exercise1_1_Difference {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int num1 = input.nextInt();

        System.out.print("Enter second integer: ");
        int num2 = input.nextInt();

        int difference = num1 - num2;
        System.out.println("The difference of " + num1 + " and " + num2 + " is " + difference);

        input.close();
    }
}
