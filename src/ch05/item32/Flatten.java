package ch05.item32;

import java.util.*;

public class Flatten {
    public static void main(String[] args) {
        List<Integer> flatten = flatten(List.of(1, 2, 3), List.of(4, 5, 6));
        System.out.println(flatten);

        List<List<? extends Integer>> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);
        list.add(list1);
        list.add(list2);
        List<Integer> integerList = flatten2(list);
        //클라이언트 코드가 좀 지저분해진다는 단점이 있다......
        System.out.println(integerList);
        flatten2(list);

    }

    private static List<Integer> flatten3(List<List<Integer>> lists) {
        List<Integer> list = new ArrayList<>();
        for (List<Integer> t : lists){
            list.addAll(t);
        }
        return list;
    }


    //리스트 두개를 하나의 리스트에 담는다.
    public static <T> List<T> flatten(List<? extends T> ...lists){
        List<T> list = new ArrayList<>();
        for (List<? extends T> t:lists){
            list.add((T)t);
        }
        return list;
    }
    public static <T> List<T> flatten2(List<List<? extends T>> lists){
        List<T> list = new ArrayList<>();
        for (List<? extends T> t : lists){
            list.addAll(t);
        }
        return list;
    }

}
