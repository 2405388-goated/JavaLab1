import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int original = number;
        int reverse = 0;

        while (number != 0) {
            reverse = reverse * 10 + number % 10;
            number /= 10;
        }

        if (original == reverse)
            System.out.println("The number is palindrome");
        else
            System.out.println("The number is not a palindrome");
    }
}
