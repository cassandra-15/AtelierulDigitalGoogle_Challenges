package Design_Patterns_3.Challenge2;

import java.util.Arrays;

public class Main {
    static void displaySorted(SortingStrategy strategy, Integer[] arr)
    {
        strategy.sort(arr);
        for(int i=0;i<arr.length;i++)
        System.out.println(arr[i]);
    }

    public static void main(String[] args) {
        Integer[] arr=new Integer[]{1,4,5,2,3,6,9,8,7};
        Integer[] coy01OfArr= Arrays.copyOf(arr,arr.length);
        Integer[] coy02OfArr= Arrays.copyOf(arr,arr.length);
        displaySorted(new BubleSort(),coy01OfArr);
        displaySorted(new MergeSort(),coy02OfArr);
    }
}
