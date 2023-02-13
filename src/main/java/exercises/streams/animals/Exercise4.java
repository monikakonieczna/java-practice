package exercises.streams.animals;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Exercise 4: Eliminate duplicates in the list
 */
public class Exercise4 {

    /**
     * Exercise 4: Eliminate duplicates in the list
     */
    public static void exercise4() {
        List<Integer> elements = createList();
        Set<Integer> items = new HashSet<>();

        Set<Integer> result = elements.stream()
                                      .filter(n -> !items.add(n))
                                      .collect(Collectors.toSet());

        result.forEach(System.out::println);
    }

    /**
     * Exercise 4a: Eliminate duplicates in the list
     */
    public static void exercise4a() {
        List<Integer> integerList = createList();
        Set<Integer> items = new HashSet<>();

        Set<Integer> result = integerList.stream()
                                      .filter(n -> !items.add(n))
                                      .collect(Collectors.toSet());

        result.forEach(System.out::println);
    }

    /**
     * Find and print element which have duplicates by using Collectors.groupingBy()
     */
    public static void exercise4b() {
        List<Integer> list = createList();

        Set<Integer> result = list.stream()
                                      //group list along with their frequency in a map
                                      .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                                      //convert map into stream
                                      .entrySet()
                                      .stream()
                                      //find list which have duplicates
                                      .filter(m -> m.getValue() > 1)
                                      .map(Map.Entry::getKey)
                                      //collect them for further processing
                                      .collect(Collectors.toSet());

        result.forEach(System.out::println);
    }

    /**
     * Find and print element which have duplicates by using Collections.frequency()
     */
    public static void exercise4c() {
        List<Integer> list = createList();

        Set<Integer> result = list.stream()
                                  //count the frequency of each element and filter elements wth f > 1
                                  .filter(e -> Collections.frequency(list, e) > 1)
                                  .collect(Collectors.toSet());

        result.forEach(System.out::println);
    }

    /**
     * Helper method which creates list of Integers with duplicate elements
     *
     * @return List<Integer> numbers
     */
    private static List<Integer> createList() {
        return Arrays.asList(1, 2, 3, 4, 5, 6, 7, 6, 6, 6, 6, 6, 5, 6, 7, 10);
    }
}
