package ch04.item15;

import java.util.List;

public class ChocolateRoomTesterV2 {
    public static void main(String[] args) {
        List<String> chocolates = List.of("chocola","banilla","cacao");
        ChocolateRoomV2 chocolateRoom = new ChocolateRoomV2(chocolates);
        List<String> chocolateList = chocolateRoom.showChocolateList();
        System.out.println(chocolateList);
        System.out.println(chocolates);
        System.out.println(chocolates.equals(chocolateList));
        chocolateList.add("sugarsugar");
        System.out.println(chocolateList);
        System.out.println(chocolates.equals(chocolateList));

    }
}
