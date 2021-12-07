package ch07.item42;

import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;

public enum Operation {
    PLUS("더하기" , (x,y)->x + y),
    MINUS("빼기", (x,y) -> x-y),
    DIVIDE("나누기" , (x,y) -> x/y),
    MULTIPLY("곱하기", (x,y) -> x*y);


    private final String operName;
    private final DoubleBinaryOperator op;

    Operation(String operName, DoubleBinaryOperator op){
        this.operName=operName;
        this.op=op;
    }

    public String operName(){
        return operName;
    }
    public double apply(double x, double y){
        return op.applyAsDouble(x, y);
    }
}
