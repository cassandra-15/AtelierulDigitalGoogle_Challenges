package Collections_6.Challenge7;

public interface MyHashTable<K,V> {
    V get(K key);
    void put(K key,V value);
    void remove(K key);
    boolean contains(K key);
    int size();
}
