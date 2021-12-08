package ch07.item46;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupingBy {

    public static void main(String[] args) {
        Map<Integer, List<String>> words = init()
                .collect(Collectors.groupingBy(String::length));
        System.out.println(words);
        System.out.println("---------------------");

        Map<Integer, Long> words2 = init()
                .collect(Collectors.groupingBy(String::length, Collectors.counting()));
        System.out.println(words2);
        System.out.println("---------------------");

        TreeMap<Integer, Long> words3 = init().collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.counting()));
        System.out.println(words3);

    }

    public static Stream<String> init(){
        return Stream.of("aaa","bbb","ccc","a","beasdf","bfsd","bdb","cdc","ddd","aaa","bbb","ccc","a","aaa","bbb","ccc","a","aaa","bbb","ccc","a","aaa","bbb","ccc","a");
    }

    public static Stream<String> init2(){
        return Stream.of("aaa","bBb","ccc","a","beaSSdf","bfsd","bdb","cdc","ddd","aaa" ,
                "A","aaa","bbb","ccc","AA","aaa","Bbb","CCcc","a","aaa","bbb","ccc","a");
    }
}
