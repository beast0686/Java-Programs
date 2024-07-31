package Module3;

import java.util.Scanner;

interface Shapes {
    abstract void getdata();

    abstract void display();
}

class Rectangle implements Shapes {
    int l, b;
    double area;

    public void getdata() {
        System.out.println("Enter length and breadth of Rectangle");
        Scanner scanner = new Scanner(System.in);
        l = scanner.nextInt();
        b = scanner.nextInt();
    }

    public void display() {

        area = l * b;
        System.out.println("Area: " + area);
    }
}

class Triangle implements Shapes {
    int b, h;
    double area;

    public void getdata() {
        System.out.println("Enter length and breadth of Triangle");
        Scanner scanner = new Scanner(System.in);
        b = scanner.nextInt();
        h = scanner.nextInt();
    }

    public void display() {

        area = 0.5 * b * h;
        System.out.println("Area: " + area);
    }
}

class Circle implements Shapes {
    int r;
    double area;

    public void getdata() {
        System.out.println("Enter length and breadth of Circle");
        Scanner scanner = new Scanner(System.in);
        r = scanner.nextInt();
    }

    public void display() {

        area = 3.14 * r * r;
        System.out.println("Area: " + area);
    }
}

public class AreaCalculation {
    public static void main(String[] args) {
        Shapes r = new Rectangle();
        Shapes t = new Triangle();
        Shapes c = new Circle();

        r.getdata();
        r.display();

        t.getdata();
        t.display();

        c.getdata();
        c.display();
    }
}
