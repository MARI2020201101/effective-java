package ch09.item65;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Set;

public class ReflectionTest {
    public static void main(String[] args)  {
        Class<? extends Set> clazz = null;
        try {
            clazz = (Class<? extends Set>) Class.forName("ch09.item65.MySet");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("해당하는 클래스가 존재하지 않습니다.");
        }

        Constructor<? extends Set> constructor = null;
        try {
            constructor = clazz.getDeclaredConstructor();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
            System.out.println("매개변수 없는 생성자를 찾을 수 없습니다. ");
        }
        Set set = null;
        try {
            set = constructor.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
            System.out.println("클래스를 인스턴스화 할 수 없습니다.");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            System.out.println("생성자에 접근할 수 없습니다.");
        } catch (InvocationTargetException e) {
            e.printStackTrace();
            System.out.println("생성자가 예외를 던졌습니다.");
        }
        set.addAll(List.of("헬로","이펙티브","자바"));
        System.out.println(set);
    }
}
