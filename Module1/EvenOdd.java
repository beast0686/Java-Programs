package Module1;

import java.util.Scanner;

class EvenOdd {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + " is Even number");
        } else {
            System.out.println(number + " is Odd number");
        }
        scanner.close();
    }
}