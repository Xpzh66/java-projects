/**
 * Exercise 1.7
 * Question: How long is the string returned by the following expression?
 *           What is the string?
 *
 *   "I love java programming".substring(7, 11)
 *
 * Answer (trace):
 *   Index:  0 1 2 3 4 5 6 7 8 9 10 11 12 ...
 *   Char:   I   l o v e   j a v  a     ...
 *
 *   substring(7, 11) starts at index 7 (inclusive) and ends at index 11 (exclusive),
 *   so it takes the characters at indices 7, 8, 9, 10.
 *
 *   The returned string is "java", and its length is 11 - 7 = 4.
 */
public class Exercise1_7_SubstringAnswer {
    public static void main(String[] args) {
        String s = "I love java programming";
        String result = s.substring(7, 11);

        System.out.println("Original string : \"" + s + "\"");
        System.out.println("substring(7, 11): \"" + result + "\"");
        System.out.println("Length of result: " + result.length());
    }
}
