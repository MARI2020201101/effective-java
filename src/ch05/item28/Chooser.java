package ch05.item28;

import java.util.Collection;
import java.util.Random;

public class Chooser {
    private final Object[] array;

    public Chooser(Collection c){
        array=c.toArray();
    }

    public Object choose(){
        int randomNumber = new Random().ints(1, 0, array.length).toArray()[0];
        return array[randomNumber];
    }

}
