package ch11;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class UniqueNumberGeneratorTester {
    public static int THREAD_NUMBER = 1000;

    public static void main(String[] args) throws InterruptedException {

        ExecutorService executor = Executors.newFixedThreadPool(10);
        CountDownLatch countDown = new CountDownLatch(THREAD_NUMBER);

        Runnable task = () -> {
            countDown.countDown(); //카운트를 -1 씩 하면서, 0이 되면 기다리던 스레드들이 release된다. 
            UniqueNumberGenerator u = new UniqueNumberGenerator();
            System.out.println("get unique number!! > "+u.generateUniqueNum());
        };

        for (int i = 0; i < THREAD_NUMBER; i++) {
            executor.submit(task);
        }

        countDown.await(); //해당 latch가 0이 될때까지 기다린다.
        System.out.println("****************\n finish! \n****************");
        executor.shutdown();
    }
}
