package lab6.task6;

public class SumElement {
    public static int parallelSum(int[] array) throws InterruptedException {
        int cores = Runtime.getRuntime().availableProcessors();
        int length = array.length;
        int chunkSize = (int) Math.ceil((double) length / cores);

        int[] partialSums = new int[cores];
        Thread[] threads = new Thread[cores];

        for (int i = 0; i < cores; i++) {
            final int index = i;
            int start = i * chunkSize;
            int end = Math.min(start + chunkSize, length);

            threads[i] = new Thread(() -> {
                int sum = 0;
                for (int j = start; j < end; j++) {
                    sum += array[j];
                }
                partialSums[index] = sum;
            });

            threads[i].start();
        }

        for (Thread t : threads) {
            t.join();
        }

        int total = 0;
        for (int s : partialSums) {
            total += s;
        }

        return total;
    }

    public static void main(String[] args) throws InterruptedException {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int sum = parallelSum(array);
        System.out.println("Сумма: " + sum);
    }
}
