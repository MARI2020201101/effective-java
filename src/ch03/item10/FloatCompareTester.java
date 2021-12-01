package ch03.item10;

public class FloatCompareTester {
    public static void main(String[] args) {
        calculate();
    }

    public static void calculate(){
        float f = 0.1f;
        float sum = 0;

        for (int i = 0; i < 10; i++) {
            sum += f;
            f = f*(0.1f);
        }

        System.out.printf("%1.30f, %1.30f" , f , sum);



    }
}
