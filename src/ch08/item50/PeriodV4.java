package ch08.item50;

import java.util.Date;
import java.util.Objects;

public class PeriodV4 {

    private Date start;
    private Date end;

    public PeriodV4(Date start, Date end) {
        Objects.requireNonNull(start);
        Objects.requireNonNull(end);

        Date realStart = (Date) start.clone();
        Date realEnd = (Date) end.clone();

        if(realStart.compareTo(realEnd)>0){
            throw new IllegalArgumentException("시작일이 종료일보다 클수없습니다! ");
        }
        this.start=realStart;
        this.end=realEnd;
    }
    public Date start(){
        return start;
    }
    public Date end(){
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
