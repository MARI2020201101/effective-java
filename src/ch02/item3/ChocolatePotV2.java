package ch02.item3;

import java.util.function.Supplier;

public class ChocolatePotV2{
    private static final ChocolatePotV2 INSTANCE = new ChocolatePotV2();

    public static ChocolatePotV2 getInstance(){
        return INSTANCE;
    }

    private ChocolatePotV2(){
        System.out.println("im singleton chocoPot v2");
    }


}
