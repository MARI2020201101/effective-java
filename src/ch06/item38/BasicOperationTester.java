package ch06.item38;

public class BasicOperationTester {
    public static void main(String[] args) {
        double apply = BasicOperation.DIVIDE.apply(1.5, 3);
        System.out.println(apply);
        String operName = BasicOperation.MINUS.operName();
        System.out.println(operName);
    }
}
