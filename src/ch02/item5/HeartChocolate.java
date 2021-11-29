package ch02.item5;

public class HeartChocolate implements Chocolate{
    private final String name;
    public HeartChocolate(String name){
        this.name = name;
    }
    @Override
    public void printName() {
        System.out.println("i am heart chocolate for "+name);
    }
}
