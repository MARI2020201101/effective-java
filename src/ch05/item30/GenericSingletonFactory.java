package ch05.item30;

import java.util.function.UnaryOperator;

public class GenericSingletonFactory {
    public static void main(String[] args) {
        GenericSingletonFactory g = new GenericSingletonFactory();
        UnaryOperator<String> identify = g.identify();
        String hello = identify.apply("hello");
        System.out.println(hello);
        UnaryOperator<Integer> identify1 = g.identify();
        Integer apply = identify1.apply(123);
        System.out.println(apply);
    }

    private static UnaryOperator<Object> GENERIC_SINGLETON_FACTORY = (t) -> t;

    @SuppressWarnings("unchecked")
    public <T> UnaryOperator<T> identify(){
        return (UnaryOperator<T>) GENERIC_SINGLETON_FACTORY;
    }
}
