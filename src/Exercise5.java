/**
 * Workshop 6 - Exercise 5 (Medium)
 * Search engine: searches an array of 10 paragraphs for a given phrase.
 * If nothing matches, a "not found" message is printed; otherwise the
 * matching array indexes and the paragraphs are printed.
 */
public class Exercise5 {

    public static void main(String[] args) {

        // The 10 paragraphs supplied with the workshop
        String[] paragraphs = {
                "Lose all the weight you want.",
                "I can't I must work",
                "That would be like a keyword search.",
                "This would be Victoria.",
                "Join the party.",
                "To be or not to be.",
                "That is a question to test keyword search.",
                "Can you find a needle in a hay stack?",
                "This could be the last paragraph, but its not.",
                "Ada Lovelace is the worlds first programmer as of 1860."
        };

        // Test 1: a phrase that appears in two paragraphs
        search(paragraphs, "keyword search");

        // Test 2: a phrase that appears in one paragraph
        search(paragraphs, "Ada Lovelace");

        // Test 3: a phrase that does not appear anywhere
        search(paragraphs, "Java Collections");
    }

    /**
     * Prints every paragraph that contains the phrase, together with its
     * index in the array. String.contains() does the matching.
     */
    private static void search(String[] paragraphs, String phrase) {

        System.out.println("Searching for: \"" + phrase + "\"");
        System.out.println();

        int foundCount = 0;

        for (int i = 0; i < paragraphs.length; i++) {
            if (paragraphs[i].contains(phrase)) {
                foundCount++;
                System.out.println("Index " + i + ": " + paragraphs[i]);
            }
        }

        if (foundCount == 0) {
            System.out.println("The phrase \"" + phrase + "\" was not found in any paragraph.");
        } else {
            System.out.println();
            System.out.println("Found in " + foundCount + " paragraph(s).");
        }

        System.out.println("==================================================");
    }
}
