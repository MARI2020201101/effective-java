package ch06.item34;

import java.util.EnumSet;

public class EnumSetTester {
    public static void main(String[] args) {
        EnumSet<OperationV3> enumSet = EnumSet.allOf(OperationV3.class);
        for (OperationV3 o : enumSet) {
            System.out.println(o.toString());
        }
    }
}
