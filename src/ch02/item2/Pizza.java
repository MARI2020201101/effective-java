package ch02.item2;

import java.util.EnumSet;
import java.util.Objects;

public abstract class Pizza {
    public enum Topping{PEPPERONI, CHEESE, ANCHOVIES, ONION, PEPPER}
    private EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);

    private Pizza(){}

    @Override
    public String toString() {
        return "Pizza{" +
                "toppings=" + toppings +
                '}';
    }

    Pizza(Builder builder){
        toppings = builder.toppings.clone();
    }

    //나도 나를 구현하는 재귀적 한정 타입!!!
    static abstract class Builder<T extends Builder<T>>{
        private EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);
        //noneOf 메서드는 이넘의 크기(64)이하이면 쪼끄만 이넘셋을 반환할수있도록 성능최적화 하였다.

        public T addTopping(Topping topping){
            toppings.add(Objects.requireNonNull(topping));
            return self();
        }
        //여기가 만약에 Builder였다면 - 하위타입에서 이 메서드 부를때 return 되는 것은 Builder타입이다
        //Builder타입이 아니라 그 확장한 객체 타입이 반환될수있도록 해야 한다!
        protected abstract T self();
        abstract Pizza build();
    }


}
