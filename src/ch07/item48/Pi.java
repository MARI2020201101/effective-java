package ch07.item48;

import java.math.BigInteger;
import java.util.stream.LongStream;

public class Pi {
    public static void main(String[] args) {
        long start = System.nanoTime();
        long pi = pi((long) Math.pow(10, 7));
        System.out.println("10의 7승 이하의 소수 개수 : " + pi);
        long end = System.nanoTime();
        System.out.println("소요 시간 : " + (end-start) + " ns");

        System.out.println("----------------------------------");
        long start2 = System.nanoTime();
        long parallelpi = parallelpi((long) Math.pow(10, 7));
        System.out.println("10의 7승 이하의 소수 개수 : " + parallelpi);
        long end2 = System.nanoTime();
        System.out.println("소요 시간 : " + (end2-start2) + " ns");
        System.out.println("성능차이 : " + (double)(end-start)/(end2-start2) + " 배");

    }

    public static long pi(long n){
        return LongStream.rangeClosed(2,n)
                .mapToObj(BigInteger::valueOf)
                .filter(i-> i.isProbablePrime(50))
                .count();
    }
    public static long parallelpi(long n){
        return LongStream.rangeClosed(2,n)
                .mapToObj(BigInteger::valueOf)
                .parallel()
                .filter(i-> i.isProbablePrime(50))
                .count();
    }
}
