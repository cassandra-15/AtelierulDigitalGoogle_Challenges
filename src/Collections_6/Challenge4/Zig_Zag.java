package Collections_6.Challenge4;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zig_Zag {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(Arrays.asList(4,3,7,8,6,2,1));
        zigzagRearrange(list);
        System.out.println(list);
    }

    public static void zigzagRearrange(List<Integer> list) {
        boolean flag = true;
        for (int i = 0; i < list.size() - 1; i++) {
            if (flag) {
                if (list.get(i) > list.get(i + 1)) {
                    int temp = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, temp);
                }
            } else {
                if (list.get(i) < list.get(i + 1)) {
                    int temp = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, temp);
                }
            }
            flag = !flag;
        }
    }
}
