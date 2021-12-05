package ch05.item31;

import java.util.HashSet;
import java.util.Set;

public class UnboundedReturnSet {

    public static <E> Set<? extends E> unionSet(Set<? extends E> set1){
        Set<? extends E> set = new HashSet<>(set1);
        return set;
    }
}
