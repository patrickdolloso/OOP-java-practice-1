/*
 * Exercise: write a program which reads a sequence of positive integers.
 * This stops when the user fills a negative value and shows the max and min of these numbers
 */

import java.util.Scanner;

public class example5a {
 
    public static void main(String[] args) {
        
        System.out.println("Enter positive integers: ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int max = n;
        int min = n;

        while(true) {
            n = s.nextInt();
            if(n < 0)
                break;
            
            if(n > max)
                max = n;

            if(n < min)
                min = n;
        }

        System.out.println("min = " + min + " max = " + max);

    }
 }