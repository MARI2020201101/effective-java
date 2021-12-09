package ch08.item50;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class PeriodAttackerV2 {
    public static void main(String[] args) {
        Instant start = Instant.now();
        Instant end = Instant.now();
        PeriodV2 p = new PeriodV2(start, end);
        System.out.println(p);
        Instant plus = start.plus(100, ChronoUnit.DAYS); //내부적으로 new Instant() 해서 새로 생성함.
        System.out.println(p);//영향받지않는다! Instant는 LocalDateTime과 같은 불변클래스이다.

    }
}
