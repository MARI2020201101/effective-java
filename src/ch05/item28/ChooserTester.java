package ch05.item28;

import java.util.List;

public class ChooserTester {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3);
        ChooserV2 chooserV2 = new ChooserV2(list);//T 가 그냥 Object가 되네..힝...
        Object choose = chooserV2.choose();
        System.out.println(choose);

        ChooserV3 chooserV3 = new ChooserV3(list);
        Object choose1 = chooserV3.choose();
        System.out.println(choose1);
    }
}
