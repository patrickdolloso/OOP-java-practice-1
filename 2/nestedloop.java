/* Nested Loops
 * A loop can be nested inside another loop.
 * Nested loops consist of an outer loop and one or more inner loops
 * Each time the outer loop is executed, the inner loops are executed again
 * 
 */

public class nestedloop {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <= 2; j++) {
                System.out.println(i + " " + j);
            }
        }
    }
}