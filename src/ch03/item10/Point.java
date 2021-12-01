package ch03.item10;

import java.util.Objects;

public class Point {
    private int x;
    private int y;

    public Point(int x,int y ){
        this.x=x;
        this.y=y;
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
