package lab5.task_8;

import java.util.List;
import java.util.stream.Collectors;

public class LengthFilter {
    public static List<String> filterByLength(List<String> list, int minLength) {
        return list.stream()
                .filter(s -> s.length() > minLength)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> input = List.of("hi", "hello", "java", "stream");

        List<String> result = filterByLength(input, 4);
        System.out.println("Длина > 4: " + result);
    }
}