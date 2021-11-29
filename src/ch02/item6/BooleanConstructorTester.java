package ch02.item6;

public class BooleanConstructorTester {
    public static void main(String[] args) {
        Boolean b1 = new Boolean(true);
        Boolean b2 = new Boolean(true);
        System.out.println("b1.equals(b2) : " + b1.equals(b2));
        System.out.println("b1==b2 : " + (b1==b2));
        System.out.println("----------------------------------");

        Boolean b3 = Boolean.valueOf(true);
        Boolean b4 = Boolean.valueOf(true);
        System.out.println("b3.equals(b4) : " + b3.equals(b4));
        System.out.println("b3==b4 : " + (b3==b4));
        System.out.println("----------------------------------");
        System.out.println("b2.equals(b4) : " + (b2==b4));

        //equals 비교를 할경우 논리적 비교를 하므로 당연히 true이다
        //그런데 new Boolean () 으로 생성하면 그때마다 새로운 Boolean 인스턴스가 생성되기 때문에 ==비교에서 false가 뜬다
        //Boolean.valueOf로 호출할경우 클래스 내부에 static으로 캐싱해둔 Boolean 인스턴스를 사용하게 된다.
        //따라서 성능면에서도 더 우수하고. 불필요한 객체생성을 하지 않으니 메모리 절약도 된다!!
    }

}
