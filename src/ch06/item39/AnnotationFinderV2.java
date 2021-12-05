package ch06.item39;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AnnotationFinderV2 {
    public static void main(String[] args){

        Class<?> testerClass = Class.forName("ch06.item39.Tester");
        Method[] methods = testerClass.getDeclaredMethods();

        for (Method method : methods) {
            if(method.isAnnotationPresent(Test.class)) {
                try {
                    method.invoke(null);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
