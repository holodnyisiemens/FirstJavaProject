package lab6.task1;

import java.time.LocalTime;

public class NameAndTime {
    public static void main(String[] args) {
        Runnable task = () -> {
            long endTime = System.currentTimeMillis() + 10000;

            while (System.currentTimeMillis() < endTime) {
                String threadName = Thread.currentThread().getName();
                LocalTime currentTime = LocalTime.now();

                System.out.println(threadName + " - " + currentTime);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread thread1 = new Thread(task, "Поток-1");
        Thread thread2 = new Thread(task, "Поток-2");

        thread1.start();
        thread2.start();
    }
}
