package ch02.item2;

public class Main {
    public static void main(String[] args) {


        MyStringBuilder builder = new MyStringBuilder();
        builder.append("this is my first string builder class\n");
        builder.append("hehehe\n");
        builder.append("hihihi\n");
        builder.append("hohoho\n");
        String s = builder.toString();
        System.out.println(s);


        System.out.println("-----------------------------");
        NutrientFacts nutrientFacts = new NutrientFacts
                .Builder(1, 120)
                .fat(2)
                .carb(100)
                .protein(20)
                .vitamin(1)
                .build();

        nutrientFacts.printNutrientFacts();
        System.out.println("------------------------------");
        NutrientFacts nutrientFacts2 = new NutrientFacts
                .Builder(2, 315)
                .protein(50)
                .vitamin(13)
                .build();//디폴트값이 들어가있는것을 확인할 수 있다!!!

        nutrientFacts2.printNutrientFacts();
    }
}
