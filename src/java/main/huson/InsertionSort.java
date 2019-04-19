package huson;

import java.util.Arrays;

public class InsertionSort implements ISort
{
    @Override
    public int[] sort(int[] arr)
    {
        int[] result = Arrays.copyOf(arr, arr.length);
        for (int i = 1; i < result.length; i++) {
            int insertValue = result[i];
            int j = i;
            while (j > 0 && insertValue < result[j - 1] ) {
                result[j] = result[j - 1];
                j--;
            }
            if (j != i) {
                result[j] = insertValue;
            }
        }
        return result;
    }
}