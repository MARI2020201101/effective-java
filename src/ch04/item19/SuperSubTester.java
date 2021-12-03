package ch04.item19;

public class SuperSubTester {
    public static void main(String[] args) {
        illegalOverride();
        System.out.println("----------------");
        illegalOverrideWithException();

    }

    public static void illegalOverride(){
        Super sub = new Sub();
        sub.overrideMe();
        // 오버라이드한 메서드가 부모클래스의 생성자에서 불리고 있다.
        //하위클래스에게 영향을 미치고 있음...
    }

    public static void illegalOverrideWithException(){
        Super sub = new SubV2();
        sub.overrideMe();
    }
}
