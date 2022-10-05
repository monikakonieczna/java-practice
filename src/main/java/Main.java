import exercises.ListExercises;
import exercises.StringExercises;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ListExercises.find2TheSmallestNumbers();
        ListExercises.findSumClosestTo0(createList());
    }

    private static List createList(){
        return List.of(1, 60, -10, 70, -80, 85);
    }
}

