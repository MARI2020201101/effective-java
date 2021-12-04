package ch05.item30;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MaxImplementation {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5);
        Integer max = max(list);
        System.out.println(max);

        List<String> list2 = List.of("sss","aaa","bbb");
        String max2 = max(list2);
        System.out.println(max2);

        List<String> list3 = List.of("s","aaa","bbb");
        String max3 = max(list3);
        System.out.println(max3);
    }

    public static <E extends Comparable<E>> E max(Collection<E> c){
        if(c.isEmpty()) throw new IllegalArgumentException("비어있음");
        E max = null;
        for (E e : c){
            if(max==null || e.compareTo(max) > 0){
                max = e;
            }
        }
        return max;
    }
}
