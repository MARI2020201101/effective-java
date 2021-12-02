package ch03.item12;

import java.math.BigDecimal;
import java.math.BigInteger;

public class ToStringTester {
    public static void main(String[] args) {
        BigInteger b1 = new BigInteger("1111111");
        System.out.println(b1.toString(2));
        System.out.println(b1.toString(16));

        String format = String.format("%d", b1);
        System.out.println(format);
    }
}
