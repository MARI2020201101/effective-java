package ch09.item61;

import java.util.Comparator;

public class ComparatorTester {
    public static void main(String[] args) {
        Comparator<Integer> c = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return (o1 > o2) ? 1 : ((o1==o2)? 0 : -1);
            }
        };
        int result = c.compare(new Integer(42), new Integer(42));
        System.out.println(result); // 0이아니다!!! 객체 식별성 검사에서 탈락.....
        Integer i1 = 42;
        Integer i2 = 42;
        int result2 = c.compare(i1, i2);
        System.out.println(result2); //이건 또 0이넹....
        int result3 = c.compare((Integer) i1, (Integer) i2);
        System.out.println(result3); //이것두 0이넹.....


        Comparator<Integer> c2 = (o1,o2)-> (o1 > o2) ? 1 : ((o1==o2)? 0 : -1); //람다로 구현해버리기~
    }

}
