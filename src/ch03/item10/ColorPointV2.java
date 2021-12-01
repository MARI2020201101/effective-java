package ch03.item10;

public class ColorPointV2 extends Point{
    private Color color;

    public ColorPointV2(int x, int y, Color color) {
        super(x, y);
        this.color=color;
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof ColorPointV2){
            return super.equals(o) && ((ColorPointV2) o).color==color;
        }
        if(o instanceof Point)
            return super.equals(o);
        return false;
    }

    public enum Color{
        RED, YELLOW, BLUE, GREEN
    }
}
