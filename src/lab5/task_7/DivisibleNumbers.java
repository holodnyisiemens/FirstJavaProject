package lab5.task_7;

import java.util.List;
import java.util.stream.Collectors;

public class DivisibleNumbers {
    public static List<Integer> filterDivisible(List<Integer> list, int divisor) {
        return list.stream()
                .filter(n -> n % divisor == 0)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> input = List.of(2, 3, 4, 6, 9);

        List<Integer> result = filterDivisible(input, 3);
        System.out.println("Делятся на 3: " + result);
    }
}