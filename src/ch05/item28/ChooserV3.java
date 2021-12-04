package ch05.item28;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

public class ChooserV3<T> {
    private final List<T> array;

    public ChooserV3(Collection<T> c){
        array= new ArrayList<>(c);
    }

    public T choose(){
        int randomNumber = new Random().ints(1, 0, array.size()).toArray()[0];
        return array.get(0);
    }

}
