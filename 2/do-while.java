import java.util.Scanner;

public class do_while {
    public static void main(String[] args) {


    Scanner s = new Scanner(System.in);

    int n;
    do {
        System.out.println("Enter number: ");
        n = s.nextInt();
    } while (n < 1 || n > 10);

    System.out.println(n + " is between 1 and 10");

    }
}