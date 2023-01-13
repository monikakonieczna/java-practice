package exercises.streams.animals;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Exercise 4: Eliminate duplicates in the list
 */
public class Exercise4 {

    public static void exercise4() {
        List<String> animals = createAnimalsList();

        List<String> result = animals.stream()
                                     .collect(Collectors.toSet())
                                     .stream()
                                     .toList();

        result.forEach(System.out::println);
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
