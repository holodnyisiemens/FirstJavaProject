package lab1;

import java.util.Scanner;

public class MyExample14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите целое число: ");
        int num = in.nextInt();
        int prev_num = num - 1;
        int next_num = num + 1;
        int nums_sum = prev_num + num + next_num;
        int squared_nums_sum = nums_sum * nums_sum;

        System.out.println("Предыдущее число: " + prev_num);
        System.out.println("Введенное число: " + num);
        System.out.println("Следующее число: " + next_num);
        System.out.println("Квадрат суммы трех чисел: " + squared_nums_sum);
    }
}
