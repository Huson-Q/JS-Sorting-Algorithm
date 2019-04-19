package huson;

import java.util.Arrays;

public class SelectionSort implements ISort
{
    @Override
    public int[] sort(int[] arr)
    {
        int[] result = Arrays.copyOf(arr, arr.length);
        for (int i = 0; i < result.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < result.length; j++) {
                if (result[minIndex] > result[j]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                int tmp = result[i];
                result[i] = result[minIndex];
                result[minIndex] = tmp;
            }
        }

        return result;

    }

}
