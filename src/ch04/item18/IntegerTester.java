package ch04.item18;

public class IntegerTester {
    public static void main(String[] args) {
        long start = System.nanoTime();
        simpleCalculate();
        long end = System.nanoTime();
        System.out.println(("end - start : " + (end-start) + " ns"));

        long start2 = System.nanoTime();
        binaryCalculate();
        long end2 = System.nanoTime();
        System.out.println(("end - start : " + (end2-start2) + " ns"));
        System.out.println("연산속도 차이 : " + ((float)(end-start)/(float) (end2-start2)) + " 배");

        long start3 = System.nanoTime();
        binaryCalculate2();
        long end3 = System.nanoTime();
        System.out.println(("end - start : " + (end3-start3) + " ns"));
        System.out.println("연산속도 차이 : " + ((float)(end-start)/(float) (end3-start3)) + " 배");
    }

    public static void simpleCalculate(){
        int sum = 1;
        for (int i = 0; i < 100; i++) {
            sum = sum*31 - sum;
        }
        System.out.println(sum);//오버플로우 발생해서 둘다 값은 0 나오는데
    }
    public static void binaryCalculate(){
        int sum = 1;
        for (int i = 0; i < 100; i++) {
            sum = sum<<0B10000 - sum;
        }
        System.out.println(sum);//바이너리연산이 훨씬 빠르넹..
    }

    public static void binaryCalculate2(){
        int sum = 1;
        for (int i = 0; i < 100; i++) {
            sum = sum<<32 - sum;
        }
        System.out.println(sum);//바이너리연산이 훨씬 빠르넹..
    }
}
