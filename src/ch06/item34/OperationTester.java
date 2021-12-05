package ch06.item34;

public class OperationTester {
    public static void main(String[] args) {
        double result = Operation.operate(2, 3, Operation.PLUS);
        System.out.println(result);
        double result2 = Operation.MULTIPLY.operate(2.4, 4);
        System.out.println(result2);
    }
}
