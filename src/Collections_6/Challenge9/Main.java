package Collections_6.Challenge9;

public class Main {
    public static void main(String[] args) {
        MySet set=new MySetImpl();
        set.add(2);
        set.add(5);
        set.add(1);
        System.out.println(set.size());
    }
}
