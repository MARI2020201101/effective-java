package ch05.item31;

import java.util.HashSet;
import java.util.Set;

public class UnboundedReturnSetTester {
    //리턴타입에 unbounded wildcard를 쓰면 클라이언트가 불필요한 캐스팅을 해야함.
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        Set<? extends Integer> set1 = UnboundedReturnSet.unionSet(set);
        System.out.println(set1);

        Set<Integer> set2 = new HashSet<>();
        set2.add(1);
        Set<Integer> set3 = (Set<Integer>)UnboundedReturnSet.unionSet(set2);
        System.out.println(set3);
    }
}
