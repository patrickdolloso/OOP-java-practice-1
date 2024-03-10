import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Enter a number between 1 and 10: ");

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        while(n < 1 || n > 10) {
            System.out.println(n + " is not between 1 and 10. Try again: ");
            n = s.nextInt();
        }

        System.out.println(n + " is between 1 and 10");

    }

}