package exercises.live_coding;

import java.util.Arrays;

/**
 * For a given array of size N, write a code to print the reverse of the array
 */
public class Task1 {

    public static int[] reverseArray(int[] arr) {

        int temp;
        int start = 0;
        int end = (arr.length) - 1;

        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        return arr;

    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};

        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("Reversed array: " + Arrays.toString(reverseArray(arr)));
    }
}
