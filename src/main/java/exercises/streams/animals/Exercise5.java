package exercises.streams.animals;

/**
 * Exercise 5: Count occurrence of a given character in a string using Stream API in Java
 */
public class Exercise5 {

    public static void exercise5(String s, char ch) {

        long result = s.chars()
                       .filter(c -> c == ch)
                       .count();

        System.out.println("Given string " + s + " has " + result + " of given character: " + ch + " .");
    }

}
