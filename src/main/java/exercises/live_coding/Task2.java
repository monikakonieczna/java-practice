package exercises.live_coding;

import java.util.Arrays;

/**
 * For a given array A, write a code to delete the duplicate elements in the array
 */
public class Task2 {


    public static int[] removeDuplicatesFromArray(int[] array) {

        return Arrays.stream(array).distinct()
                     .toArray();
    }


    public static void main(String[] args) {
        int[] arrayWithDuplicates = {1, 1, 1, 2, 2, 3, 4, 5, 6};
        System.out.println("Array with duplicates: " + Arrays.toString(arrayWithDuplicates));
        int[] arrayWithoutDuplicates = removeDuplicatesFromArray(arrayWithDuplicates);
        System.out.println("Filtered array: " + Arrays.toString(arrayWithoutDuplicates));
    }
}
