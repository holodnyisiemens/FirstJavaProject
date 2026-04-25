package timus.task_1349;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        if (n == 0) {
            System.out.println(-1);
            return;
        }

        boolean found = false;

        outer:
        for (int a = 1; a <= 100; a++) {
            for (int b = a; b <= 100; b++) {
                for (int c = 1; c <= 100; c++) {
                    long left = pow(a, n) + pow(b, n);
                    long right = pow(c, n);
                    if (left == right) {
                        System.out.println(a + " " + b + " " + c);
                        found = true;
                        break outer;
                    }
                }
            }
        }

        if (!found) System.out.println(-1);
    }

    private static long pow(int base, int exp) {
        long result = 1;
        for (int i = 0; i < exp; i++) result *= base;
        return result;
    }
}
