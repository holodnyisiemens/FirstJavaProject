package lab1;

import java.util.Scanner;

public class MyExample7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите имя: ");
        String name = in.nextLine();

        System.out.println("Введите возраст: ");
        String age = in.nextLine();

        System.out.println("Здравствуйте, " + name + ". Ваш возраст: " + age);
    }
}
