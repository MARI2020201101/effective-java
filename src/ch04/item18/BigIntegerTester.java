package ch04.item18;

import java.math.BigInteger;

public class BigIntegerTester {
    public static void main(String[] args) {
        int max = Integer.MAX_VALUE;
        System.out.println(max); //2147483647
        BigInteger value = new BigInteger("2147483648"); //immutable 함
        System.out.println(value); //오버플로우 안생기넹....왜징??
        System.out.println("------------------------");
        int x = 2;
        int y = 4;
        System.out.printf("[%s , %s]\n", Integer.toBinaryString(x) , Integer.toBinaryString(y));
        System.out.printf("%d , %s\n" , x ^ y, Integer.toBinaryString(x ^ y));
        System.out.printf("%d , %s\n" , x & y, Integer.toBinaryString(x & y));
        System.out.printf("%d , %s\n" ,x|y, Integer.toBinaryString(x|y));
        System.out.printf("%d , %s\n" , ~x, Integer.toBinaryString(~x));
        System.out.printf("%d , %s\n" , ~y, Integer.toBinaryString(~y));
    }
}
