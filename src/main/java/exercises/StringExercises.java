package exercises;

public class StringExercises {

    /**
     * Example:
     * String a = "abc"
     * String b = "dgw"
     * Write a solution that returns "adbgcw".
     * Strings can have different length
     *
     * @param a String a
     * @param b String b
     */
    public static void interweaveChars(String a, String b) {
        StringBuilder sb = new StringBuilder();
        if (a.length() == b.length()) {
            for (int i = 0; i < a.length(); i++) {
                sb
                        .append(a.charAt(i))
                        .append(b.charAt(i));
            }
        } else {
            if (a.length() > b.length()) {
                for (int i = 0; i < b.length(); i++) {
                    sb
                            .append(a.charAt(i))
                            .append(b.charAt(i));
                }
                sb.append(a.substring(b.length()));
            } else if (b.length() > a.length()) {
                for (int i = 0; i < a.length(); i++) {
                    sb
                            .append(a.charAt(i))
                            .append(b.charAt(i));

                }
                sb.append(b.substring(a.length()));
            }
        }
        System.out.println(sb);
    }

    /**
     * Exercise: Check if text is a Palindrome
     * @param text String to be checked
     */
    public static boolean isItAPalindrome(String text) {
        return new StringBuilder(text)
                .reverse()
                .toString()
                .equals(text);
    }

    /**
     * Exercise: Reverse the String
     * @param text String to be reversed
     */
    public static void reverseString(String text) {
        char ch;
        String n = "";

        for (int i = 0; i < text.length(); i++) {
            ch = text.charAt(i);
            n = ch + n;
        }
        System.out.println("Original word:" + text);
        System.out.println("Reversed word:" + n);
    }

}
