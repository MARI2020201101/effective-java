package ch02.item2;

import java.io.Serializable;

public class ChocolatePotV5 implements Serializable {

    public static final ChocolatePotV5 INSTANCE = new ChocolatePotV5();
    private ChocolatePotV5(){
        System.out.println("i am singlton choco pot v6");
    }

    private Object readResolve(){
        return INSTANCE;
    }
}
