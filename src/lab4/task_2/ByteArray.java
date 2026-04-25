package lab4.task_2;

import java.util.*;

public class ByteArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Введите размер массива: ");
            int n = sc.nextInt();

            byte[] arr = new byte[n];

            System.out.println("Введите элементы:");
            for (int i = 0; i < n; i++) {
                int temp = sc.nextInt();

                if (temp < Byte.MIN_VALUE || temp > Byte.MAX_VALUE) {
                    throw new ArithmeticException("Число вне диапазона byte");
                }

                arr[i] = (byte) temp;
            }

            int sum = 0;

            for (byte b : arr) {
                sum += b;

                if (sum < Byte.MIN_VALUE || sum > Byte.MAX_VALUE) {
                    throw new ArithmeticException("Переполнение при вычислении суммы");
                }
            }

            System.out.println("Сумма: " + sum);

        } catch (InputMismatchException e) {
            System.out.println("Ошибка: введена строка вместо числа!");
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Неизвестная ошибка: " + e);
        } finally {
            System.out.println("Завершение программы (Task3)");
            sc.close();
        }
    }
}
