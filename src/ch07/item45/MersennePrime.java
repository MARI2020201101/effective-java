package ch07.item45;

import java.math.BigInteger;
import java.util.stream.Stream;

import static java.math.BigInteger.*;

public class MersennePrime {
    public static void main(String[] args) {
        init().map(p-> TWO.pow(p.intValueExact()).subtract(ONE))
                .filter(p -> p.isProbablePrime(50))
                .limit(20)
                .forEach(System.out::println);
    }

    public static Stream<BigInteger> init(){
        return Stream.iterate(TWO, BigInteger::nextProbablePrime);
    }
}
