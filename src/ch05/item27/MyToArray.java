package ch05.item27;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyToArray {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        Object[] arr = list.toArray();
        System.out.println(Arrays.toString(arr));

        Integer[] arr2 = new Integer[list.size()];
        list.toArray(arr2);
        System.out.println(Arrays.toString(arr2));
    }


}


