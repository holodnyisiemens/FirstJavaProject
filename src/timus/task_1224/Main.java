package timus.task_1224;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long N = scanner.nextLong();
        long M = scanner.nextLong();

        if (N == 1 || M == 1) {
            System.out.println(0);
        } else {
            long turns = 2 * Math.min(N, M) - 2;
            System.out.println(turns);
        }

        scanner.close();
    }
}
