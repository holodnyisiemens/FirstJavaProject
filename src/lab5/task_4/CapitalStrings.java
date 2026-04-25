package lab5.task_4;

import java.util.List;
import java.util.stream.Collectors;

public class CapitalStrings {
    public static List<String> filterCapitalized(List<String> list) {
        return list.stream()
                .filter(s -> !s.isEmpty() && Character.isUpperCase(s.charAt(0)))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> input = List.of("Hello", "world", "Java", "stream");

        List<String> result = filterCapitalized(input);
        System.out.println("С заглавной буквы: " + result);
    }
}