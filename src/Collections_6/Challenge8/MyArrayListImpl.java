package Collections_6.Challenge8;

import java.util.ArrayList;
import java.util.List;

public class MyArrayListImpl implements MyArrayList {
    private List list = new ArrayList<>();

    @Override
    public void add(Object e) {
        list.add(e);
    }

    @Override
    public void remove(Object e) {
        list.remove(e);
    }

    @Override
    public Object get(int index) {
        return list.get(index);
    }

    @Override
    public void set(int index, Object e) {
        list.set(index,e);
    }

    @Override
    public int size() {
        return list.size();
    }
}
