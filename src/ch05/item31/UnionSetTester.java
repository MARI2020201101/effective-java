package ch05.item31;

import java.util.Set;

public class UnionSetTester {
    public static void main(String[] args) {
        Set<Integer> set1 = Set.of(1,2,3);
        Set<Number> set2 = Set.of(4,5,6);
        Set<Number> numbers = UnionSet.unionSet(set1, set2);
        System.out.println(numbers);
    }
}
