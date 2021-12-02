package ch03.item11;

import ch03.item10.Point;

public class HashcodeTester {
    public static void main(String[] args) {
        Point point = new Point(1,2);
        int hashCode = point.hashCode();
        System.out.println(hashCode);
    }
}
