package Module1;

import java.util.Scanner;

public class BitwiseXOR {
    public static void main(String[] args) {
        int n1, n2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers");
        n1 = scanner.nextInt();
        n2 = scanner.nextInt();
        int result;
        result = n1 ^ n2;
        System.out.println("Result: " + result);
        scanner.close();
    }
}
