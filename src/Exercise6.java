/**
 * Workshop 6 - Exercise 6 (Easy)
 * Runs the code from the question to show what it prints.
 *
 * Answers:
 *   Class variable     : x  (declared static, one copy shared by all objects)
 *   Instance variable  : y  (declared without static, one copy per object)
 */
public class Exercise6 {

    public static void main(String[] args) {

        IdentifyMyParts a = new IdentifyMyParts();
        IdentifyMyParts b = new IdentifyMyParts();

        a.y = 5;
        b.y = 6;
        a.x = 1;
        b.x = 2;

        System.out.println("a.y = " + a.y);
        System.out.println("b.y = " + b.y);
        System.out.println("a.x = " + a.x);
        System.out.println("b.x = " + b.x);
        System.out.println("IdentifyMyParts.x = " + IdentifyMyParts.x);
    }
}
