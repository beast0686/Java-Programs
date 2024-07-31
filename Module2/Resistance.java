package Module2;

import java.util.Scanner;

class Resistors {
    public void calculation() {
        System.out.println("Select a combination");
    }
}

class Series extends Resistors {
    public void calculation() {
        int r1, r2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter value of two resistances");
        r1 = scanner.nextInt();
        r2 = scanner.nextInt();
        double result = r1 + r2;
        System.out.println("Result: " + result);
    }
}

class Parallel extends Resistors {
    public void calculation() {
        int r1, r2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter value of two resistances");
        r1 = scanner.nextInt();
        r2 = scanner.nextInt();
        double result = (r1 * r2) / (r1 + r2);
        System.out.println("Result: " + result);
    }
}

public class Resistance {
    public static void main(String[] args) {
        Resistors s = new Series();
        Resistors p = new Parallel();

        s.calculation();
        p.calculation();
    }
}
