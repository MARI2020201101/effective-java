package ch07.item47;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class StreamIterator {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("사과", "달걀", "우유", "호두", "꽃");
        for (String element : (Iterable<String>) stream::iterator){
            System.out.println(element);
        }
        Stream<String> stream2 = Stream.of("가","나","다");
        Iterable<String> strings = iterableOf(stream2);
        for(String s : strings){
            System.out.println(s);
        }
        Stream<String> stringStream = streamOf(List.of("바나나" , "수박" , "딸기"));
        String s = stringStream.collect(Collectors.joining(" & "));
        System.out.println(s);
    }


    public static <E> Iterable<E> iterableOf(Stream<E> stream){
        return stream::iterator;
    }
    public static <E> Stream<E> streamOf(Iterable<E> iterable){
        return StreamSupport.stream(iterable.spliterator(), false);
    }
}
