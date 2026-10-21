import java.util.Scanner;

/**
 * Exercise 1.2
 * Converts a temperature in degrees Celsius to degrees Fahrenheit.
 * Formula: F = C * 9 / 5 + 32
 */
public class Exercise1_2_CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter temperature in degrees Celsius: ");
        double celsius = input.nextDouble();

        double fahrenheit = celsius * 9.0 / 5.0 + 32;
        System.out.println(celsius + " degrees Celsius = " + fahrenheit + " degrees Fahrenheit");

        input.close();
    }
}
