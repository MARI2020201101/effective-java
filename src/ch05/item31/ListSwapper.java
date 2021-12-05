package ch05.item31;

import java.util.List;

public class ListSwapper {
    public static void swap(List<?> list, int i, int j){
        swapHelper(list,i,j);
    }
    public static void swap2(List<?> list, int i, int j){
        swapHelper2(list,i,j);
    }

    private static <E> void swapHelper(List<E> list, int i, int j){
        E tmp = list.get(i);
        list.add(i,list.get(j));
        list.remove(++i);
        list.add(j,tmp);
        list.remove(++j);
    }

    private static <E> void swapHelper2(List<E> list, int i, int j){
        list.set(i, list.set(j,list.get(i)));
    }
}
