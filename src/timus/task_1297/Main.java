package timus.task_1297;

import java.util.Scanner;

public class Main {
    private static String expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();

        String longest = "";

        for (int i = 0; i < input.length(); i++) {

            String odd = expandAroundCenter(input, i, i);
            if (odd.length() > longest.length()) {
                longest = odd;
            }

            String even = expandAroundCenter(input, i, i + 1);
            if (even.length() > longest.length()) {
                longest = even;
            }
        }

        System.out.println(longest);
    }
}
