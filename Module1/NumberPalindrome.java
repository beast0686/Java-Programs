package Module1;

import java.util.Scanner;

public class NumberPalindrome {
    static void isNumberPalindrome() {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        number = scanner.nextInt();
        int n = number;
        int r = 0;
        while (number != 0) {
            int d = number % 10;
            r = r * 10 + d;
            number = number / 10;
        }
        if (n == r) {
            System.out.println("Number is Palindrome");
        } else {
            System.out.println("Number is not Palindrome");
        }
        scanner.close();
    }

    public static void main(String[] args) {
        isNumberPalindrome();
    }
}