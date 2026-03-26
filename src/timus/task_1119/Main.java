package timus.task_1119;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();

        boolean[][] diag = new boolean[N + 1][M + 1];
        for (int i = 0; i < K; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            diag[x][y] = true;
        }

        double[][] dp = new double[N + 1][M + 1];
        // заполняем
        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= M; j++) {
                if (i == 0 && j == 0) continue;
                double best = Double.MAX_VALUE;
                if (i > 0) best = Math.min(best, dp[i - 1][j] + 100);
                if (j > 0) best = Math.min(best, dp[i][j - 1] + 100);
                if (i > 0 && j > 0 && diag[i][j])
                    best = Math.min(best, dp[i - 1][j - 1] + 100 * Math.sqrt(2));
                dp[i][j] = best;
            }
        }
        System.out.println(Math.round(dp[N][M]));
    }
}
