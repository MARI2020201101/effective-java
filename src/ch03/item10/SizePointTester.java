package ch03.item10;

public class SizePointTester {
    public static void main(String[] args) {
        ColorPointV2 colorPoint = new ColorPointV2(1,2, ColorPointV2.Color.GREEN);
        SizePoint sizePoint = new SizePoint(1,2, SizePoint.Size.SMALL);
        Point point = new Point(1,2);

        System.out.println(sizePoint.equals(point));
        System.out.println(point.equals(sizePoint));
        System.out.println(colorPoint.equals(sizePoint));
        System.out.println(sizePoint.equals(colorPoint)); //무한재귀에는 빠지지 않았지만... 정합성에 어긋나고 있다...
    }
}
