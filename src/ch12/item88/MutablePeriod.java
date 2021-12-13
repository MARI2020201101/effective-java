package ch12.item88;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class MutablePeriod implements Serializable {

    public Date start;
    public Date end;

    public MutablePeriod(Date start, Date end) {
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
        return new Date(start.getTime());
    }
    public Date end(){
        return new Date(end.getTime());
    }

    @Override
    public String toString() {
        return "Period{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MutablePeriod period = (MutablePeriod) o;
        return Objects.equals(start, period.start) && Objects.equals(end, period.end);
    }

    @Override
    public int hashCode() {
        return Objects.hash(start, end);
    }
}
