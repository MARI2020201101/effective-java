package ch03.item10;

import java.util.HashSet;
import java.util.Set;

public class CounterPointTester {
    public static void main(String[] args) {
        PointV2 point = new PointV2(1,0);
        PointV2 point2 = new PointV2(1,0);
        CounterPoint counterPoint = new CounterPoint(1,0);
        point.unitCirCle.addAll(Set.of(new PointV2(0,-1),new PointV2(1,0),new PointV2(0,1),new PointV2(-1,0)));

        //미쳤나?? 둘다 false???머야?? -> 해쉬코드 오버라이드했더니 해결 ㅎ ...
        System.out.println(point.onUnitCircle(counterPoint)); //리스코프 치환원칙에 위배되고 있다.
        System.out.println(point.onUnitCircle(point));
        System.out.println(point.unitCirCle);
        System.out.println(point.equals(point2));
        
    }
}
