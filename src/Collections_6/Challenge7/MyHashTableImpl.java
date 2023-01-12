package Collections_6.Challenge7;

import java.util.HashMap;

public class MyHashTableImpl implements MyHashTable{
    HashMap map=new HashMap<>();

    @Override
    public Object get(Object key) {
        return map.get(key);
    }

    @Override
    public void put(Object key, Object value) {
        map.put(key,value);
    }

    @Override
    public void remove(Object key) {
        map.remove(key);
    }

    @Override
    public boolean contains(Object key) {
        return map.containsKey(key);
    }

    @Override
    public int size() {
        return map.size();
    }
}
