package ch06.item39;

public class Tester {

    @Test
    public static void method1(){
        System.out.println("method1");
    }
    @ExpectException(RuntimeException.class)
    public static void method2(){
        throw new RuntimeException("RuntimeException  method2");
    }
    @Test
    public static void method3(){
        System.out.println("method3");
    }
    @ExpectException(ArithmeticException.class)
    public static void method4(){
        throw new ArithmeticException("ArithmeticException  method4");
    }
    @Test
    public static void method5(){
        System.out.println("method5");
    }

}
