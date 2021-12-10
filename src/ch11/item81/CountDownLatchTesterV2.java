package ch11.item81;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class CountDownLatchTesterV2 {

    private static AtomicInteger count = new AtomicInteger(0);
    public static void main(String[] args) throws InterruptedException {

        time(Executors.newFixedThreadPool(10), 10, () -> {
            System.out.println("hello > " + count.addAndGet(1));
        });
    }

    public static void time(Executor executor, int concurrency, Runnable action) throws InterruptedException {
        CountDownLatch ready = new CountDownLatch(concurrency);

        for (int i = 0; i < concurrency; i++) {
            executor.execute(()->{
                ready.countDown();
                System.out.println("ready.getCount() : " + ready.getCount());
                action.run();
            });
        }
//        ready.await();

    }
}
