package ch06.item37;

public class PhaseTester {
    public static void main(String[] args) {
        Phase.Transition from = Phase.Transition.from(Phase.GAS, Phase.SOLID);
        System.out.println(from);
        Phase.Transition from2 = Phase.Transition.from(Phase.LIQUID, Phase.GAS);
        System.out.println(from2);
    }
}
