package exercises.streams.animals;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/**
 * Exercise 2: Find first/last element in the List
 */
public class Exercise2 {

    /**
     * Find first element in the stream with the usage of Stream.reduce().
     */
    public static void exercise2() {
        List<String> animals = createAnimalsList();

        String animal = animals.stream()
                               .reduce((first, second) -> first)
                               .orElse(null);
        System.out.println("Result with the usage of Stream.reduce(): " + animal);
    }

    /**
     * Find first element in the stream with the usage of Stream.findFirst()
     */
    public static void exercise2a() {
        List<String> animals = createAnimalsList();

        Optional<String> animal_2 = animals.stream()
                                           .findFirst();

        System.out.println("Result with the usage of Stream.findFirst(): " + animal_2);
    }

    /**
     * Find the last element of a stream with the usage of Stream.skip()
     */
    public static void exercise2b() {
        List<String> animals = createAnimalsList();

        Optional<String> last2 = animals.stream()
                                        .skip(animals.size() - 1)
                                        .findFirst();
        System.out.println(last2);
    }

    /**
     * Find the last element of a stream with the usage of Stream.reduce()
     */
    public static void exercise2c() {
        List<String> animals = createAnimalsList();

        Optional<String> last_animal = animals.stream()
                                              .sorted()
                                              .reduce((first, second) -> second);

        System.out.println(last_animal);
    }

    /**
     * Helper method which creates list of animals with the usage of Java Faker library.
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
