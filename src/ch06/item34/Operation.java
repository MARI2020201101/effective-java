package ch06.item34;

public enum Operation {
    PLUS,MINUS,DIVIDE,MULTIPLY;

    public static double operate(double x, double y,Operation operation){
        switch (operation){
            case PLUS : return x+y;
            case MINUS: return x-y;
            case DIVIDE:return x/y;
            case MULTIPLY:return x*y;
            default:throw new ArithmeticException("계산불가");
        }
    }

    public double operate(double x, double y){
        switch (this){
            case PLUS : return x+y;
            case MINUS: return x-y;
            case DIVIDE:return x/y;
            case MULTIPLY:return x*y;
            default:throw new ArithmeticException("계산불가");
        }
    }
}
