/**
 * Workshop 6 - Exercise 4 (Easy)
 * Decode the coded message "G tgsl Qefe." using the substitution key taken
 * from the workshop table:
 *
 *   plain : a b c d e f g h i j k l m n o p q r s t u v w x y z
 *   coded : c r g z a v i b s d o e q f h u j x k l w m y n p t
 *
 * The array CODED holds the coded letter for every plain letter, so
 * CODED[0] is 'c' ('a' decodes to 'c'), CODED[1] is 'r' and so on.
 */
public class Exercise4 {

    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    private static final String CODED   = "crgzavibsdoeqfhujxklwmynpt";

    public static void main(String[] args) {

        // Change this line to decode a different message
        String codedMessage = "G tgsl Qefe.";

        System.out.println("Coded message   : " + codedMessage);
        System.out.println("Decoded message : " + decode(codedMessage));
    }

    /**
     * Walks the message character by character. The workshop table reads
     * "a decodes to c", "b decodes to r", so the position of the coded
     * letter in ALPHABET points at its replacement in CODED. Spaces and
     * punctuation are copied unchanged.
     */
    private static String decode(String message) {

        StringBuilder decoded = new StringBuilder();

        for (int i = 0; i < message.length(); i++) {

            char ch = message.charAt(i);

            if (Character.isLetter(ch)) {

                // Position of this letter in the plain alphabet row
                char lower = Character.toLowerCase(ch);
                int position = ALPHABET.indexOf(lower);

                // The coded row gives the replacement letter
                char plain = CODED.charAt(position);

                // Keep the original case: 'G' becomes 'I', not 'i'
                if (Character.isUpperCase(ch)) {
                    decoded.append(Character.toUpperCase(plain));
                } else {
                    decoded.append(plain);
                }

            } else {
                // Space, full stop etc. stay exactly as they are
                decoded.append(ch);
            }
        }

        return decoded.toString();
    }
}
