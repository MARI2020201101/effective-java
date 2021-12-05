package ch05.item32;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class PickTwo {

    public static void main(String[] args) {
//        Integer[] integers = pickTwo(1, 2, 3); //class cast exception 발생...
//        System.out.println(Arrays.toString(integers));
        List<Integer> integerList = pickTwo2(1, 2, 3);
        System.out.println(integerList);
    }

    public static <T> T[] pickTwo(T a, T b, T c){
        int i = ThreadLocalRandom.current().nextInt(3);
        switch(i){
            case 0: return toArray(a,b);
            case 1: return toArray(b,c);
            case 2: return toArray(a,c);
        }
        return null;
    }

    public static <T> List<T> pickTwo2(T a, T b, T c){
        int i = ThreadLocalRandom.current().nextInt(3);
        switch(i){
            case 0: return List.of(a,b);
            case 1: return List.of(b,c);
            case 2: return List.of(a,c);
        }
        return null;
    }

    private static <T> T[] toArray(T a, T b){
        Object[] objects = {a,b};
        return (T[])objects;
    }
}
