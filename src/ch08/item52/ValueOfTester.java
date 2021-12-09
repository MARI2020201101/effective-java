package ch08.item52;

public class ValueOfTester {
    public static void main(String[] args) {
        String s = String.valueOf(new Cookie());
        char[] c = {'a','b','c'};
        String s1 = String.valueOf(c);
        System.out.println(s); //해당 오브젝트의 toString() 호출. 해쉬코드
        System.out.println(s1); //해당 char 배열을 new String 으로 반환
        String s2 = String.valueOf((Object) c);
        System.out.println(s2); //똑같이 던져도 다르게 동작한다... 해쉬코드를 반환
    }
}
