package ch02.item8;

public class RoomCleaner {
    public static void main(String[] args) throws Exception {
        try(Room room101 = new Room(new Room.State(10))){}
    }
}
