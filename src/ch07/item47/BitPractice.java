package ch07.item47;

public class BitPractice {
    public static void main(String[] args) {
        int num = 123;
        System.out.println(num<<1);
        System.out.println(1<<num);
        int num2 = 2;
        System.out.println(num2<<1);
        System.out.println(1<<num2);
        int num3 = 3;
        System.out.println(num3<<1); //3이라는 숫자의 비트를 왼쪽으로 1만큼 옮긴다
        System.out.println(1<<num3); //1이라는 숫자의 비트를 왼쪽으로 3만큼 옮긴다
    }
}
