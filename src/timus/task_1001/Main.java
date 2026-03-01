package timus.task_1001;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // список для хранения чисел
        ArrayList<Long> numbers = new ArrayList<>();

        // считываем все числа
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
