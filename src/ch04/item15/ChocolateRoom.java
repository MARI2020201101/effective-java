package ch04.item15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ChocolateRoom {

    private final List<String> chocolates = new ArrayList<>();
    public List<String> CHOCOLATE_LIST = Collections.unmodifiableList(chocolates);


    public ChocolateRoom(List<String> chocolates){
        this.chocolates.addAll(chocolates);
    }
}
