package Module4;

import java.util.Scanner;

class Stack extends Thread {
    int[] stack = new int[100];
    int size;
    int top = -1;

    void push(int n) {
        if (top == size - 1) {
            try {
                wait();
            } catch (InterruptedException e) {

            }
        }
        stack[++top] = n;
    }

    int pop() {
        if (top == -1) {
            try {
                wait();
            } catch (InterruptedException e) {

            }
        }
        return stack[top--];
    }

    public synchronized void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of Stack");
        size = scanner.nextInt();
        System.out.println("Stack Elements");
        for (int i = 0; i <= size; i++) {
            System.out.println("Pushed Element: " + i);
            push(i);
            System.out.println("Poped Element: " + pop());
        }
        scanner.close();
    }
}

public class Stackoperations {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.run();
    }
}
