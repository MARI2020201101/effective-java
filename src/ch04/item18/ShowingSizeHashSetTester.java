package ch04.item18;

import java.util.Set;

public class ShowingSizeHashSetTester {
    public static void main(String[] args) {
        ShowingSizeHashSet set = new ShowingSizeHashSet();
        set.add("Hello1");
        set.add("Hello2");
        set.add("Hello3");
        System.out.println(set.showAddCount());
        set.addAll(Set.of("가","나","다"));
        System.out.println(set.showAddCount()); //미쳤다.....
        //상위 클래스를 extends해서 메서드를 재정의할경우 예상치 못한 에러를 만날 수 있따.....
    }
}
