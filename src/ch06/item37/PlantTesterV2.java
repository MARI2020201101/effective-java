package ch06.item37;

import java.util.*;
import java.util.stream.Collectors;

public class PlantTesterV2 {
    public static void main(String[] args) {

        Plant[] garden = {new Plant("rose", Plant.LifeCycle.ANNUAL)
                ,new Plant("sunFlower", Plant.LifeCycle.ANNUAL)
                ,new Plant("oi", Plant.LifeCycle.PERENNIAL)
                ,new Plant("pumpkin", Plant.LifeCycle.PERENNIAL)
                ,new Plant("chesongwa", Plant.LifeCycle.BIENNIAL)
                ,new Plant("fff", Plant.LifeCycle.BIENNIAL)};

        //Enum map을 이용하여 enum을 키로 하는 set을 넣는다...
        EnumMap<Plant.LifeCycle, Set<Plant>> enumMap = new EnumMap<>(Plant.LifeCycle.class);
        for(Plant.LifeCycle pl : Plant.LifeCycle.values()){
            enumMap.put(pl,new HashSet<>());
        }
        for(Plant p : garden){
            Set<Plant> plants = enumMap.get(p.getLifeCycle());
            plants.add(p);
        }

        System.out.println(enumMap);

    }
}
