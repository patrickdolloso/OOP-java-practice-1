/*
 * Example 4: Write a program which reads a positive number N from the user then indicates if it is prime or not
 * N is a prime number if its only divisor are 1 and N
 */

import java.util.Scanner;

public class example4 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = s.nextInt();
        int sum = 1;
        for (int i = 2; i <= n/2; i++)
            if(n%i == 0)
                sum += i;
            System.out.println(sum == 1 ? "prime" : "not prime");

    }
}