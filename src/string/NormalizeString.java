package string;

import java.util.Locale;
import java.util.regex.Pattern;

public class NormalizeString {
    // Precompiled pattern that matches one or more non-letter and non-digit characters
    private static final Pattern NON_ALPHANUM = Pattern.compile("[^\\p{L}\\p{N}]+");

    /**
     * Convert uppercase letters to lowercase and remove all non-alphanumeric characters.
     * Unicode-aware: letters from any language and digits are preserved.
     * Returns empty string for null input.
     */
    public static String normalize(String s) {
        if (s == null) return "";
        String lower = s.toLowerCase(Locale.ROOT);
        return NON_ALPHANUM.matcher(lower).replaceAll("");
    }

    public static void main(String[] args) {
        String[] tests = {
                "Hello Data Structures",
                "AbC123! @#",
                "Åß中文_ space",
                "",
                null
        };

        for (String t : tests) {
            System.out.printf("input: %s -> output: %s%n", t, normalize(t));
        }
    }
}
