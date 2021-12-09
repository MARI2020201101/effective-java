package ch07.item48;

import java.util.Random;

public class ThreadLocalRandom {
    public static void main(String[] args) {

        long start = System.nanoTime();
        long random = random();
        System.out.println("random: " + random);
        long end = System.nanoTime();
        System.out.println("소요 시간 : " + (end-start) + " ns");

        System.out.println("----------------------------------");
        long start2 = System.nanoTime();
        long random2 = threadLocalRandom();
        System.out.println("threadLocalRandom :"+ random2);
        long end2 = System.nanoTime();
        System.out.println("소요 시간 : " + (end2-start2) + " ns");
        System.out.println("성능차이 : " + (double)(end-start)/(end2-start2) + " 배");

    }
    public static long random(){
       return new Random().ints(1000,1,100).sum();
    }

    public static long threadLocalRandom(){
        //와. 성능쌉미쳤네. 개빠름 ㅋ
        return java.util.concurrent.ThreadLocalRandom.current().ints(1000,1,100).sum();
    }
}
