package ch06.item37;

public class PhaseTesterV2 {
    public static void main(String[] args) {
        PhaseV2.Transition from = PhaseV2.Transition.from(PhaseV2.GAS, PhaseV2.SOLID);
        System.out.println(from);
        PhaseV2.Transition from2 = PhaseV2.Transition.from(PhaseV2.LIQUID, PhaseV2.GAS);
        System.out.println(from2);
    }
}
