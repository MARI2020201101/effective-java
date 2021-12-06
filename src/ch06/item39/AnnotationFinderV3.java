package ch06.item39;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AnnotationFinderV3 {
    public static void main(String[] args) throws ClassNotFoundException {

        Class<?> testerClass = Class.forName("ch06.item39.Tester");
        Method[] methods = testerClass.getDeclaredMethods();

        for (Method method : methods) {
            if(method.isAnnotationPresent(ExpectExceptionV2.class)) {
                try {
                    method.invoke(null);
                    System.out.println("테스트 실패 : 예외 발생 x");
                } catch (IllegalAccessException e) {
                    System.out.println("테스트 실패 : " +e.getCause());
                } catch (InvocationTargetException e) {
                    Throwable cause = e.getCause();
                    Class<? extends Throwable>[] expectExceptions = method.getAnnotation(ExpectExceptionV2.class).value();
                    for (Class<? extends Throwable> exception : expectExceptions) {
                        if(exception.isInstance(cause)) {
                            System.out.println(exception);
                            System.out.println("테스트 성공 : " + cause.getMessage());
                        }
                    }
                }
            }

        }
    }
}
