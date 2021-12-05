package ch05.item32;

import java.util.Arrays;
import java.util.List;

public class DangerousGenericVarargs {

    public static void main(String[] args) {
        dangerous(List.of("가","나","다"),List.of("라","마","바"));
    }
    public static void dangerous(List<String> ...stringList){
        List<Integer> integerList = List.of(42);
        Object[] objects = stringList;//내부적으로 배열이 만들어진다.
        objects[0] = integerList; //다들어가넹.... //공변타입!!
        System.out.println(Arrays.toString(objects));
        String s = stringList[0].get(0);
        System.out.println(s);
    }
}
