package ch03.item10;

import java.util.concurrent.atomic.AtomicInteger;

public class CounterPoint extends PointV2{
    private static final AtomicInteger counter=new AtomicInteger();

    public CounterPoint(int x, int y) {
        super(x, y);

        counter.addAndGet(1);
    }

    public static int count(){
        return counter.get();
    }
}
