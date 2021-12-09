package ch08.item50;

import java.util.Date;
import java.util.Objects;

public class PeriodV3 {

    private Date start;
    private Date end;

    public PeriodV3(Date start, Date end) {
        Objects.requireNonNull(start);
        Objects.requireNonNull(end);

        Date realStart = new Date(start.getTime());
        Date realEnd = new Date(end.getTime());

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
