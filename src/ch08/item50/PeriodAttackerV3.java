package ch08.item50;

import java.util.Date;

public class PeriodAttackerV3 {
    public static void main(String[] args) {
        Date start = new Date();
        Date end = new Date();
        PeriodV3 p = new PeriodV3(start, end);
        System.out.println(p);
        end.setTime(393739439);
        System.out.println(p); //생성자 내부에서 방어적으로 복사하였기 때문에 영향받지 않는다!
    }
}
