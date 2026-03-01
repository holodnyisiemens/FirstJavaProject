package lab1;

import java.util.Scanner;

public class MyExample13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое число для сложения: ");
        float num1 = in.nextFloat();

        System.out.println("Введите второе число для сложения: ");
        float num2 = in.nextFloat();

        float result = num1 + num2;

        System.out.println("Результат сложения: " + result);
    }
}
