package timus.task_1011;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // массив для чисел типа лонг
        ArrayList<Long> numbers = new ArrayList<>();

        // считываем числа
        while (sc.hasNextLong()) {
            long num = sc.nextLong();
            numbers.add(num);
        }

        // выводим квадратные корни в обратном порядке
        for (int i = numbers.size() - 1; i >= 0; i--) {
            double sqrt = Math.sqrt(numbers.get(i));

            // округляем до 4 знаков после запятой
            double rounded = Math.round(sqrt * 10000.0) / 10000.0;

            System.out.println(rounded);
        }
    }
}