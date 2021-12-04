package ch05.item26;

import java.util.Set;

public class SetEx {
    public static void main(String[] args) {
        Set s1 = Set.of("1","2","3");
        Set s2 = Set.of("1","2","3","4");
        Set<String> s3 = Set.of("1","2","3");
        Set<String> s4 = Set.of("1","2","3","4");
        returnCommonElementV1(s1, s2);
        returnCommonElementV1(s3, s4);
        System.out.println("-----------------");
        Set s5 = Set.of("1","2","3",4);
        Set s6 = Set.of("1","2","3","4");
        Set<String> s7 = Set.of("1","2","3");
        Set<String> s8 = Set.of("1","2","3","4");
        returnCommonElementV2(s5,s6);
        returnCommonElementV2(s7,s8);
    }

    public static void returnCommonElementV1(Set set1, Set set2){
        for (Object o : set1) {
            if(set2.contains(o))
                System.out.println(o);
        }
    }
    public static void returnCommonElementV2(Set<?> set1, Set<?> set2){
        for (Object o : set1) { //똑같은거 아녀?
            if(set2.contains(o))
                System.out.println(o);
        }
    }
}
