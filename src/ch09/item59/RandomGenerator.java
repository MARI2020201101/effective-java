package ch09.item59;

import java.util.Random;

public class RandomGenerator {
    public static void main(String[] args) {

        System.out.println(getRandomNumber(100));
        System.out.println(getRandomNumber2(100));
        System.out.println(getRandomNumber3(100));
    }

    public static int getRandomNumber(int n){
        Random random = new Random();
        int i = random.nextInt();
        return Math.abs(i); //32비트의 랜덤넘버를 생성한다.
    }
    public static int getRandomNumber2(int n){
        Random random = new Random();
        int i = random.nextInt();
        return Math.abs(i) % n; //아!! 모듈러 연산을 쓰면. 해당 n 미만의 값만 나오는구나!!! 럴쑤럴쑤...
    }

    public static int getRandomNumber3(int n){
        Random random = new Random();
        int i = random.nextInt(); //음수값도 반환한다.
        return i;
    }
}
