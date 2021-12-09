package ch08.item50;

import java.util.Date;

public class PeriodAttacker {
    public static void main(String[] args) {
        Date start = new Date();
        Date end = new Date();
        Period p = new Period(start, end);
        System.out.println(p);
        end.setTime(393739439);
        System.out.println(p); //1970년으로 시간여행!!
    }
}
