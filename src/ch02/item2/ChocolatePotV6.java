package ch02.item2;

import java.io.Serializable;

public class ChocolatePotV6 implements Serializable {

    public static final ChocolatePotV6 INSTANCE = new ChocolatePotV6();
    private ChocolatePotV6(){
        System.out.println("i am singlton choco pot v6");
    }

    private Object readResolve(){
        return INSTANCE;
    }
}
