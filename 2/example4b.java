/*
 * Another example of prime checking
 * Iterate over all possible divisors except 1 and N
 */

import java.util.Scanner;

public class example4b {

    public static void main(String[] args) {
        System.out.println("Enter number: ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        boolean isPrime = true;
        for (int i = 2; i <= n/2; i++)
            if (n % i == 0) {
                isPrime = false;
                break;
            }

            System.out.println(isPrime ? "Prime" : "Not Prime");
    }
}