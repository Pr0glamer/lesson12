import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class AlgoritmsTest {

    @Test
    public void shouldSortArray() {
        int [] base = {11, 3, 14, 16, 7};
        int [] sorted = {3, 7, 11, 14, 16};
        Algoritms algoritms = new Algoritms();
        int[] sortedByObject = algoritms.sort(base);
        assertTrue(Arrays.equals(sorted, sortedByObject));

    }

    @Test
    public void shouldFindIndexInSortedArray() {
        int [] base = {11, 3, 14, 16, 7};
        Algoritms algoritms = new Algoritms();
        int[] sortedByObject = algoritms.sort(base);
        int index = algoritms.binarySearch(sortedByObject, 14);
        assertEquals(index, 3);

    }

    @Test
    public void shouldReturnMinus1InSortedArrayWhenElementNotFound() {
        int [] base = {11, 3, 14, 16, 7};
        Algoritms algoritms = new Algoritms();
        int[] sortedByObject = algoritms.sort(base);
        int index = algoritms.binarySearch(sortedByObject, 15);
        assertEquals(index, -1);

    }


}
