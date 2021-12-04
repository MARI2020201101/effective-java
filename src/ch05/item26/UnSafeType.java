package ch05.item26;

import java.util.ArrayList;
import java.util.List;

public class UnSafeType {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("abc");

//        unsafeList(list);
//        safeList(list);//엥... 근대 들어가긴 다 들어가넹...
//        safeList2(list);


        List<String> list2 = new ArrayList<>();
        list2.add("abc");
//        unsafeList(list2); //런타임에러
//        safeList(list2); //컴파일에러
//        safeList2(list2);//컴파일에러

    }

    public static void unsafeList(List list){
        Integer i = (Integer) list.get(0);
        System.out.println(i);

    }

    public static void safeList(List<Integer> list){
        Integer i = (Integer) list.get(0);
        System.out.println(i);
    }

    public static void safeList2(List<Object> list){
        Integer i = (Integer) list.get(0);
        System.out.println(i);
    }
}
