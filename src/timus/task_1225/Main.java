package timus.task_1225;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        if (N == 1) {
            System.out.println(2);
            return;
        }
        if (N == 2) {
            System.out.println(2);
            return;
        }
        if (N == 3) {
            System.out.println(4);
            return;
        }

        long[] dp = new long[N + 1];

        dp[1] = 2;
        dp[2] = 2;
        dp[3] = 4;

        for (int i = 4; i <= N; i++) {
            dp[i] = dp[i - 1] + dp[i - 3];
        }

        System.out.println(dp[N]);
    }

}
