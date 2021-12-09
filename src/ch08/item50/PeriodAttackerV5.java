package ch08.item50;

import java.util.Date;

public class PeriodAttackerV5 {
    public static void main(String[] args) {
        Date start = new Date();
        Date end = new Date();
        PeriodV5 p = new PeriodV5(start, end);
        System.out.println(p);
        end.setTime(393739439);
        System.out.println(p);

        Date end1 = p.end();
        end1.setTime(423232323);
        System.out.println(p);//전부 동일한 결과!!!
    }
}
