package ch06.item38;

import java.util.Collection;
import java.util.EnumSet;

public class OperationTester {
    public static void main(String[] args) {

        test(BasicOperation.class, 2,3);
        System.out.println("------------");
        test(ExtendedOperation.class, 2,3);
        System.out.println("------------");
        test2(EnumSet.allOf(BasicOperation.class),2,3);
        System.out.println("------------");
        test2(EnumSet.allOf(ExtendedOperation.class),2,3);
    }

    private static <T extends Enum<T> & Operation> void test(Class<T> operationSubType ,double x, double y ){
        T[] subEnumTypes = operationSubType.getEnumConstants();
        for (T type : subEnumTypes) {
            System.out.println(type.apply(x, y));
        }
    }

    private static void test2(Collection<? extends Operation> c, double x, double y){
        for (Operation operation : c) {
            System.out.println(operation.apply(x,y));
        }
    }
}
