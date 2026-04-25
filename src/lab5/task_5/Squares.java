package lab5.task_5;

import java.util.List;
import java.util.stream.Collectors;

public class Squares {
    public static List<Integer> getSquares(List<Integer> list) {
        return list.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> input = List.of(1, 2, 3, 4);

        List<Integer> result = getSquares(input);
        System.out.println("Квадраты: " + result);
    }
}