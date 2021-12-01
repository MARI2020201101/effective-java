package ch03.item10;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class PointV2 {
    private int x;
    private int y;
    public static final Set<PointV2> unitCirCle = new HashSet<>();

    public PointV2(int x,int y){
        this.x=x;
        this.y=y;
    }

    @Override
    public boolean equals(Object o) {
       if(null!=o && o.getClass() == this.getClass())
           return ((PointV2)o).x==x && ((PointV2)o).y==y;
        return false;
    }

    public static boolean onUnitCircle(PointV2 p){
        return unitCirCle.contains(p);
    }
    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
