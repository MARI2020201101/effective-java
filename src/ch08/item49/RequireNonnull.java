package ch08.item49;

import java.util.Objects;

public class RequireNonnull {
    public static void main(String[] args) {
        //메시지도 지정할 수 있따~~~
        Object o = Objects.requireNonNull(null, "Null 안됨!");
        System.out.println(o);
    }
}
