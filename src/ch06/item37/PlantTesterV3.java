package ch06.item37;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PlantTesterV3 {
    public static void main(String[] args) {
        Plant[] garden = {new Plant("rose", Plant.LifeCycle.ANNUAL)
                ,new Plant("sunFlower", Plant.LifeCycle.ANNUAL)
                ,new Plant("oi", Plant.LifeCycle.PERENNIAL)
                ,new Plant("pumpkin", Plant.LifeCycle.PERENNIAL)
                ,new Plant("chesongwa", Plant.LifeCycle.BIENNIAL)
                ,new Plant("fff", Plant.LifeCycle.BIENNIAL)};


        Map<Plant.LifeCycle, List<Plant>> gardenPlants = Arrays.stream(garden)
                .collect(Collectors.groupingBy(p -> p.getLifeCycle()));
        System.out.println(gardenPlants);
    }
}
