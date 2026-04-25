package lab5.task_6;

import java.util.List;
import java.util.stream.Collectors;

public class SubstringFilter {
    public static List<String> filterBySubstring(List<String> list, String substring) {
        return list.stream()
                .filter(s -> s.contains(substring))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> input = List.of("hello", "world", "hell", "java");

        List<String> result = filterBySubstring(input, "hell");
        System.out.println("Содержат 'hell': " + result);
    }
}