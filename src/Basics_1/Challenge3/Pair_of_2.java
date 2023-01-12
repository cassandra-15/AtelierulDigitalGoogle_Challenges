package Basics_1.Challenge3;

public class Pair_of_2 {
    public static void main(String[] args) {
//        Integer[] numbers = {3, 2, -3, -2, 3, 0};
//        Integer[] numbers = {1, 1, 0, -1, -1};
        Integer[] numbers = {5, 9, -5, 7, -5};
        Integer pairCount = 0;
        boolean[] usedNumbers = new boolean[numbers.length];
        for (Integer i = 0; i < numbers.length - 1; i++)
            if (!usedNumbers[i]) {
                for (Integer j = i + 1; j < numbers.length; j++)
                    if (numbers[i] + numbers[j] == 0 && !usedNumbers[j]) {
                        pairCount += 1;
                        usedNumbers[j] = true;
                        usedNumbers[i] = true;
                        break;
                    }
            }
        System.out.println(pairCount);

    }
}
