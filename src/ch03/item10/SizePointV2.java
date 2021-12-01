package ch03.item10;

public class SizePointV2 {
    private Point point;
    private Size size;

    public SizePointV2(Point point , Size size) {
        this.point=point;
        this.size=size;
    }

    public Point asPoint(){
        return point;
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof SizePointV2){
            SizePointV2 target = (SizePointV2) o;
            return point.equals(target.point) && size.equals(target.size);
        }
        return false;
    }

    public enum Size{
        SMALL, MEDIUM, LARGE
    }
}
