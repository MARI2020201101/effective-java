package ch04.item19;

import java.time.Instant;

public class Sub extends Super{
    private final Instant instant;

    public Sub(){
        System.out.println("Sub 생성자");
        this.instant = Instant.now();
    }

    @Override
    public void overrideMe() {
        System.out.println("instant : " + instant);
    }
}
