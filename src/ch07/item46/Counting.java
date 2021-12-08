package ch07.item46;

import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Counting {
    public static void main(String[] args) {
        long count = init().count();
        System.out.println("count : " + count);
        List<String> words = init().sorted().collect(toList());
        System.out.println(words);

        String s1 = init().collect(joining());
        System.out.println(s1);
        String s2 = init().collect(joining("***"));
        System.out.println(s2);
        String s3 = init().collect(joining("***", "$$$$ ", " $$$$"));
        System.out.println(s3);

    }

    public static Stream<String> init(){
        return Stream.of("aaa","bbb","ccc","a","beasdf","bfsd","bdb","cdc","ddd","aaa","bbb","ccc","a","aaa","bbb","ccc","a","aaa","bbb","ccc","a","aaa","bbb","ccc","a");
    }
}
