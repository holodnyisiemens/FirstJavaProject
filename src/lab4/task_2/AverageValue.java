package lab4.task_2;

import java.util.*;

public class AverageValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Введите размер массива: ");
            int n = sc.nextInt();

            int[] arr = new int[n];

            System.out.println("Введите элементы:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int sum = 0;
            int count = 0;

            for (int x : arr) {
                if (x > 0) {
                    sum += x;
                    count++;
                }
            }

            if (count == 0) {
                throw new ArithmeticException("Нет положительных элементов");
            }

            double avg = (double) sum / count;
            System.out.println("Среднее: " + avg);

        } catch (InputMismatchException e) {
            System.out.println("Ошибка: введена строка вместо числа!");
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Неизвестная ошибка: " + e);
        } finally {
            System.out.println("Завершение программы (Task1)");
            sc.close();
        }
    }
}
