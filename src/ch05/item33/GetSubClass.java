package ch05.item33;

import ch04.item19.Sub;
import ch04.item19.Super;

public class GetSubClass {
    public static void main(String[] args) throws Exception {
        Super aSuper = getClass("ch04.item19.Super");
        System.out.println(aSuper);
        System.out.println(aSuper instanceof Sub);
    }

    public static Super getClass(String className) throws Exception {
        Class<?> clazz = Class.forName(className);
        Class<? extends Super> subclass = clazz.asSubclass(Super.class);
        Super instance = subclass.getDeclaredConstructor().newInstance();
        return instance;
    }
}
