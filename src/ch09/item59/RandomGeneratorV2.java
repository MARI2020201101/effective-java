package ch09.item59;

import java.util.Random;

public class RandomGeneratorV2 {
    static Random random = new Random();

    public static void main(String[] args) {
        int n = 2*(Integer.MAX_VALUE/3);
        int mid = n/2;
        for (int i = 0; i < 10; i++) {
            int lowerThanMid = 0;
            for (int j = 0; j < 10000; j++) {
                int randomNumber = getRandomNumber(n);
                if(randomNumber < mid) lowerThanMid++;
            }
            System.out.println("중간값보다 적은 랜덤넘버 개수 : " + lowerThanMid);
        }
        //대략 6600~6700개정도가 나온다. 랜덤하게 생성되지 않고 있따!!
    }

    public static int getRandomNumber(int n){
        return Math.abs(random.nextInt()) % n;
    }
}
