package ch02.item5;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class ChocolateFactoryV2 implements Supplier<Chocolate> {
    private CrunchChocolate.ChocoDeco type;
    private Map<CrunchChocolate.ChocoDeco, Chocolate> chocoDecoChocolateMap = new HashMap<>();

    public ChocolateFactoryV2(CrunchChocolate.ChocoDeco type){
        this.type=type;
        chocoDecoChocolateMap.put(type, new CrunchChocolate("you",type));
    }

    public Chocolate givemeChoco(){
        Chocolate chocolate = chocoDecoChocolateMap.get(type);
        return chocolate;
    }

    @Override
    public Chocolate get() {
        return givemeChoco();
    }
}
