package ch12.item89;

import java.io.Serializable;

public class ChocolatePotStealer implements Serializable {
    static ChocolatePot chocolatePot;
    private ChocolatePot target;

    private Object readResolve(){
        chocolatePot = target;
        return new String("heyheyhey");
    }



}
