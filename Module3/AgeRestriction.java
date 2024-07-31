package Module3;

import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class AgeRestriction {
    public static void main(String[] args) {
        int age;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter age");
        age = scanner.nextInt();
        scanner.close();
        try {
            if (age < 0 || age > 150) {
                throw new InvalidAgeException("Invalid Age Input");
            } else {
                System.out.println("Valid Age Input");
            }
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
