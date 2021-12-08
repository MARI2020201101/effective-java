package ch07.item46;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupingBy {

    public static void main(String[] args) {
        Map<Integer, List<String>> words = init()
                .collect(Collectors.groupingBy(String::length));
        System.out.println(words);
    }

    public static Stream<String> init(){
        return Stream.of("aaa","bbb","ccc","a","beasdf","bfsd","bdb","cdc","ddd","aaa","bbb","ccc","a","aaa","bbb","ccc","a","aaa","bbb","ccc","a","aaa","bbb","ccc","a");
    }
}
