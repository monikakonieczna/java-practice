package exercises.live_coding;

import java.util.Arrays;

/**
 * For a given array of size N containing distinct integer numbers, write a code to sort the array in the wave fashion
 */
public class Task3 {

    /**
     * Method to swap two numbers
     *
     * @param array
     * @param a
     * @param b
     */
    public static void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    public static void sortInWave(int[] array, int n) {
        Arrays.sort(array);

        for (int i = 0; i < n - 1; i += 2) {
            swap(array, i, i + 1);
        }

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int n = arr.length;
        sortInWave(arr, n);
        System.out.println(Arrays.toString(arr));
    }
}
