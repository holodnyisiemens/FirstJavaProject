package timus.task_1293;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // считываем 3 числа
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();

        // считаем вес сульфида
        int totalSulphide = N * 2 * A * B;

        System.out.println(totalSulphide);
    }
}