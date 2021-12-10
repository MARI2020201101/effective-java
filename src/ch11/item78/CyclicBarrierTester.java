package ch11.item78;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class CyclicBarrierTester {
    public static void main(String[] args) throws Exception {

        CyclicBarrier cyclicBarrier = new CyclicBarrier(5);
        ExecutorService es = Executors.newFixedThreadPool(4);
        for (int i = 0; i < 4; i++) {
            int n = i;
            es.submit(() -> {
                cyclicBarrier.await();
                System.out.println("order :: " + n);
                return 1;
            });
        }
        TimeUnit.SECONDS.sleep(1);
        cyclicBarrier.await();
        es.shutdown();
        System.out.println("finish");
    }

}
