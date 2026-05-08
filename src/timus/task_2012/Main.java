package timus.task_2012;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f = sc.nextInt();
        sc.close();

        int totalTasks = 12;
        int remainingTasks = totalTasks - f;
        int timeNeeded = remainingTasks * 45;
        int availableTime = 4 * 60;

        if (timeNeeded <= availableTime) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
