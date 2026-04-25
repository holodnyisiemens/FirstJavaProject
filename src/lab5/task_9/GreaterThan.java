package lab5.task_9;

import java.util.List;
import java.util.stream.Collectors;

public class GreaterThan {
    public static List<Integer> filterGreater(List<Integer> list, int value) {
        return list.stream()
                .filter(n -> n > value)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> input = List.of(1, 5, 10, 3);

        List<Integer> result = filterGreater(input, 4);
        System.out.println("Больше 4: " + result);
    }
}
