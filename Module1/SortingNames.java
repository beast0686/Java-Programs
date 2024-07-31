package Module1;

import java.util.Scanner;

public class SortingNames {
    public static void main(String[] args) {
        String[] names = new String[100];
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of names");
        n = scanner.nextInt();
        System.out.println("Enter names");
        for (int i = 0; i < n; i++) {
            names[i] = scanner.nextLine();
        }
        System.out.println("Sorted names list");
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (names[i].compareTo(names[j]) > 0) {
                    String temp;
                    temp = names[j];
                    names[j] = names[i];
                    names[i] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(names[i]);
        }
        scanner.close();
    }
}
