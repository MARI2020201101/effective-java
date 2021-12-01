package ch03.item10;

import java.util.Objects;

public class SizePoint extends Point{
    private Size size;

    public SizePoint(int x, int y ,Size size) {
        super(x, y);
        this.size=size;
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof SizePoint)
            return super.equals(o) && ((SizePoint) o).size==size;
        if(o instanceof Point)
            return super.equals(o);
        return false;
    }

    public enum Size{
        SMALL, MEDIUM, LARGE
    }
}
