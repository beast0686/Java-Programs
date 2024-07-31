package Module4;

import java.util.Scanner;

class ProduceAndConsume extends Thread {
    int[] buffer = new int[100];
    int size;
    int top = -1;

    void produce(int n) {
        if (top == size - 1) {
            try {
                wait();
            } catch (InterruptedException e) {

            }
        }
        buffer[++top] = n;
    }

    int consume() {
        if (top == -1) {
            try {
                wait();
            } catch (InterruptedException e) {

            }
        }
        return buffer[top--];
    }

    public synchronized void run() {
        System.out.println("Enter size of buffer");
        Scanner scanner = new Scanner(System.in);
        size = scanner.nextInt();
        for (int i = 0; i <= size; i++) {
            System.out.println("Produced element: " + i);
            produce(i);
            System.out.println("consumed element: " + consume());
        }
        scanner.close();
    }
}

public class ProducerAndConsumer {
    public static void main(String[] args) {
        ProduceAndConsume pc = new ProduceAndConsume();
        pc.run();
    }
}
