package timus.task_1493;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int num = Integer.parseInt(s);

        if (isLucky(num - 1) || isLucky(num + 1)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    static boolean isLucky(int num) {
        if (num < 0 || num > 999999) return false;

        String s = String.format("%06d", num);

        int sum1 = (s.charAt(0) - '0') +
                (s.charAt(1) - '0') +
                (s.charAt(2) - '0');

        int sum2 = (s.charAt(3) - '0') +
                (s.charAt(4) - '0') +
                (s.charAt(5) - '0');

        return sum1 == sum2;
    }
}
