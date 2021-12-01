package ch03.item10;

public class ColorPointTester {
    public static void main(String[] args) {
        ColorPoint colorPoint = new ColorPoint(1,2, ColorPoint.Color.BLUE);
        Point point = new Point(1,2);

        System.out.println(point.equals(colorPoint));
        System.out.println(colorPoint.equals(point));//대칭성에 위배된다.
    }
}
