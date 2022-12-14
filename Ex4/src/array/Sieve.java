package array;

import java.util.ArrayList;

public class Sieve {

    public Integer[] simple(int[] array){
        ArrayList<Integer> list = new ArrayList<>();
        try {
            int max = findMax(array);
            int[] table = createTable(max);
            for (int item : array) {
                if (table[item] == 0)
                    list.add(item);
            }

        }
        finally {
            Integer[] arr = new Integer[list.size()];
            return list.toArray(arr);
        }
    }

    private int[] createTable(int maxItem){
        int[] table = new int[maxItem+1];
        table[1] = 0; // 1 - не простое число
        // заполняем решето единицами
        for(int k=2; k<=maxItem; k++)
            table[k]=1;

        for(int k=2; k*k<=maxItem; k++){
            // если k - простое (не вычеркнуто)
            if(table[k]==1){
                // то вычеркнем кратные k
                for(int l=k*k; l<=maxItem; l+=k){
                    table[l]=0;
                }
            }
        }
        return table;
    }

    private int findMax(int[] array){
        int max = array[0];
        for (int item: array) {
            if (item > max)
                max = item;
        }
        return max;
    }
}
