package ch08.item50;

import java.util.Date;
import java.util.Objects;

public class Period {

    private Date start;
    private Date end;

    public Period(Date start, Date end) {
        Objects.requireNonNull(start);
        Objects.requireNonNull(end);

        if(start.compareTo(end)>0){
            throw new IllegalArgumentException("시작일이 종료일보다 클수없습니다! ");
        }
        this.start=start;
        this.end=end;
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
