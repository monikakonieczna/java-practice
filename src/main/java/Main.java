import exercises.ListExercises;
import exercises.streams.employees.Search;

public class Main {
    public static void main(String[] args) {
        ListExercises.find2TheSmallestNumbers();
        ListExercises.findFirstElementStartingWithLetter("A");


        //Java Stream API
        Search search = new Search();
        search.printEmployeesGroupedByTitle();


    }
}

