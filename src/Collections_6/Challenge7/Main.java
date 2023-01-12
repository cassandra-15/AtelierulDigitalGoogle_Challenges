package Collections_6.Challenge7;

public class Main {
    public static void main(String[] args) {
        MyHashTable myHashTable=new MyHashTableImpl();
        //TODO Stage1
        myHashTable.put("Key1","value1");
        myHashTable.put("Key2","value2");
        myHashTable.put("Key3","value3");
        System.out.println(myHashTable.size());//prints3

        //TODO Stage2
        myHashTable.put(2,"value4");
        System.out.println(myHashTable.size());//prints 4
    }
}
