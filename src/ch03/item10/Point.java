package ch03.item10;

import java.util.Objects;

public class Point {
    private int x;
    private int y;

    public Point(int x,int y ){
        this.x=x;
        this.y=y;
    }

    public String toString(){
        return "[" + x + "," + y + "] ";
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof Point){
            Point target = (Point) o;
            return target.x==x && target.y==y;
        }
        return false;
    }
}
