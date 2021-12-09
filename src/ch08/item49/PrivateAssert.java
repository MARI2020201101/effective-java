package ch08.item49;

import java.util.List;

public class PrivateAssert {

    public static void main(String[] args) {
//        method(List.of(1,2,3,4,5), 5);
        method(List.of(1,2,3,4,5), 10);
        //VM 옵션에 -ea 를 붙여야 작동한다.
    }

    private static void method(List<Integer> list , int len){
        assert list != null;
        assert len>0 && len==list.size();
    }
}
