package ch02.item8;

public class AutoRoomCleaner {
    public static void main(String[] args) {
        Room room102 = new Room(new Room.State(10));
        System.gc();//와. 안닫아주네....
    }
}
