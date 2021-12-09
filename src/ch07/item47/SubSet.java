package ch07.item47;

import java.util.*;

public class SubSet {

    public static void main(String[] args) {
        Set<Integer> set = Set.of(1,2,3,4,5);
        List<Set<Integer>> subSetOf = (List<Set<Integer>>) subSetOf(set);
        System.out.println(subSetOf);
        int size = subSetOf.size();
        System.out.println(size);
        System.out.println("------");

        //뭔가 이상한디..........
        Set<Integer> subsetOf1 = subSetOf.get(1);
        System.out.println(subsetOf1);
        Set<Integer> subsetOf2 = subSetOf.get(2);
        System.out.println(subsetOf2);
        Set<Integer> subsetOf4 = subSetOf.get(4);
        System.out.println(subsetOf4);
        Set<Integer> subsetOf8 = subSetOf.get(8);
        System.out.println(subsetOf8);
        Set<Integer> subsetOf16 = subSetOf.get(16);
        System.out.println(subsetOf16);
    }


    public static final <E> Collection<Set<E>> subSetOf(Set<E> set){
        List<E> src = new ArrayList<>(set);
        if(src.size()>30){
            throw new IllegalArgumentException("원소의 개수가 너무 많습니다. ㅠ.ㅠ");
        }
        return new AbstractList<Set<E>>() {
            Set<E> result = new HashSet<>();
            @Override
            public Set<E> get(int index) {
                for (int i = 0; index!=0 ; i++, index>>=1) {
                    if((index & 1) ==1){
                        result.add(src.get(i));
                    }
                }
                return result;
            }

            @Override
            public int size() {
//                System.out.println(1<<src.size());
                //전체 부분 집합의 개수는 2 에 원래 집합의 원소개수 거듭제곱이다( yes 1, no 1 : 2의 n승)
                return (int) Math.pow(2,set.size());
            }

            @Override
            public boolean contains(Object o) {
                return o instanceof Set && src.containsAll((Set) o);
            }
        };
    }
}
