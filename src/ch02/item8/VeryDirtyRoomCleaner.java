package ch02.item8;

public class VeryDirtyRoomCleaner {
    public static void main(String[] args) throws Exception {
        Room veryDirtyRoom = new Room(new Room.State(99));
        veryDirtyRoom.close();
    }
}
