package ch04.item19;

import java.util.List;

public class BasilHummus extends Hummus{

    @Override
    public void eatMe() {
        System.out.println("...i want to make basil hummus.....");
        super.eatMe();
    }

    public BasilHummus(int size, List<Ingredient> ingredients, String name) {
        super(size, ingredients, name);
    }
}
