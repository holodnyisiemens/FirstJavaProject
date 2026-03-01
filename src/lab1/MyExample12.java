package lab1;

import java.util.Scanner;

public class MyExample12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Сколько лет вам будет в 2026 году: ");
        int age = in.nextInt();

        int current_year = 2026;
        int birth_year = current_year - age;

        System.out.println("Ваш год рождения: " + birth_year);
    }
}
