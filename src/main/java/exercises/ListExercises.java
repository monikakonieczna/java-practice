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
     */
    public static void find2TheSmallestNumbers(){

    }
}
