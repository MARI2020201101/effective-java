package ch02.item2;

public class MyPizzaTester {

    public static void main(String[] args) {
        Pizza pizza = new NyPizza.Builder()
                .addTopping(Pizza.Topping.ANCHOVIES)
                .addTopping(Pizza.Topping.CHEESE)
                .size(NyPizza.Size.SMALL)
                .build();

        System.out.println(pizza.toString());

        System.out.println("======================");

        Pizza pizza2 = new ChicagoPizza.Builder()
                .addTopping(Pizza.Topping.ONION)
                .addTopping(Pizza.Topping.PEPPERONI)
                .sauceInside()
                .build();

        System.out.println(pizza2.toString());
    }


}
