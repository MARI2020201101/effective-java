package ch05.item31;

import java.util.ArrayList;
import java.util.List;

public class ListSwapperTester {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        ListSwapper.swap(list,2,3);
        System.out.println(list);

        System.out.println("---------------------");
        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        ListSwapper.swap2(list2,2,3);
        System.out.println(list2);
    }
}
