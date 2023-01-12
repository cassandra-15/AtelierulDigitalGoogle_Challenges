package Generics_5.Challenge2;

public class Main {
    public static void main(String[] args) throws SizesDoNotMatchException, ColorsDoNotMatchException {
        Running runningShoe1 = new Running("RED", 41);
        Running runningShoe2 = new Running("RED", 42);
        Pair<Running> pairOK = new Pair(runningShoe1, runningShoe2);
        System.out.println(pairOK);

    Running runningShoe1_=new Running("RED", 41);
    Boot bootShoe=new Boot("BLACK", 45);
//    Pair<Running,Boot> pairOk=new Pair<>(runningShoe1,bootShoe);

    }
}
