package ch02.item5;

public class ChocolateFactoryTester {
    public static void main(String[] args) {
        ChocolateFactory chocolateFactory = new ChocolateFactory();
        Chocolate heartChoco = chocolateFactory.givemeChoco(ChocolateFactory.ChocoType.HEART);
        Chocolate crunchChoco = chocolateFactory.givemeChoco(ChocolateFactory.ChocoType.CRUNCH);
        heartChoco.printName();
        System.out.println("-------------------------------");
        crunchChoco.printName();

        Chocolate almondChoco = chocolateFactory.givemeCrunchChoco(CrunchChocolate.ChocoDeco.ALMOND);
        Chocolate bananaChoco = chocolateFactory.givemeCrunchChoco(CrunchChocolate.ChocoDeco.BANANA);
        System.out.println("-------------------------------");
        almondChoco.printName();
        System.out.println("-------------------------------");
        bananaChoco.printName();

    }
}
