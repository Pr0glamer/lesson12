import java.util.Arrays;

public class Algoritms {

    public static void main(String[] args) {
        int [] arr = {11, 3, 14, 16, 7};
        Algoritms algoritms = new Algoritms();
        System.out.println(Arrays.toString(arr));
        int[] sorted = algoritms.sort(arr);
        System.out.println(Arrays.toString(sorted));
        int index = algoritms.binarySearch(sorted, 14);
        System.out.println(index);
    }

    public int[] sort(int[] array) {
        boolean isSorted = false;
        int tmp;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length-1; i++) {
                if(array[i] > array[i+1]){
                    isSorted = false;

                    tmp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = tmp;
                }
            }
        }
        return array;
    }

    public int binarySearch(int[] array, int searchElement)
    {
        int low = 0, high = array.length - 1;

        while (high - low > 1) {
            int middle = (high + low) / 2;
            if (array[middle] < searchElement) {
                low = middle + 1;
            }
            else {
                high = middle;
            }
        }
        if (array[low] == searchElement) {
            return low;
        }
        else if (array[high] == searchElement) {
            return high;
        }
        else {
            return -1;
        }
    }

}
