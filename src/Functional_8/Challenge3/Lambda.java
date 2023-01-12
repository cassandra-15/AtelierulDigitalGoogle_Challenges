package Functional_8.Challenge3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("helicopter", "elephant", "laptop", "lie","1","2","23" ,"omg"));
        List<String> list1 = new ArrayList<>();
        StringBuilder str = new StringBuilder();

        list.forEach((n) -> {
            str.append(n.charAt(0));
        });

        list1 = list.stream().filter(n -> n.length() % 2 != 0).collect(Collectors.toList());
        for (String elem : list1)
            list.remove(elem);

        list = list.stream().map(n -> n.toUpperCase()).collect(Collectors.toList());

        System.out.println(str);
        System.out.println(list);

    }


}
