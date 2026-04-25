package lab3.task_6;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Link {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите N: ");
        int n = scanner.nextInt();

        // Засекаем время начала
        long startTime = System.nanoTime();

        List<Integer> list = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }

        int index = 0;
        while (list.size() > 1) {
            index = (index + 1) % list.size();
            list.remove(index);
        }
        System.out.println("Результат: " + list.get(0));

        // Засекаем время окончания и выводим результат
        long endTime = System.nanoTime();
        double durationMs = (endTime - startTime) / 1_000_000.0;
        System.out.printf("Время выполнения: %.3f мс%n", durationMs);
    }
}