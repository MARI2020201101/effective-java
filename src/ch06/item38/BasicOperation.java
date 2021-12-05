package ch06.item38;

public enum BasicOperation implements Operation{
    PLUS("덧셈"){
        @Override
        public double apply(double x, double y) {
            return x+y;
        }

    },MINUS("뺄셈"){
        @Override
        public double apply(double x, double y) {
            return x-y;
        }
    },DIVIDE("나눗셈"){
        @Override
        public double apply(double x, double y) {
            return x/y;
        }
    },MULTIPLY("곱셈"){
        @Override
        public double apply(double x, double y) {
            return x*y;
        }
    };

    private final String operName; //static 선언안되넹..
    BasicOperation(String operName){
        this.operName=operName;
    }
    public final String operName(){
        return this.operName;//static
    }

}
