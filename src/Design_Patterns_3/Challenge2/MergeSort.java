package Design_Patterns_3.Challenge2;

public class MergeSort implements SortingStrategy {
    @Override
    public void sort(Integer[] list) {
        if (list.length > 1) {
            Integer[] left = leftHalf(list);
            Integer[] right = rightHalf(list);

            sort(left);
            sort(right);

            merge(list, left, right);
        }

    }

    public Integer[] leftHalf(Integer[] list) {
        Integer size1 = list.length / 2;
        Integer[] left = new Integer[size1];
        for (Integer i = 0; i < size1; i++) {
            left[i] = list[i];
        }
        return left;
    }

    public Integer[] rightHalf(Integer[] list) {
        Integer size1 = list.length / 2;
        Integer size2 = list.length - size1;
        Integer[] right = new Integer[size2];
        for (Integer i = 0; i < size2; i++) {
            right[i] = list[i + size1];
        }
        return right;
    }

    public void merge(Integer[] result, Integer[] left, Integer[] right) {
        Integer i1 = 0;
        Integer i2 = 0;

        for (Integer i = 0; i < result.length; i++) {
            if (i2 >= right.length || (i1 < left.length && left[i1] <= right[i2])) {
                result[i] = left[i1];
                i1++;
            } else {
                result[i] = right[i2];
                i2++;
            }
        }
    }
}
