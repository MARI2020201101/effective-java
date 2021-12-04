package ch05.item30;

import java.util.Set;

public class UnionSet {
    public static Set unionSet(Set set1, Set set2){
        set1.addAll(set2);
        return set1;
    }

    public static<E> Set<E> unionSet2(Set<E> set1, Set<E> set2){
        set1.addAll(set2); //경고가 없어진다!!
        return set1;
    }
}
