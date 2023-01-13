package exercises.streams.animals;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Exercise 3: Sort animals list in reverse/natural order
 */
public class Exercise3 {
    /**
     * Sort animals list in the natural order
     */
    public static void exercise3a() {
        List<String> animals = createAnimalsList();

        List<String> result = animals.stream()
                                     .sorted()
                                     .toList();

        System.out.println(result);
    }

    /**
     * Sort animals list in Reverse order
     */
    public static void exercise3b() {
        List<String> animals = createAnimalsList();

        List<String> result2 = animals.stream()
                                      .sorted(Comparator.reverseOrder())
                                      .toList();

        System.out.println(result2);
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
