package ch08.item50;

import java.time.Instant;
import java.util.Objects;

public class PeriodV2 {

    private Instant start;
    private Instant end;

    public PeriodV2(Instant start, Instant end) {
        Objects.requireNonNull(start);
        Objects.requireNonNull(end);

        if(start.compareTo(end)>0){
            throw new IllegalArgumentException("시작일이 종료일보다 클수없습니다! ");
        }
        this.start=start;
        this.end=end;
    }
    public Instant start(){
        return start;
    }
    public Instant end(){
        return end;
    }

    @Override
    public String toString() {
        return "Period{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }
}
