package Collections_6.Challenge5;

import java.util.*;

public class sortedLists implements Comparator<Integer> {
    static List<Integer> list1=new ArrayList<>();
    static List<Integer> list2=new ArrayList<>();
    static List<Integer> mergeList=new ArrayList<>();



    public static void main(String[] args) {
        list1=Arrays.asList(5,6,1);
        list2=Arrays.asList(4,3,2);

        sortare(list1);
        sortare(list2);

        mergeList.addAll(list1);
        mergeList.addAll(list2);

        sortare(mergeList);

        System.out.println(mergeList);
    }

    public static void merge(List<Integer> list1, List<Integer> list2) {
        ;
    }

    @Override
    public int compare(Integer o1, Integer o2) {
        return 0;
    }

    public static void sortare(List<Integer> list) {
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 != null && o2 != null)
                    return o1.compareTo(o2);
                else
                    return 0;
            }
        });
    }
}
