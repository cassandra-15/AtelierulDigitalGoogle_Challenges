package Collections_6.Challenge1;

import java.util.ArrayList;
import java.util.List;

public class Leaders {
    public static void main(String[] args) {
        List<Integer> list = List.of( 3, 0, 5, 2, 1, 7, 6, 4);
        findLeaders(list);
    }

    public static void findLeaders(List<Integer> list) {
        int max = Integer.MIN_VALUE;
        List<String> leadersList = new ArrayList<>();
        for (int i = 0; i <list.size() ; i++) {
            if (list.get(i) >= max) {
                max = list.get(i);
                System.out.println(max + " is a leader");
            }
        }
        System.out.println(list.get(list.size()-1)+ " is a leader");
    }
}
