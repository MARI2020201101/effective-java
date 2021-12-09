package ch08.item50;

import java.util.Date;

public class PeriodAttackerV4 {
    public static void main(String[] args) {
        Date start = new DateSub();
        Date end = new DateSub();
        PeriodV4 p = new PeriodV4(start,end);
        System.out.println(p);
    }
}
