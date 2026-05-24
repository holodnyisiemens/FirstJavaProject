package timus.task_1502;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();

        long result = N * (N + 1) * (N + 2) / 2;

        System.out.println(result);
    }
}
