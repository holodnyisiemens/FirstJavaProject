package lab6.task5;

import java.util.Arrays;

public class FindMax {
    public static int findMax(int[] array) throws InterruptedException {
        int cores = Runtime.getRuntime().availableProcessors();
        int length = array.length;
        int chunkSize = (int) Math.ceil((double) length / cores);

        int[] partialMax = new int[cores];
        Thread[] threads = new Thread[cores];

        for (int i = 0; i < cores; i++) {
            final int index = i;
            int start = i * chunkSize;
            int end = Math.min(start + chunkSize, length);

            threads[i] = new Thread(() -> {
                int max = Integer.MIN_VALUE;
                for (int j = start; j < end; j++) {
                    if (array[j] > max) {
                        max = array[j];
                    }
                }
                partialMax[index] = max;
            });

            threads[i].start();
        }

        for (Thread t : threads) {
            t.join();
        }

        return Arrays.stream(partialMax).max().getAsInt();
    }

    public static void main(String[] args) throws InterruptedException {
        int[] array = {5, 12, 3, 19, 7, 25, 1, 30, 18, 2};

        int max = findMax(array);
        System.out.println("Максимум: " + max);
    }
}
