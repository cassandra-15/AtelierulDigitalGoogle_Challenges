package Collections_6.Challenge9;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MySetImpl implements MySet{
    private Set set=new HashSet<>();
    @Override
    public void add(Object e) {
        set.add(e);
    }

    @Override
    public void remove(Object e) {
        set.remove(e);
    }

    @Override
    public Object get(int index) {
        List list=List.of(set);
        return list.get(index);
    }

    @Override
    public void set(int index, Object e) {
    }

    @Override
    public int size() {
        return set.size();
    }

    @Override
    public boolean contains(Object e) {
        return set.contains(e);
    }
}
