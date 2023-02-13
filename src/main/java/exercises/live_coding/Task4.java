package exercises.live_coding;

import java.util.Arrays;

/**
 * For a given array Arr[] containing integer elements, write a code to find the minimum and maximum elements of the array
 */
public class Task4 {

    public static Integer findMinimum(int[] arr) {

        if (arr.length > 0) {
            return Arrays.stream(arr)
                         .min()
                         .getAsInt();
        }
        else {
            System.out.println("Given array is empty ! No minimum value found.");
            return null;
        }
    }

    public static void main(String[] args) {
        int[] array = {2, 5, 6, 7, 45, 678};
        int[] array2 = {};
        System.out.println("Minimal value in the array is: " + findMinimum(array));
        System.out.println("Minimal value in the array is: " + findMinimum(array2));
    }
}
