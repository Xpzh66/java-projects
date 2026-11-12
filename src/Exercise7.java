/**
 * Workshop 6 - Exercise 7 (Medium)
 * Driver class: creates Boxes objects and tests every method of the class.
 */
public class Exercise7 {

    public static void main(String[] args) {

        // Box 1: created straight through the constructor
        Boxes smallBox = new Boxes(5);
        System.out.println("Box size: " + smallBox);
        smallBox.draw();

        System.out.println();

        // Box 2: created first, then resized through the setter
        Boxes largeBox = new Boxes(3);
        largeBox.setSize(8);
        System.out.println("Box size: " + largeBox);
        largeBox.draw();

        System.out.println();

        // Size limits: too big is trimmed to 10, too small is raised to 1
        Boxes tooBig = new Boxes(15);
        System.out.println("Box size: " + tooBig);
        tooBig.draw();
    }
}
