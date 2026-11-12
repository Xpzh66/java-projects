/**
 * Workshop 6 - Exercise 7 (Medium)
 * The Boxes class: draws a square box on the console.
 *
 * The top and bottom edges are built from '-' characters and the sides
 * from '|'. The size is limited to a maximum of 10.
 */
public class Boxes {

    /** Largest box the class is allowed to draw. */
    public static final int MAX_SIZE = 10;

    /** Smallest sensible box (1 is a single character, 2 is the minimum frame). */
    public static final int MIN_SIZE = 1;

    private int size;

    /** Constructor: accepts the size of the box. */
    public Boxes(int size) {
        setSize(size);
    }

    /** Setter: validates the size and stores it. */
    public void setSize(int size) {
        if (size < MIN_SIZE) {
            System.out.println("Size " + size + " is too small, using " + MIN_SIZE + " instead.");
            this.size = MIN_SIZE;
        } else if (size > MAX_SIZE) {
            System.out.println("Size " + size + " exceeds the maximum, using " + MAX_SIZE + " instead.");
            this.size = MAX_SIZE;
        } else {
            this.size = size;
        }
    }

    /** Getter for the size. */
    public int getSize() {
        return size;
    }

    /** Returns the size of the box as a String, e.g. "10 x 10". */
    @Override
    public String toString() {
        return size + " x " + size;
    }

    /** Draws the box to the console. */
    public void draw() {

        // Top edge
        System.out.println(repeat('-', size));

        // Middle rows: a pipe, the empty space, then a pipe
        for (int row = 0; row < size - 2; row++) {
            System.out.println("|" + repeat(' ', size - 2) + "|");
        }

        // Bottom edge (skipped for sizes 1 and 2, where the edges already meet)
        if (size > 1) {
            System.out.println(repeat('-', size));
        }
    }

    /** Builds a String of the given character repeated count times. */
    private String repeat(char ch, int count) {

        // Unicode extension: use '+' instead of '-' for a continuous line
        // if (ch == '-') { return "\u2500".repeat(count); }

        StringBuilder line = new StringBuilder();
        for (int i = 0; i < count; i++) {
            line.append(ch);
        }
        return line.toString();
    }
}
