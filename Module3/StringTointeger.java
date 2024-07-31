package Module3;

import java.util.Scanner;

public class StringTointeger {
    public static void main(String[] args) {
        try {
            String number;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number");
            number = scanner.nextLine();
            int n;
            n = Integer.parseInt(number);
            System.out.println("double of " + n + " is " + (n * 2));
            scanner.close();
        } catch (NumberFormatException e) {
            System.out.println("Invalid Input");
        }
    }
}
