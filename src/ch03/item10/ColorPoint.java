package ch03.item10;

import java.util.Objects;

public class ColorPoint extends Point{
    private Color color;

    public ColorPoint(int x, int y, Color color) {
        super(x, y);
        this.color=color;
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof ColorPoint){
            return super.equals(o) && ((ColorPoint) o).color==color;
        }
        return false;
    }

    public enum Color{
        RED, YELLOW, BLUE, GREEN
    }
}
