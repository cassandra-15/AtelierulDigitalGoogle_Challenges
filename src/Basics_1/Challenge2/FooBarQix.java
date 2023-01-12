package Basics_1.Challenge2;

public class FooBarQix {
    public static void main(String[] args) {

        for (int i = 1; i <= 33; i++)
            System.out.println(i + " => " + compute(i));
    }

    private static String compute(Integer i) {
        StringBuilder str = new StringBuilder();
        Integer clona=i;
        while (i != 0) {
            if (i == 3)
                str.append("Foo");
            if (i % 3 == 0)
                str.append("Foo");
            if (i == 5)
                str.append("Bar");
            if (i % 5 == 0)
                str.append("Bar");
            if (i == 7)
                str.append("Qix");
            if (i % 7 == 0)
                str.append("Qix");
            else if (i % 3 != 0 & i % 5 != 0 & i % 7 != 0 )
                return i.toString();
            i = i / 10;
        }
        return str.toString();
    }
}
