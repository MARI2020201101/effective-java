package ch06.item37;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class PlantTesterV4 {
    public static void main(String[] args) {
        Plant[] garden = {new Plant("rose", Plant.LifeCycle.ANNUAL)
                ,new Plant("sunFlower", Plant.LifeCycle.ANNUAL)
                ,new Plant("oi", Plant.LifeCycle.PERENNIAL)
                ,new Plant("pumpkin", Plant.LifeCycle.PERENNIAL)
                ,new Plant("chesongwa", Plant.LifeCycle.BIENNIAL)
                ,new Plant("fff", Plant.LifeCycle.BIENNIAL)};


        EnumMap<Plant.LifeCycle, Set<Plant>> gardenPlants = Arrays.stream(garden).collect(
                groupingBy((p) -> p.getLifeCycle()
                        , () -> new EnumMap<>(Plant.LifeCycle.class)
                        , toSet()));

        System.out.println(gardenPlants);
    }
}
