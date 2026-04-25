package lab4.task_2;

import java.util.*;

public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Введите строки и столбцы: ");
            int rows = sc.nextInt();
            int cols = sc.nextInt();

            int[][] matrix = new int[rows][cols];

            System.out.println("Введите матрицу:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }

            System.out.print("Введите номер столбца: ");
            int col = sc.nextInt();

            if (col < 0 || col >= cols) {
                throw new ArrayIndexOutOfBoundsException("Нет такого столбца");
            }

            System.out.println("Столбец:");
            for (int i = 0; i < rows; i++) {
                System.out.println(matrix[i][col]);
            }

        } catch (InputMismatchException e) {
            System.out.println("Ошибка: введена строка вместо числа!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Неизвестная ошибка: " + e);
        } finally {
            System.out.println("Завершение программы (Task2)");
            sc.close();
        }
    }
}
