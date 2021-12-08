package ch07.item47;

import java.util.Iterator;
import java.util.stream.Stream;

public class StreamAdaptor {
    public static void main(String[] args) {
        Iterator<String> stringIterator = iterableOf(init());
        for (Iterator<String> it = stringIterator; it.hasNext(); ) {
            String s = it.next();
            System.out.println(s);
        }
    }

    public static <E> Iterator<E> iterableOf(Stream<E> stream){

        return stream.iterator();
    }
    public static Stream<String> init(){
        return Stream.of("aaa","bbb","ccc","a","beasdf","bfsd","bdb","cdc","ddd","aaa","bbb","ccc","a","aaa","bbb","ccc","a","aaa","bbb","ccc","a","aaa","bbb","ccc","a");
    }
}
