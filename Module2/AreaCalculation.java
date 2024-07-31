package Module2;

import java.util.Scanner;

class Shapes {
    public void CalculateArea() {
        System.out.println("Choose a Shape");
    }
}

class Rectangle extends Shapes {
    public void CalculateArea() {
        int l, b;
        System.out.println("Enter length and breadth of Rectangle");
        Scanner scanner = new Scanner(System.in);
        l = scanner.nextInt();
        b = scanner.nextInt();
        double area;
        area = l * b;
        System.out.println("Area: " + area);
    }
}

class Triangle extends Shapes {
    public void CalculateArea() {
        int b, h;
        System.out.println("Enter length and breadth of Triangle");
        Scanner scanner = new Scanner(System.in);
        b = scanner.nextInt();
        h = scanner.nextInt();
        double area;
        area = 0.5 * b * h;
        System.out.println("Area: " + area);
    }
}

class Circle extends Shapes {
    public void CalculateArea() {
        int r;
        System.out.println("Enter length and breadth of Circle");
        Scanner scanner = new Scanner(System.in);
        r = scanner.nextInt();
        double area;
        area = 3.14 * r * r;
        System.out.println("Area: " + area);
    }
}

public class AreaCalculation {
    public static void main(String[] args) {
        Shapes r = new Rectangle();
        Shapes t = new Triangle();
        Shapes c = new Circle();

        r.CalculateArea();
        t.CalculateArea();
        c.CalculateArea();
    }
}
