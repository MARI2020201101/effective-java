package ch02.item5;

public class CrunchChocolate implements Chocolate{
    private final String name;
    private ChocoDeco chocoDeco=ChocoDeco.NONE;

    public enum ChocoDeco{
        NONE,ALMOND,BANANA,CINNAMON
    }
    public CrunchChocolate(String name, ChocoDeco chocoDeco){
        this.name=name;
        this.chocoDeco=chocoDeco;
    }
    @Override
    public void printName() {
        System.out.println("i am crunch chocolate for "+ name);
        System.out.println("i am decorated with "+ chocoDeco.name()+"...");
    }
}
