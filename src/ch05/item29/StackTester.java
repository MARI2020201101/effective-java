package ch05.item29;

public class StackTester {
    public static void main(String[] args) {
        Stack stack1 = new Stack();
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        stack1.push("4");
//        Integer o = (Integer) stack1.pop();
//        System.out.println(o);//런타임에러

        StackV2<String> stack2 = new StackV2<>();
        stack2.push("가");
        stack2.push("나");
        stack2.push("다");
//        stack2.push(4);//컴파일에러
        String s = stack2.pop();
        System.out.println(s);//타입안전

        StackV4<String> stack3 = new StackV4<>();
        stack3.push("가");
        stack3.push("나");
        stack3.push("다");
//        stack3.push(4);//컴파일에러2
        String s2 = stack2.pop();
        System.out.println(s);//타입안전2
    }

}
