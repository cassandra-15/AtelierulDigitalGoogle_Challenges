package Design_Patterns_3.Challenge5;

import java.util.Arrays;

public class TemplateMethodExample {
    public static void main(String[] args) {
    Integer[] arr=new Integer[]{1,4,5,2,3,6,9,8,7};
    Integer[] copy01OfArr= Arrays.copyOf(arr,arr.length);
    Integer[] copy02OfArr= Arrays.copyOf(arr,arr.length);

    AscBubleSort asc=new AscBubleSort();
    asc.sort(copy01OfArr);
    DescBubleSort desc=new DescBubleSort();
    desc.sort(copy02OfArr);

    displaySorted(copy01OfArr);
    displaySorted(copy02OfArr);
    }

    public static void displaySorted(Integer[] arr)
    {
        for(Integer i:arr)
            System.out.println(i);
    }
}
