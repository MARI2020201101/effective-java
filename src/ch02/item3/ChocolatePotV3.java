package ch02.item3;

import java.util.function.Supplier;

public class ChocolatePotV3 implements Supplier<ChocolatePotV3>{
    private static final ChocolatePotV3 INSTANCE = new ChocolatePotV3();



    private ChocolatePotV3(){
        System.out.println("im singleton chocoPot v3");
    }

    @Override
    public ChocolatePotV3 get() {
        return INSTANCE;
    }
}
