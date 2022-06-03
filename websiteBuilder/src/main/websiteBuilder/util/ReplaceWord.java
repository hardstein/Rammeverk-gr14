package src.main.websiteBuilder.util;

import java.util.regex.Pattern;

/**
 * This is an abstract class for replacing words
 *
 * @version 1.0.0
 */
public abstract class ReplaceWord {
    // Borrowed: https://www.javacodeexamples.com/java-stringbuilder-replace-replace-all-example-stringbuffer/1546

    /**
     * This is a method which can be used to find a word. All occurrences of the word gets replaced with the new specified.
     *
     * @param sb      The StringBuilder to make changes to.
     * @param find    The String to find which get replaced.
     * @param replace The new String to replace the old with.
     * @return A new version of the object with words replaced.
     */
    public static StringBuilder replaceAllWords(StringBuilder sb, String find, String replace) {
        return new StringBuilder(Pattern.compile(find).matcher(sb).replaceAll(replace));
    }
}
