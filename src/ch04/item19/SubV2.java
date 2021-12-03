package ch04.item19;

import java.time.Instant;

public class SubV2 extends Super{
    private final Instant instant;

    public SubV2(){
        System.out.println("SubV2 생성자");
        this.instant = Instant.now();
    }

    @Override
    public void overrideMe() {
        Instant instant2 = this.instant.minusSeconds(1);
        System.out.println(instant2);
        //System.out.println("NPE 발생!!");
    }
}
