package ch04.item18;

public class OverflowTester {

    public static void main(String[] args) {
        int value = Integer.MAX_VALUE;
        for (int i = 0; i < 4; i++) {
            System.out.println("value : " + value++);
        }
        System.out.println("----------------------");
        int value2 = Integer.MIN_VALUE;
        for (int i = 0; i < 4; i++) {
            System.out.println("value2 : " + value2--);
        }
        System.out.println("----------------------");
        int value3 = Integer.MAX_VALUE;
        for (int i = 0; i < 4; i++) {
            System.out.println(value3 = value3 << 2);
            System.out.println(Integer.toBinaryString(value3));
        }
        System.out.println("----------------------");
        int value4 = Integer.MIN_VALUE;
        for (int i = 0; i < 4; i++) {
            System.out.println(value4 = value4 << 2);//오버플로우 발생 전부 0이 되었따...
            System.out.println(Integer.toBinaryString(value4));
        }
        System.out.println("----------------------");
        int value5 = Integer.MAX_VALUE;
        for (int i = 0; i < 4; i++) {
            System.out.println(value5 = value5 >> 2);
            System.out.println(Integer.toBinaryString(value5));
        }
        System.out.println("----------------------");
        int value6 = Integer.MIN_VALUE;
        for (int i = 0; i < 4; i++) {
            System.out.println(value6 = value6 >> 2);
            System.out.println(Integer.toBinaryString(value6));
        }
    }
}