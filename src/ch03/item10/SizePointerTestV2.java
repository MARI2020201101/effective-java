package ch03.item10;

public class SizePointerTestV2 {
    public static void main(String[] args) {
        SizePointV2 p1 = new SizePointV2(new Point(1,2), SizePointV2.Size.MEDIUM);
        SizePointV2 p2 = new SizePointV2(new Point(1,2), SizePointV2.Size.MEDIUM);
        SizePointV2 p3 =  new SizePointV2(new Point(2,2), SizePointV2.Size.MEDIUM);
        SizePointV2 p4 =  new SizePointV2(new Point(1,2), SizePointV2.Size.LARGE);


        System.out.println(p1.equals(p2));
        System.out.println(p2.equals(p1));
        System.out.println(p1.equals(p3));
        System.out.println(p3.equals(p1));
        System.out.println(p1.equals(p4));
        System.out.println(p4.equals(p1));

        Point point = p1.asPoint();
        System.out.println(point);
    }
}
