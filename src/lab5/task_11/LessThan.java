package lab5.task_11;

import java.util.List;
import java.util.stream.Collectors;

public class LessThan {
    public static List<Integer> filterLess(List<Integer> list, int value) {
        return list.stream()
                .filter(n -> n < value)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> input = List.of(1, 5, 10, 3);

        List<Integer> result = filterLess(input, 5);
        System.out.println("Меньше 5: " + result);
    }
}
