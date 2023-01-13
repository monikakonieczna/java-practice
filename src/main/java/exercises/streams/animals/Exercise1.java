package exercises.streams.animals;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

/**
 * Exercise 1: Find 1 animal on the lists which starts with given letter/word
 */
public class Exercise1 {


    /**
     * Find 1 animal on the lists which starts with given letter/word
     *
     * @param start
     */
    public static void exercise1(String start) {
        List<String> animals = createAnimalsList();

        List<String> result2 = animals.stream()
                                      .filter(animal -> animal.startsWith(start))
                                      .limit(1)
                                      .toList();

        result2.forEach(System.out::println);
    }

    /**
     * Find first element in the List which starts with given letter/word . Don't use findFirst().
     */
    public static void exercise1a(String start) {
        List<String> animals = createAnimalsList();

        Optional<String> result = animals.stream()
                                         .filter(animal -> animal.startsWith(start))
                                         .collect(singleElementCollector());

        System.out.println(result);
    }

    private static <T> Collector<T, ?, Optional<T>> singleElementCollector() {
        return Collectors.collectingAndThen(
                toList(),
                list -> list.size() >= 1 ? Optional.of(list.get(0)) : Optional.empty()
        );
    }

    /**
     * Helper method which creates list of animals with the usage of Java Faker library
     *
     * @return List<String> animals
     */
    private static List<String> createAnimalsList() {
        Faker faker = new Faker();
        List<String> animals = new ArrayList<>();
        for (int i = 1; i < 20; i++) {
            animals.add(faker.animal()
                             .name());
        }
        System.out.println(animals);
        return animals;
    }

}
