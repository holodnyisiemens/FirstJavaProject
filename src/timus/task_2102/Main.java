package timus.task_2102;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextLong()) return;
        long n = scanner.nextLong();

        int sumOfPowers = 0;

        for (long d = 2; d * d <= n; d++) {
            if (sumOfPowers < 20 && n < (1L << (20 - sumOfPowers))) {
                break;
            }

            while (n % d == 0) {
                sumOfPowers++;
                n /= d;

                if (sumOfPowers > 20) {
                    System.out.println("No");
                    return;
                }
            }
        }

        if (n > 1) {
            sumOfPowers++;
        }

        if (sumOfPowers == 20) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
