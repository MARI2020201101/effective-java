package ch11;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownLatchTester {
    public static void main(String[] args) throws Exception {
        CountDownLatch countDownLatch = new CountDownLatch(5);
        ExecutorService es = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 4; i++) {
            int n = i;
            es.execute(() -> {
                countDownLatch.countDown();
                System.out.println("order :: " + n);
            });
        }
        countDownLatch.await();
        es.shutdown();
        System.out.println("finish");
    }


}
