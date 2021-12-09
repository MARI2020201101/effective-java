package ch07.item47;

import java.util.List;

public class SubListWithForEach {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5);

        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j < list.size()+1; j++) {
                System.out.println(list.subList(i,j));
            }
        }
    }
}
