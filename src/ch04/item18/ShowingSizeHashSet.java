package ch04.item18;

import java.util.Collection;
import java.util.HashSet;

public class ShowingSizeHashSet extends HashSet {
    private int addCount=0;

    @Override
    public boolean add(Object o) {
        addCount++;
        return super.add(o);
    }

    @Override
    public boolean addAll(Collection c) {
        addCount+=c.size();
        return super.addAll(c);
    }

    public int showAddCount(){
        return addCount;
    }
}
