package lab1;

import java.util.Scanner;

public class MyExample8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите день недели: ");
        String weekday = in.nextLine();

        System.out.println("Введите месяц: ");
        String month = in.nextLine();

        System.out.println("Введите число: ");
        String day = in.nextLine();

        System.out.println("Введенная дата: " + weekday + ", " + month + " " + day);
    }
}
