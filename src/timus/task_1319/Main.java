package timus.task_1319;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        int[][] table = new int[N][N];
        int num = 1;

        for (int d = 0; d <= 2*(N-1); d++) {

            for (int i = 0; i < N; i++) {
                int j = N - 1 - d + i;
                if (j >= 0 && j < N) {
                    table[i][j] = num++;
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(table[i][j]);
                if (j != N-1) System.out.print(" ");
            }
            System.out.println();
        }
    }
}
