package lab5.task_10;

import java.util.List;
import java.util.stream.Collectors;

public class OnlyLetters {
    public static List<String> filterOnlyLetters(List<String> list) {
        return list.stream()
                .filter(s -> s.matches("[a-zA-Z]+"))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> input = List.of("hello", "java123", "world", "test!");

        List<String> result = filterOnlyLetters(input);
        System.out.println("Только буквы: " + result);
    }
}