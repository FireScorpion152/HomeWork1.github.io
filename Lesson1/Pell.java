package Lesson1;

import java.util.Scanner;

public class Pell {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            if (0 <= n && n <= 30) {
                int[] a = new int[n];
                int p = 0;
                for (int i = 0; i < a.length; i++) {
                    if (i < 2) {
                        a[i] = p + 1;
                    } else a[i] = (2 * a[i - 1]) + a[i - 2];
                    p = a[i];
                }
                System.out.println(p);

            } else {
                System.out.println("Wrong number");
            }
        }
    }
}
