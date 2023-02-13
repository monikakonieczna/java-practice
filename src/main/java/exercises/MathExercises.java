package exercises;

import java.util.ArrayList;
import java.util.List;

public class MathExercises {

    /**
     * Returns the average of 3 integers
     *
     * @param number1
     * @param number2
     * @param number3
     * @return
     */
    public static int countAverage(int number1, int number2, int number3) {
        return (number1 + number2 + number3 / 3);
    }

    /**
     * Print average value of Integers from the list
     */
    public static void printAverageValue() {
        List<Integer> list = createList();
        System.out.println(calculateAverage(list));
    }

    /**
     * Help method to create list of Integers
     *
     * @return List<Integer> list
     */
    private static List<Integer> createList() {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }
        return list;
    }

    /**
     * Calculate average value of integers from a list
     *
     * @param list List<Integer> list
     * @return Average value
     */
    private static Integer calculateAverage(List<Integer> list) {
        Integer sum = 0;
        if (list.isEmpty() & list.size() == 0) {
            System.out.println("List is empty");
        }
        else {
            for (Integer integer : list) {
                sum += list.get(integer);
            }
        }
        return sum / list.size();
    }

    /**
     * Exercise: Calculate factorial for injected integer
     *
     * @param n integer number
     * @return
     */
    public static int calculateFactorial(int n) {
        if (n < 2) {
            return 1;
        }
        else {
            return n * calculateFactorial(n - 1);
        }
    }

    /**
     * Find n-th element from the fibonacci sequence
     *
     * @param n n-th element of fibonacci sequence to find
     * @return
     */
    private static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n < 2)
            return 1;
        else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    /**
     * Write a Java program to check if the given number is a prime number.
     */
    public static boolean isPrime(int n) {
        if (n == 0 || n == 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * How do you check if a list of integers contains only odd numbers in Java?
     *
     * @param list
     * @return
     */
    public static String onlyOddNumbers(List<Integer> list) {
        boolean result = list.parallelStream()
                             .allMatch(e -> e % 2 != 0);
        return "The list contains only odd numbers: " + result;
    }
}
