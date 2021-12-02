package ch04.item15;

import java.util.List;

public class ChocolateRoomTester {
    public static void main(String[] args) {
        List<String> chocolates = List.of("chocola","banilla","cacao");
        ChocolateRoom chocolateRoom = new ChocolateRoom(chocolates);
        for (String s : chocolateRoom.CHOCOLATE_LIST) {
            System.out.println(s);
        }
        System.out.println("---------------");
        System.out.println(chocolateRoom.CHOCOLATE_LIST.equals(chocolates));
        chocolates.add("sugarsugar");//오~~  에러발생 . final 이라서!!

    }
}
