package ch02.item3;

public class ChocolatePot {

    public static final ChocolatePot INSTANCE = new ChocolatePot();
    private ChocolatePot(){
        System.out.println("Im singleton chocoPot ");
    }
}
