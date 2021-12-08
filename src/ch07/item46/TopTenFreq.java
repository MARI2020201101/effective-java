package ch07.item46;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TopTenFreq {

    public static void main(String[] args) {
        List<String> collect = init().sorted(Comparator.reverseOrder())
                .limit(10)
                .collect(Collectors.toList());
        System.out.println(collect);
    }

    public static Stream<String> init(){
        return Stream.of("aaa","bbb","ccc","a","beasdf","bfsd","bdb","cdc","ddd","aaa","bbb","ccc","a","aaa","bbb","ccc","a","aaa","bbb","ccc","a","aaa","bbb","ccc","a");
    }
}
