import huson.BubbleSort;
import huson.InsertionSort;
import huson.SelectionSort;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

public class HusonSortTest
{
    private int[] array = null;
    private int[] sortedArray = null;
    private int number = 200;
    private int min = 100;
    private int max = 1000;

    @Before
    public void setArray()
    {
        array = generateRandomArray(number, min, max);
        sortedArray = Arrays.copyOf(array, array.length);
        Arrays.sort(sortedArray);
    }

    @After
    public void clearArray()
    {
        array = null;
        sortedArray = null;
    }

    @Test
    public void testBubbleSort()
    {
        System.out.println("sortedArray = \n" + Arrays.toString(sortedArray));
        System.out.println("bubbleSortedArray = \n" + Arrays.toString(new BubbleSort().sort(array)));
        Assert.assertArrayEquals(sortedArray, new BubbleSort().sort(array));
    }

    @Test
    public void testSelectionSort()
    {
        System.out.println("sortedArray = \n" + Arrays.toString(sortedArray));
        System.out.println("selectionSortedArray = \n" + Arrays.toString(new SelectionSort().sort(array)));
        Assert.assertArrayEquals(sortedArray, new SelectionSort().sort(array));
    }

    @Test
    public void testInsertionSort()
    {
        System.out.println("sortedArray = \n" + Arrays.toString(sortedArray));
        System.out.println("selectionSortedArray = \n" + Arrays.toString(new InsertionSort().sort(array)));
        Assert.assertArrayEquals(sortedArray, new InsertionSort().sort(array));
    }

    private int[] generateRandomArray(int number, int min, int max)
    {
        int[] result = new int[number];

        for (int i = 0; i < number; i++) {
            Random random = new Random();
            result[i] = random.nextInt(max - min) + min;
        }
        return result;
    }
}
