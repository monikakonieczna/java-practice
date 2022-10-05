package exercises;

import java.util.ArrayList;
import java.util.List;

public class ListExercises {

    /**
     * FizzBuzz exercise: Write numbers from 1 to 100, if a number is divisible by 3 then print Fizz, if divisible by 5 is Buzz, if divisible by 3 and 5 then print FizzBuzz. Otherwise, print a number.
     */
    public static void trainFizzBuzz() {
        List<Integer> list = new ArrayList<Integer>();
        //create list
        List<String> listNew = new ArrayList<>();
        for (Integer i = 0; i < 101; i++) {
            list.add(i);
        }
        //exchange int for string
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 3 == 0) {
                listNew.add(i, "Fizz");
            } else if (list.get(i) % 5 == 0) {
                listNew.add(i, "Buzz");
            } else listNew.add(i, list
                    .get(i)
                    .toString());
        }

        listNew.forEach(System.out::println);
    }

    /**
     * FizzBuzz exercise: Write numbers from 1 to 100, if a number is divisible by 3 then print Fizz, if divisible by 5 is Buzz, if divisible by 3 and 5 then print FizzBuzz. Otherwise, print a number.
     * 2nd solution
     */
    public static void fizzBuzz() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Fizz");
            } else if (i % 3 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }

        }
    }

    /**
     * Exercise: Find 2 the smallest numbers from the list
     * Additional condition: ignore the repetitions
     */
    public static void find2TheSmallestNumbers() {
        //test data
        List<Integer> list = List.of(1, 2, 6, 8, 90);
        List<Integer> list2 = List.of(1, 1, 6, 8, 90);

        int l = list.size();
        int smallest = Integer.MAX_VALUE;

        //Traversing an array to find the smallest element
        for (Integer integer : list) {
            if (integer < smallest) {
                smallest = integer;
            }
        }

        System.out.println("Smallest element is: " + smallest);

        //Traversing an array to find second-smallest element
        int second_smallest = Integer.MAX_VALUE;
        for (Integer integer : list) {
            if (integer < second_smallest && integer > smallest) {
                second_smallest = integer;
            }
        }
        System.out.println("Second-smallest element is: " + second_smallest);
    }

    /**
     * Exercise: Find 2 elements in list whose sum is closest to zero
     */
    public static void findSumClosestTo0(List<Integer> list){
        /* Check if list have at least 2 elements */
        if(list.size() < 2){
            System.out.println("Invalid input. List should have at least 2 elements.");
            return;
        }

        /*Implementation*/
        int min_a = 0;
        int min_b = 1;
        int sum;
        int min_sum = list.get(0) + list.get(1);
        int a;
        int b;

        for (a = 0; a<list.size(); a++){
            for(b = a + 1; b<list.size(); b++){
                sum = list.get(a) + list.get(b);
                if(Math.abs(min_sum) > Math.abs(sum)){
                    min_sum  = sum;
                    min_a = a;
                    min_b = b;

                }
            }
        }
        System.out.println("The two elements whose sum is minimum are: " + list.get(min_a) + " and " + list.get(min_b));
    }
}
