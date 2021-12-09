package ch09.item61;

public class AutoBoxingTester {
    static int i1;
    static Integer i2;

    public static void main(String[] args) {
        if(i1==42) System.out.println("i1 == 42 입니다."); //아무일도안일어난다
        System.out.println(i1); //0으로 초기화되어있다.

//        if(i2==42) System.out.println("i2 == 42 입니다.");

    }
}
