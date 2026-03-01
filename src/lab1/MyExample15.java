package lab1;

import java.util.Scanner;

public class MyExample15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        float num1 = in.nextFloat();

        System.out.println("Введите второе число: ");
        float num2 = in.nextFloat();

        float sum = num1 + num2;
        float diff = num1 - num2;

        System.out.println("Сумма чисел: " + sum);
        System.out.println("Разность чисел: " + diff);
    }
}
