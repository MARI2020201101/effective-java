package ch04.item19;

import java.util.Arrays;
import java.util.List;

import static java.util.List.*;

public class HummusMaker {
    public static void main(String[] args) {

        Hummus hummus1 = new BasilHummus(1, of(Hummus.Ingredient.LEMONJUICE, Hummus.Ingredient.CHICKPEA, Hummus.Ingredient.CUMIN, Hummus.Ingredient.OLIVEOIL),
                "you");
        hummus1.eatMe();

    }
}
