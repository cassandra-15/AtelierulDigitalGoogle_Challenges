package Design_Patterns_3.Challenge1;

public class ArrayCustomIterator {
    private int[] array;
    private int currentPosition = -1;

    public ArrayCustomIterator(int[] arr) {
        this.array = arr;
    }

    public boolean hasNext() {

        if (array == null)
            return false;
        else if (currentPosition  < array.length-1)
            return true;
        else
            return false;

    }

    public int next() {
        currentPosition ++;
        return array[currentPosition];
    }
}
