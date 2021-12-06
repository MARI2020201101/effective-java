package ch06.item39;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AnnotationFinderV2 {
    public static void main(String[] args) throws ClassNotFoundException {

        Class<?> testerClass = Class.forName("ch06.item39.Tester");
        Method[] methods = testerClass.getDeclaredMethods();

        for (Method method : methods) {
            if(method.isAnnotationPresent(ExpectException.class)) {
                try {
                    method.invoke(null);
                } catch (IllegalAccessException e) {
                    System.out.println("테스트 실패 : " +e.getCause());
                } catch (InvocationTargetException e) {
                    Throwable cause = e.getCause();
                    Class<? extends Throwable> expectEx = method.getAnnotation(ExpectException.class).value();
                    if(expectEx.isInstance(cause)) {
                        System.out.println(expectEx);
                        System.out.println("테스트 성공 : " + cause.getMessage());
                    }
                }
            }

        }
    }
}
