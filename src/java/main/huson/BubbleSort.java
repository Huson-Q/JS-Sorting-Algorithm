package huson;

import java.util.Arrays;

public class BubbleSort implements ISort
{
    @Override
    public int[] sort(int[] arr)
    {
        int[] result = Arrays.copyOf(arr, arr.length);
        for (int i = 1; i < result.length; i++) {
            for (int j = 0; j < result.length - i; j++) {
                if (result[j] > result[j + 1]) {
                    int temp = result[j];
                    result[j] = result[j + 1];
                    result[j + 1] = temp;
                }
            }

        }
        return result;
    }
}
