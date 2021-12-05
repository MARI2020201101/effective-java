package ch06.item38;

public enum ExtendedOperation implements Operation{

    EXP("pow 연산"){
        @Override
        public double apply(double x, double y) {
            return Math.pow(x,y);
        }
    },REMAINDER("mod 연산"){
        @Override
        public double apply(double x, double y) {
            return x%y;
        }
    };

    private final String operName;
    ExtendedOperation(String operName){
        this.operName=operName;
    }
    public final String operName(){
        return this.operName;//static
    }
}
