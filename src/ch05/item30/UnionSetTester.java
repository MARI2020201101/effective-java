package ch05.item30;

import java.util.HashSet;
import java.util.Set;

public class UnionSetTester {
    public static void main(String[] args) {
        Set set1 = new HashSet();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        Set set2 = new HashSet();
        set2.add("가");
        set2.add("나");
        set2.add("다");
        Set set = UnionSet.unionSet(set1, set2);
        System.out.println(set);

        Set<Integer> set3 = new HashSet();
        set3.add(1);
        set3.add(2);
        set3.add(3);
        Set<String> set4 = new HashSet();
        set4.add("가");
        set4.add("나");
        set4.add("다");
        Set<Integer> set5 = UnionSet.unionSet(set3, set4);
        System.out.println(set5);//미친.......ㅋㅋㅋㅋㅋㅋ어이가. 없다.

    }
}
