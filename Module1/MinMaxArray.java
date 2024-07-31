package Module1;

import java.util.Scanner;

public class MinMaxArray {
    public static void main(String[] args) {
        int[] array = new int[100];
        int size;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array");
        size = scanner.nextInt();
        System.out.println("Enter array elements");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int min = array[0];
        int max = array[0];
        for (int i = 0; i < size; i++) {
            if (array[i] < array[min]) {
                min = array[i];
            }
        }
        for (int i = 0; i < size; i++) {
            if (array[i] > array[max]) {
                max = array[i];
            }
        }
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
        scanner.close();
    }
}
