package ch04.item15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ChocolateRoomV2 {

    private final List<String> chocolates = new ArrayList<>();


    public ChocolateRoomV2(List<String> chocolates){
        this.chocolates.addAll(chocolates);
    }

    public List<String> showChocolateList(){
        List<String> copiedChocolates = new ArrayList<>();
        for (String chocolate : chocolates) {
            copiedChocolates.add(chocolate);
        }
        return copiedChocolates;
    }
}
