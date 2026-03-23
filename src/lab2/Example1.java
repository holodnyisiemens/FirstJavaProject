package lab2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = id.nextInt();
        System.out.println("Размер массива равен " + size);
        int[] nums = new int[size];

        Random random = new Random();

        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(300);
            System.out.println("Элемет массива ["+i+"] = " + nums[i]);
        }

        Arrays.sort(nums);
        System.out.println("Произведена сортировка массива");
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Элемент массива ["+i+"] после сортировки = " + nums[i]);
        }
    }
}
