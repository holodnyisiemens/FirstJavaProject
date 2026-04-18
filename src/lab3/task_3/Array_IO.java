package lab3.task_3;
import java.util.Scanner;

public class Array_IO {
    public static void inputArray(int[] arr, int idx, Scanner sc) {
        if (idx == arr.length) {
            return; // базовый случай
        }
        System.out.print("arr[" + idx + "] = ");
        arr[idx] = sc.nextInt();
        inputArray(arr, idx + 1, sc); // рекурсия
    }

    public static void outputArray(int[] arr, int pos) {
        if (pos == arr.length) {
            return; // базовый случай
        }
        System.out.print(arr[pos] + " ");
        outputArray(arr, pos + 1); // рекурсия
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер для массива: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Введите элементы:");
        inputArray(array, 0, scanner);
        System.out.println("Полученный массив:");
        outputArray(array, 0);
        scanner.close();
    }
}