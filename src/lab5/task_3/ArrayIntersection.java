package lab5.task_3;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class ArrayIntersection {
    public static int[] intersect(int[] arr1, int[] arr2) {
        Set<Integer> set = Arrays.stream(arr2).boxed().collect(Collectors.toSet());

        return Arrays.stream(arr1)
                .filter(set::contains)
                .toArray();
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {3, 4, 5, 6};

        int[] result = intersect(arr1, arr2);
        System.out.println("Пересечение: " + Arrays.toString(result));
    }
}