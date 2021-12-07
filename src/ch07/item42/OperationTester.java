package ch07.item42;

public class OperationTester {
    public static void main(String[] args) {
        double result1 = Operation.MULTIPLY.apply(3, 4);
        System.out.printf("%s 결과 : %f%n" , Operation.MULTIPLY.operName() ,result1);
        double result2 = Operation.DIVIDE.apply(3, 4);
        System.out.printf("%s 결과 : %f%n" , Operation.DIVIDE.operName() ,result2);

    }
}
