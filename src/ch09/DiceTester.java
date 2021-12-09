package ch09;

import java.util.EnumSet;
import java.util.Iterator;

public class DiceTester {
    public static void main(String[] args) {

        EnumSet<Dice> dice = EnumSet.allOf(Dice.class);
        for(Iterator<Dice> it =dice.iterator(); it.hasNext();){
            for(Iterator<Dice> it2 =dice.iterator(); it2.hasNext();){
                System.out.println(it.next() + " " + it2.next()); //여섯번만 불린다!!
            }
        }

        System.out.println("-------------");
        for (int i = 0; i < dice.size(); i++) {
            Iterator<Dice> it = dice.iterator();
            for (int j = 0; j < dice.size(); j++) {
                Iterator<Dice> it2 = dice.iterator();
                System.out.println(it.next() + " " + it2.next()); //올바른 해답!
            }
        }
    }
}
