import java.util.Scanner;

/**
 * Exercise 1.8
 * Compares two strings entered by the user.
 *   - Uses equals() to check whether the two strings are identical.
 *   - Uses charAt(0) to compare the first character of each string.
 */
public class Exercise1_8_CompareStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String s1 = input.nextLine();

        System.out.print("Enter the second string: ");
        String s2 = input.nextLine();

        // Compare the whole strings
        boolean equal = s1.equals(s2);
        System.out.println("The two given strings are equal: " + equal);

        // Compare the first character of each string (guard against empty input)
        if (s1.isEmpty() || s2.isEmpty()) {
            System.out.println("Cannot compare first characters: one of the strings is empty.");
        } else {
            char first1 = s1.charAt(0);
            char first2 = s2.charAt(0);
            System.out.println("First character of string 1: '" + first1 + "'");
            System.out.println("First character of string 2: '" + first2 + "'");
            System.out.println("First characters are equal: " + (first1 == first2));
        }

        input.close();
    }
}
