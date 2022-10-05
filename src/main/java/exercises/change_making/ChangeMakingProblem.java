package exercises.change_making;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ChangeMakingProblem {

    public static void main(String[] args) {
        giveTheRest();
    }

    /**
     * The change-making problem addresses the question of finding the minimum number of coins that add up to a given amount of money.
     * It is a special case of the integer knapsack problem.
     */
    private static void giveTheRest() {
        final List<Double> denominations = List.of(200.0, 100.0, 50.0, 20.0, 10.0, 5.0, 2.0, 1.0, 0.5, 0.2, 0.1, 0.05, 0.02, 0.01);
        Double rest = 0.0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Give the rest: ");

        try {
            rest = sc.nextDouble();
        } catch (InputMismatchException exc) {
            System.out.println("Wrong value.");
            return;
        }

        StringBuilder result = new StringBuilder("The rest:\n");

        for (int i = 0; ((i < denominations.size()) && (rest > 0.00)); i++) {
            if (rest >= denominations.get(i)) {
                int temp = (int) Math.floor(rest / denominations.get(i));
                result
                        .append(denominations.get(i))
                        .append("PLN x")
                        .append(temp)
                        .append("\n");
                rest = (double) Math.round(100 * (rest - (temp * denominations.get(i)))) / 100;
            }
        }
        System.out.println(result);
    }
}
