package lab5.task_2;

import java.util.Arrays;

public class EvenNumbers {
    public static int[] getEvenNumbers(int[] arr) {
        return Arrays.stream(arr)
                .filter(n -> n % 2 == 0)
                .toArray();
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5, 6};
        int[] result = getEvenNumbers(input);

        System.out.println("Чётные числа: " + Arrays.toString(result));
    }
}
