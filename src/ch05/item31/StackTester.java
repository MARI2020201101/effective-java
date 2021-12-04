package ch05.item31;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StackTester {
    public static void main(String[] args) {
        Stack<Number> stack = new Stack<>();
        List<Integer> list = List.of(1,2,3);
        stack.pushAll(list);
        Number number = stack.pop();
        System.out.println(number);

        Stack<Integer> stack2 = new Stack<>();
        stack2.push(1);
        stack2.push(2);
        stack2.push(3);
        List<Number> dst = new ArrayList<>();
        stack2.popAll(dst);
        System.out.println(dst);

    }

}
