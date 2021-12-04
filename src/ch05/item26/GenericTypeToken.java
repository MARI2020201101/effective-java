package ch05.item26;

import java.util.List;

public class GenericTypeToken {
    public static void main(String[] args) {
        List<String> list = List.of("1","2","3");
//        rawList(list);
//        objectList(list);//에러
//        wildcardList(list);
        rawList(list);
        objectList(List.of("1","2","3")); //이건 왜 되냐??? 어이가 없네............
        wildcardList(list);


    }

    public static void rawList(List list){
        System.out.println(list);
    }
    public static void objectList(List<Object> list){
        System.out.println(list);
    }
    public static void wildcardList(List<?> list){
        System.out.println(list);
    }
}
