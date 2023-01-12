package Basics_1.Challenge1;

public class FizzBuzz {
    public static void main(String[] args) {
        //Stage1:
        for (int i = 1; i <= 100; i++) {
            System.out.println(Stage1(i));
        }
        System.out.println("\n");
        //Stage2
        for (int i = 1; i <= 100; i++) {
            System.out.println(Stage2(i));
        }
    }

    private static String Stage1(Integer i) {
        if (i % 3 == 0 & i % 5 == 0)
            return "FizzBuzz ";
        if (i % 3 == 0)
            return "Fizz ";
        if (i % 5 == 0)
            return "Buzz ";
        else
            return i.toString();
    }

    private static String Stage2(Integer i) {
        if (i % 3 == 0 & i % 5 == 0)
            return "FizzBuzz ";
        if (i % 3 == 0)
            return "Fizz ";
        if (i % 5 == 0)
            return "Buzz ";
        if (i % 7 == 0)
            return "Rizz ";
        if (i % 11 == 0)
            return "Rizz ";
        else
            return i.toString();
    }
}
