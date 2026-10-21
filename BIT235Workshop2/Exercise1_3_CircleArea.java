import java.util.Scanner;

/**
 * Exercise 1.3
 * Calculates the area of a circle given its radius.
 * Formula: Area = pi * r^2, with pi = 3.14
 */
public class Exercise1_3_CircleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double PI = 3.14;

        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();

        double area = PI * Math.pow(radius, 2);
        System.out.printf("The area of a circle with radius %.2f is %.4f%n", radius, area);

        input.close();
    }
}
