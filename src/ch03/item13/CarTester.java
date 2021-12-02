package ch03.item13;

public class CarTester {
    public static void main(String[] args) {
        Car car = new Car("붕붕");
        Car superCar = new SuperCar("부를르를");
        Car clone = car.clone();
        Car clone2 = superCar.clone();

        System.out.println("-------------------");
        SuperCar superCar2 = new SuperCar("붕붕2");
        superCar2.clone();
    }
}
