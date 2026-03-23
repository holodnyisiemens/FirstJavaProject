package lab2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MyExample1 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = id.nextInt();

        int[] nums = new int[size];
        Random random = new Random();
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(10);
        }
        System.out.println("Сгенерированный массив: " + Arrays.toString(nums));

        // Поиск минимума
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        System.out.println("Минимальный элемент: " + min);

        // Вывод индексов минимальных элементов
        System.out.print("Индексы: ");
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == min) {
                System.out.print(i + " ");
            }
        }
    }
}
