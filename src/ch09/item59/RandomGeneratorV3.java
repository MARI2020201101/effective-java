package ch09.item59;

import java.util.Random;

public class RandomGeneratorV3 {
    static Random random = new Random();

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(getRandomNumber(100));
        }
    }

    public static int getRandomNumber(int n){
        return random.nextInt(n); //이쪽 메서드를 사용하도록 한다~~~ bound 를 정할수있땅.
    }
}
