package ch07.item47;

import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SubLists {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        Stream<List<Integer>> prefix = prefix(list);
        Stream<List<Integer>> suffix = suffix(list);
        prefix.forEach(System.out::println);
        System.out.println("-------------------------");
        suffix.forEach(System.out::println);
        System.out.println("-------------------------");

        Stream<List<Integer>> sublists = sublists(list);
        sublists.forEach(System.out::println);

    }

    public static <E> Stream<List<E>> sublists(List<E> list){
        return Stream.concat(Stream.of(Collections.emptyList()) ,
                prefix(list).flatMap(SubLists::suffix));
    }


    public static <E> Stream<List<E>> prefix(List<E> list){
        return IntStream.rangeClosed(0, list.size())
                .mapToObj(start -> list.subList(0,start));
    }
    public static <E> Stream<List<E>> suffix(List<E> list){
        return IntStream.rangeClosed(0, list.size())
                .mapToObj(end -> list.subList(end, list.size()));
    }
}
