package lab1;

import java.util.Scanner;

public class MyExample11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите имя: ");
        String name = in.nextLine();

        System.out.println("Введите год рождения: ");
        int year = in.nextInt();

        int current_year = 2026;
        int age = current_year - year;

        System.out.println(name + ", в 2026 году ваш возраст будет: " + age);
    }
}
