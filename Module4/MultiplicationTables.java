package Module4;

import java.util.Scanner;

class Tables extends Thread {
    public void run() {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        n = scanner.nextInt();
        System.out.println("Multiplication Table of " + n);
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }
        scanner.close();
    }
}

public class MultiplicationTables {
    public static void main(String[] args) {
        Tables t = new Tables();
        t.run();
    }
}
