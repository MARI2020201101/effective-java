package ch06.item37;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public enum PhaseV2 {
    SOLID,LIQUID,GAS;

    public enum Transition{
        MELT(SOLID,LIQUID), FREEZE(LIQUID,SOLID), BOIL(LIQUID,GAS),
        CONDENSE(GAS,LIQUID), SUBLIME(SOLID,GAS), DEPOSIT(GAS,SOLID);

        private PhaseV2 from;
        private PhaseV2 to;

        private Transition(PhaseV2 from, PhaseV2 to){
            this.from=from;
            this.to=to;
        }

        private static final Map<PhaseV2, Map<PhaseV2, Transition>> gardenMap;

        static{
            gardenMap = Stream.of(values()).collect(
                    groupingBy(
                            t -> t.from
                            , () -> new EnumMap<>(PhaseV2.class)
                            , toMap(t -> t.to
                                    , t -> t
                                    , (x, y) -> y
                                    , () -> new EnumMap<PhaseV2, Transition>(PhaseV2.class))));
        }

        public static Transition from(PhaseV2 from, PhaseV2 to){
            return gardenMap.get(from).get(to);
        }
    }


}
