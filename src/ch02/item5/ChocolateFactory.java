package ch02.item5;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class ChocolateFactory {

    private Map<ChocoType,Chocolate> chocolateMap = new HashMap<>();
    private Map<CrunchChocolate.ChocoDeco, Chocolate> chocoDecoChocolateMap = new HashMap<>();
    public enum ChocoType{
        HEART,CRUNCH
    }
    public ChocolateFactory(){
        chocolateMap.put(ChocoType.HEART,new HeartChocolate("you"));
        chocolateMap.put(ChocoType.CRUNCH,new CrunchChocolate("you", CrunchChocolate.ChocoDeco.CINNAMON));

        chocoDecoChocolateMap.put(CrunchChocolate.ChocoDeco.NONE,new CrunchChocolate("you", CrunchChocolate.ChocoDeco.NONE));
        chocoDecoChocolateMap.put(CrunchChocolate.ChocoDeco.ALMOND,new CrunchChocolate("you", CrunchChocolate.ChocoDeco.ALMOND));
        chocoDecoChocolateMap.put(CrunchChocolate.ChocoDeco.CINNAMON,new CrunchChocolate("you", CrunchChocolate.ChocoDeco.CINNAMON));
        chocoDecoChocolateMap.put(CrunchChocolate.ChocoDeco.BANANA,new CrunchChocolate("you", CrunchChocolate.ChocoDeco.BANANA));
    }

    public Chocolate givemeChoco(ChocoType chocoType){
        Supplier<Chocolate> chocolateSupplier = () -> chocolateMap.get(chocoType);
        return chocolateSupplier.get();
    }

    public Chocolate givemeCrunchChoco(CrunchChocolate.ChocoDeco chocoDeco){
        Supplier<Chocolate> chocolateSupplier = ()-> chocoDecoChocolateMap.get(chocoDeco);
        return chocolateSupplier.get();
    }
}
