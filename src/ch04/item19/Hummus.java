package ch04.item19;

import java.util.ArrayList;
import java.util.List;

public class Hummus {

    private int size;
    private String name;
    private List<Ingredient> ingredients = new ArrayList<>();

    public Hummus(int size, List<Ingredient> ingredients, String name){
        this.ingredients =ingredients;
        this.size=size;
        this.name=name;
    }



    public void eatMe(){
        cookMe();
        System.out.println("lets eat delicious hummus with "+name + "!!");

    }
    private void cookMe(){
        System.out.println("let's cooking.....");
        System.out.println();
        for (int i = 0; i < ingredients.size(); i++) {
            System.out.println("add [ "+ingredients.get(i).toString()+" ]");
        }
        System.out.println();
        System.out.println("******done!!******");
    }

    public static enum Ingredient{
        CHICKPEA(100),OLIVEOIL(30),LEMONJUICE(20),CUMIN(5);
        int ounce;
        private Ingredient(int ounce) {
            this.ounce=ounce;
        }

        public void addOunce(int ounce) {
            this.ounce = ounce;
        }
    }
}
