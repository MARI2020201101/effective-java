package ch03.item10;

public class ColorPointTesterV2 {
    public static void main(String[] args) {
        ColorPointV2 colorPoint = new ColorPointV2(1,2, ColorPointV2.Color.BLUE);
        Point point = new Point(1,2);
        ColorPointV2 colorPoint2 = new ColorPointV2(1,2, ColorPointV2.Color.RED);

        System.out.println(point.equals(colorPoint));
        System.out.println(colorPoint.equals(point));
        System.out.println(point.equals(colorPoint2));
        System.out.println(colorPoint.equals(colorPoint2));//추이성에 위배된다!
    }
}
