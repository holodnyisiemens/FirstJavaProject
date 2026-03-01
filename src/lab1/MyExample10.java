package lab1;

import java.util.Scanner;

public class MyExample10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите Ваш год рождения: ");
        int year = in.nextInt();

        int current_year = 2026;
        int age = current_year - year;

        System.out.println("В 2026 году ваш возраст будет: " + age);
    }
}
