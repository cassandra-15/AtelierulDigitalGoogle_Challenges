package Design_Patterns_3.Challenge5;

public abstract class TemplateMethodBubleSort {
    void sort(Integer[] list)
    {
        Integer aux=0;
        for(int i=0;i<list.length-1;i++)
            for(int j=i+1;j<list.length;j++)
                if(numbersInCorrectOrder(list[i],list[j]))
                {
                    aux=list[i];
                    list[i]=list[j];
                    list[j]=aux;
                }

    }

    abstract boolean numbersInCorrectOrder(Integer i1,Integer i2);

}
