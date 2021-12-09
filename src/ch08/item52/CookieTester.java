package ch08.item52;

import java.util.List;

public class CookieTester {
    public static void main(String[] args) {
        List<Cookie> cookies = List.of(new Cookie(), new ChocoCookie(), new BlueberryCookie());

        for (Cookie cookie : cookies) {
            System.out.println(cookie.name()); //다형성
        }//다중정의는 정적이고(컴파일타임), 오버라이드는 동적이다.(런타임)
    }
}
