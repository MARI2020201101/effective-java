package ch06.item37;

import java.util.HashSet;
import java.util.Set;

public class PlantTester {
    public static void main(String[] args) {

        Plant[] garden = {new Plant("rose", Plant.LifeCycle.ANNUAL)
                ,new Plant("sunFlower", Plant.LifeCycle.ANNUAL)
                ,new Plant("oi", Plant.LifeCycle.PERENNIAL)
                ,new Plant("pumpkin", Plant.LifeCycle.PERENNIAL)
                ,new Plant("chesongwa", Plant.LifeCycle.BIENNIAL)
                ,new Plant("fff", Plant.LifeCycle.BIENNIAL)};

        Set<Plant>[] sets = new Set[Plant.LifeCycle.values().length];
        for (int i = 0; i < Plant.LifeCycle.values().length; i++) {
            sets[i] = new HashSet<>();
        }
        for(Plant p : garden){
            sets[p.getLifeCycle().ordinal()].add(p);
        }

        for (int i = 0; i < sets.length; i++) {
            System.out.printf("%s: %s\n", Plant.LifeCycle.values()[i], sets[i]);
        }
    }
}
