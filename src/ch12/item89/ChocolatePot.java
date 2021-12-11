package ch12.item89;

import java.io.Serializable;

public class ChocolatePot implements Serializable {

    public static final ChocolatePot INSTANCE = new ChocolatePot();
    private ChocolatePot(){
        System.out.println("i am singlton choco pot v6");
    }

    private Object readResolve(){
        return INSTANCE;
    }
}
