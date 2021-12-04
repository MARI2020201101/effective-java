package ch05.item31;

import java.util.List;

public class ChooserTester {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3);
        Chooser<Number> chooser = new Chooser<>(list);
        Number choose = chooser.choose();
        System.out.println(choose);
    }
}
