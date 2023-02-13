package exercises.live_coding;

import java.util.StringTokenizer;

/**
 * Write Java code to get rid of multiple spaces from a string?
 */
public class Task15 {

    public static void removeExtraSpaces(String input){
        StringTokenizer substring = new StringTokenizer(input, " ");
        System.out.println(substring.countTokens());
        StringBuilder sb = new StringBuilder();

        while (substring.hasMoreElements()) {
            sb.append(substring.nextElement())
              .append(" ");
        }

        System.out.println("Actual string: " + input);
        System.out.println("Processed string: " + sb.toString().trim());
    }
    public static void main(String[] args) {
        String input = "Try    to remove   extra spaces.";
        removeExtraSpaces(input);
    }
}
