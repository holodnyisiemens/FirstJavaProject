package timus.task_1295;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int zeros;
        int r = n % 4;

        if (r == 0) {
            zeros = 0;
        } else if (r == 3) {
            zeros = 2;
        } else {
            zeros = 1;
        }

        System.out.println(zeros);
    }
}
