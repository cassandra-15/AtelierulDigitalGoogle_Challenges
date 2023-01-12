package Design_Patterns_3.Challenge2;

public class BubleSort implements SortingStrategy{
    @Override
    public void sort(Integer[] list) {
        Integer aux;
        for(int i=0;i<list.length-1;i++)
            for(int j=i+1;j<list.length;j++)
            {
                if(list[i]>list[j])
                {
                    aux=list[i];
                    list[i]=list[j];
                    list[j]=aux;
                }

            }
    }


}
