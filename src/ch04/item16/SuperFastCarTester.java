package ch04.item16;

import java.util.ArrayList;
import java.util.List;

public class SuperFastCarTester {
    public static void main(String[] args) {
        SuperFastCar s1 = new SuperFastCar(100);
        SuperFastCar s2 = new SuperFastCar(1000);
        SuperFastCar s3 = new SuperFastCar(30);
        List<SuperFastCar> superFastCarList = new ArrayList<>();
        //List.of() 로 만들었을경우 immutable List ERROR 뜬다!! 왱??
        superFastCarList.add(s1);
        superFastCarList.add(s2);
        superFastCarList.add(s3);
        superFastCarList.sort(s1.sortOrder());
        System.out.println(superFastCarList);

        /*
        * The List.of (added in Java 9) and List.copyOf (added in Java 10) static factory
        * methods provide a convenient way to create unmodifiable lists.
        * The List instances created by these methods have the following characteristics-
            The collections returned by the convenience factory methods added in JDK 9 are
            * conventionally immutable.
            * Elements cannot be added, removed, or replaced from such a list. Elements cannot be added, removed,
            * or replaced from such a list.
            * Calling any mutator method on the List will always cause UnsupportedOperationException to be thrown.
        * */
    }
}
