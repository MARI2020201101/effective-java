package ch12.item89;

import java.io.Serializable;

public class ChocolatePot implements Serializable {

    private String chocolate = "chocochocho";
    public static final ChocolatePot INSTANCE = new ChocolatePot();
    private ChocolatePot(){
        System.out.println("i am singlton choco pot ");
    }

    public void print(){
        System.out.println("*****************");
        System.out.println(chocolate);
        System.out.println("*****************");
    }
    private Object readResolve(){
        return INSTANCE;
    }
}
