package Collections_6.Challenge9;

public interface MySet <T>{
    void add(T e);
    void remove(T e);
    T get(int index);
    void set(int index, T e);
    int size();
    boolean contains(T e);
}
