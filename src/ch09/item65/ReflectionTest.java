package ch09.item65;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Set;

public class ReflectionTest {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<? extends Set> clazz = null;
        clazz = (Class<? extends Set>) Class.forName("ch09.item65.MySet");

        Constructor<? extends Set> constructor = clazz.getDeclaredConstructor();
        Set set = constructor.newInstance();
        set.addAll(List.of("헬로","이펙티브","자바"));
        System.out.println(set);
    }
}
