package lab1;

import java.util.Scanner;

public class MyExample9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите название месяца: ");
        String month = in.nextLine();

        System.out.println("Введите количество дней в указанном месяце: ");
        String n_days = in.nextLine();

        System.out.println(month + " содержит " + n_days + " д.");
    }
}
