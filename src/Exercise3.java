/**
 * Workshop 6 - Exercise 3 (Medium)
 * Reverse the sequence of letters in each word of a sentence by using loops
 * and arrays.
 *
 * "To be or not to be."  ->  "oT eb ro ton ot eb."
 */
public class Exercise3 {

    public static void main(String[] args) {

        String sentence = "To be or not to be.";

        System.out.println("Original : " + sentence);
        System.out.println("Reversed : " + reverseWords(sentence));
    }

    /**
     * Splits the sentence into words, reverses every word with a loop,
     * then joins the reversed words back together with single spaces.
     */
    private static String reverseWords(String sentence) {

        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for (int w = 0; w < words.length; w++) {

            // Copy the word into a character array so it can be edited
            char[] letters = words[w].toCharArray();

            // Two pointers: swap the front letter with the back letter.
            // Punctuation is skipped, so "to be." becomes "ot eb." and the
            // full stop keeps its place at the end of the word.
            int left = 0;
            int right = letters.length - 1;

            while (left < right) {
                if (!Character.isLetter(letters[left])) {
                    left++;
                    continue;
                }
                if (!Character.isLetter(letters[right])) {
                    right--;
                    continue;
                }

                char temp = letters[left];
                letters[left] = letters[right];
                letters[right] = temp;
                left++;
                right--;
            }

            result.append(new String(letters));

            // Put the space back between the words, but not after the last one
            if (w < words.length - 1) {
                result.append(' ');
            }
        }

        return result.toString();
    }
}
