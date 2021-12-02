package ch04.item16;

import java.util.Comparator;

public class SuperFastCar {
    private final int speed;
    public SuperFastCar(int speed){
        this.speed =speed;
    }

    @Override
    public String toString() {
        return "SuperFastCar{" +
                "speed=" + speed +
                '}';
    }

    public Comparator sortOrder() {
        return SpeedComparator.compare(this);
    }

    //헬퍼 메소드를 이너클래스로 등록..
    private static class SpeedComparator{
        public static Comparator compare(SuperFastCar o){
            return Comparator.comparingInt((SuperFastCar s) -> s.speed);
        }

    }
}
