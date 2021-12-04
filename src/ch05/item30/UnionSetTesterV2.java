package ch05.item30;

import java.util.HashSet;
import java.util.Set;

public class UnionSetTesterV2 {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        Set<String> set2 = new HashSet<>();
        set2.add("가");
        set2.add("나");
        set2.add("다");
//        UnionSet.unionSet2(set1,set2);//컴파일에러를 준다!
    }
}
