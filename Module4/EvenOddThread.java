package Module4;

import java.util.Scanner;

class Even extends Thread {
    public void run() {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter range limit");
        n = scanner.nextInt();
        for (int i = 0; i <= n; i += 2) {
            System.out.println("Even: " + i);
        }
    }
}

class Odd extends Thread {
    public void run() {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter range limit");
        n = scanner.nextInt();
        for (int i = 1; i <= n; i += 2) {
            System.out.println("Even: " + i);
        }
    }
}

public class EvenOddThread {
    public static void main(String[] args) {
        Even e = new Even();
        Odd o = new Odd();

        e.run();
        o.run();
    }
}
