package lab2;
import java.util.Arrays;
import java.util.Scanner;

public class MyExample2 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите количество строк:");
        int n_rows = id.nextInt();
        System.out.println("Введите количество столбцов:");
        int n_cols = id.nextInt();

        int[][] arr = new int[n_rows][n_cols];
        int value = 1; // начинаем с 1

        for (int i = 0; i < n_rows; i++) {
            if (i % 2 == 0) {
                // чётная строка (0,2,4...) — слева направо
                for (int j = 0; j < n_cols; j++) {
                    arr[i][j] = value++;
                }
            } else {
                // нечётная строка (1,3,5...) — справа налево
                for (int j = n_cols - 1; j >= 0; j--) {
                    arr[i][j] = value++;
                }
            }
        }

        System.out.println("Массив:");
        for (int i = 0; i < n_rows; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
