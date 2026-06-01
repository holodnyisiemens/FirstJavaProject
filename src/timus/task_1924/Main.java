package timus.task_1924;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) return;
        int n = scanner.nextInt();

        int remainder = n % 4;

        if (remainder == 1 || remainder == 2) {
            System.out.println("grimy");
        } else {
            System.out.println("black");
        }
    }
}
