package ch05.item28;

import java.util.Collection;
import java.util.Random;

public class ChooserV2<T> {
    private final T[] array;

    public ChooserV2(Collection<T> c){
        array= (T[]) c.toArray();//타입캐스팅을 한다. safe함을 확신할수있으므로 강제캐스팅해도 괜찮다.
    }

    public <T> T choose(){
        int randomNumber = new Random().ints(1, 0, array.length).toArray()[0];
        return (T) array[randomNumber];
    }

}
