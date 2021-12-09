package ch09.item61;

import java.util.Comparator;

public class ComparatorTesterV2 {
    public static void main(String[] args) {
        Comparator<Integer> c = (o1,o2) -> {
            int i1 = o1; int i2 = o2; //명시적 형변환을 한 후 반환한다(오류 해결!)
            return (i1 > i2)? 1 : ((i1==i2) ? 0 : -1) ;
        };
        int result = c.compare(new Integer(42), new Integer(42));
        System.out.println(result);

        //아니면 제공해주는 api를 사용한다!
        Comparator<Integer> naturalOrder = Comparator.naturalOrder();
        int result2 = naturalOrder.compare(new Integer(42), new Integer(42));
        System.out.println(result2);
    }

}
