package ch06.item34;

public class OperationTesterV2 {
    public static void main(String[] args) {
        double result1 = OperationV2.MINUS.apply(3.5, 1.0);
        System.out.println(result1);

        double result2 = OperationV3.DIVIDE.apply(3.3, 1.1);
        System.out.println(result2);
    }
}
