package lab6.task4;

public class SelfNumber {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            int threadNumber = i;

            Thread thread = new Thread(() -> {
                System.out.println("Поток № " + threadNumber);
            });

            thread.start();
        }
    }
}
