package ch02.item8;

import java.lang.ref.Cleaner;

public class Room implements AutoCloseable{
    private final State state;
    private final Cleaner cleaner = Cleaner.create();
    private Cleaner.Cleanable cleanable;

    public Room(State state){
        this.state = state;
        this.cleanable = cleaner.register(this, state);
    }

    public static class State implements Runnable{
        private int trashCount = 10;
        public State(int trashCount){
            this.trashCount = trashCount;
        }

        @Override
        public void run() {
            System.out.println("방청소를 하자!");
            for (int i = trashCount; i >= 0 ; i--) {
                System.out.println("쓰레기 처치 : " + trashCount--);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    @Override
    public void close() throws Exception {
        cleanable.clean();
    }
}
