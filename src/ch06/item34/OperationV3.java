package ch06.item34;

public enum OperationV3 {
    PLUS(" + "){
        @Override
        double apply(double x, double y) {
            return x+y;
        }
    },
    MINUS(" - "){
        @Override
        double apply(double x, double y) {
            return x-y;
        }
    },
    DIVIDE(" / "){
        @Override
        double apply(double x, double y) {
            return x/y;
        }
    },
    MULTIPLY(" * "){
        @Override
        double apply(double x, double y) {
            return x*y;
        }
    };

    private String name;
    abstract double apply(double x, double y);

    private OperationV3(String name){
        this.name= name;
    }
}
