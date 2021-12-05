package ch06.item34;

public enum OperationV2 {
    PLUS{
        @Override
        double apply(double x, double y) {
            return x+y;
        }
    },
    MINUS{
        @Override
        double apply(double x, double y) {
            return x-y;
        }
    },
    DIVIDE{
        @Override
        double apply(double x, double y) {
            return x/y;
        }
    },
    MULTIPLY{
        @Override
        double apply(double x, double y) {
            return x*y;
        }
    };

    abstract double apply(double x, double y);
}
