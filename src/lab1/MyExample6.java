package lab1;

import java.util.Scanner;

public class MyExample6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите фамилию: ");
        String lastname = in.nextLine();

        System.out.println("Введите имя: ");
        String firstname = in.nextLine();

        System.out.println("Введите отчество: ");
        String patronymic = in.nextLine();

        System.out.println("Hello, " + lastname + " " + firstname + " " + patronymic);
    }
}
