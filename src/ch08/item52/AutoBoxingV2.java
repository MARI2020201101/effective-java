package ch08.item52;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class AutoBoxingV2 {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        List<Integer> list = new ArrayList<>();

        for (int i = -3; i < 3; i++) {
            set.add(i);
            list.add(i);
        }
        System.out.println(set);
        System.out.println(list);

        for (int i = 0; i < 3; i++) {
            set.remove(i);
            list.remove((Integer)i);
            //list가 remove를 다중정의 + 오토박싱해서 혼란이있다...
        }

        System.out.println(set);
        System.out.println(list);
    }
}
