package Design_Patterns_3.Challenge5;

public class AscBubleSort extends TemplateMethodBubleSort {

    @Override
    boolean numbersInCorrectOrder(Integer i1, Integer i2) {
        if (i2 < i1)
            return true;
        return false;
    }
}

