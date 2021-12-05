package ch06.item39;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AnnotationFinder {
    public static void main(String[] args) throws Exception {

        Class<?> testerClass = Class.forName("ch06.item39.Tester");
        Method[] methods = testerClass.getDeclaredMethods();

        for (Method method : methods) {
            if(method.isAnnotationPresent(Test.class)) {
                method.invoke(null);
            }
            if(method.isAnnotationPresent(ExpectException.class)){
                method.invoke(null);
            }
        }
    }
}
