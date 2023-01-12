package Generics_5.Challenge2;

public class Pair <T extends Running>{
    private T first;
    private T second;

    public Pair(T first, T second) throws SizesDoNotMatchException, ColorsDoNotMatchException {
        this.first = first;
        this.second = second;
        if(!first.getColour().equals(second.getColour()))
            throw new ColorsDoNotMatchException("shoes don't have the same colour!");
        if(first.getNumber()!=second.getNumber())
            throw new SizesDoNotMatchException("shoes don't have the same size!");
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }

}
