package ch11.item81;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class CountDownLatchTester {

    private static AtomicInteger count = new AtomicInteger(0);
    public static void main(String[] args) throws InterruptedException {

        long time = time(Executors.newFixedThreadPool(10), 10, () -> {
            System.out.println("hello > " + count.addAndGet(1));
        });
        System.out.println("total time : " + time);
    }

    public static long time(Executor executor, int concurrency, Runnable action) throws InterruptedException {
        CountDownLatch ready = new CountDownLatch(concurrency);
        CountDownLatch start = new CountDownLatch(1);
        CountDownLatch done = new CountDownLatch(concurrency);

        for (int i = 0; i < concurrency; i++) {
            executor.execute(()->{
                ready.countDown(); //카운트다운이 0이되면 기다리고 있던 스레드들이 해방된다.
                System.out.println("ready.getCount() : " + ready.getCount());
                try {
                    start.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                action.run();
                done.countDown();//작업을 마친후 다른 스레드들이 종료할때까지 기다린다.
            });
        }
        ready.await();
        long startTime = System.nanoTime();
        start.countDown();
        done.await();
        return System.nanoTime()-startTime;
    }
}
