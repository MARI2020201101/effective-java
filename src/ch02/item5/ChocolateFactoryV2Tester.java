package ch02.item5;

public class ChocolateFactoryV2Tester {
    public static void main(String[] args) {
        ChocoSupplier chocoSupplier = new ChocoSupplier();
        Chocolate chocolate = chocoSupplier.givemeChoco(new ChocolateFactoryV2(CrunchChocolate.ChocoDeco.NONE));
        chocolate.printName();
    }
}
