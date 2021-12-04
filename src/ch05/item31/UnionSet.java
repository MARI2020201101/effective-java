package ch05.item31;

import java.util.HashSet;
import java.util.Set;

public class UnionSet {

    public static <E> Set<E> unionSet(Set<? extends E> set1, Set<? extends E> set2){
//        set1.addAll(set2);//타입을 몰라서 컴파일을 안해줌..
//        return set1;
        Set<E> set = new HashSet<>(set1);
        set.addAll(set2);
        return set;
    }
}
