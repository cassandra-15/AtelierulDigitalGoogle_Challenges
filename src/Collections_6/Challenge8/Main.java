package Collections_6.Challenge8;

import Collections_6.Challenge7.MyHashTable;
import Collections_6.Challenge7.MyHashTableImpl;

public class Main {
    public static void main(String[] args) {
        MyArrayList myArrayList=new MyArrayListImpl();
        myArrayList.add(1);
        myArrayList.add(5);
        myArrayList.remove(1);
        myArrayList.set(0,7);
        myArrayList.add(3);
        System.out.println(myArrayList.get(0));//prints 7
        System.out.println(myArrayList.size());//prints 2

    }
}
