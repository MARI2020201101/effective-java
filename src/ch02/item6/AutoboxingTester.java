package ch02.item6;

public class AutoboxingTester {


    public static int basicSum(){
        int sum =0;
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            sum+=i;
        }
        return sum;
    }

    public static int boxedSum(){
        Integer sum =0;
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            sum+=i;
        }
        return sum;
    }
    public static void main(String[] args) {
        long start = System.nanoTime();
        boxedSum();
        long end = System.nanoTime();
        System.out.println("end - start " + (end-start) + " ns");

        long start2 = System.nanoTime();
        basicSum();
        long end2 = System.nanoTime();
        System.out.println("end - start " + (end2-start2) + " ns");

        System.out.println("성능 차이 : " + ((double)(end-start)/(end2-start2)) + " 배");
    }
}
