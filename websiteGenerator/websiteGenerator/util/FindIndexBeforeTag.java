package websiteGenerator.util;

/**
 * Class for finding index of value before tag
 *
 * @version 1.0.0
 */
public abstract class FindIndexBeforeTag {
    /**
     * This method will find the index before a specified word in a StringBuilder.
     *
     * @param sb   The StringBuilder to find an index.
     * @param word The string to find the index in front of.
     * @return int with the index before the word inside the StringBuilder.
     */
    public static int findIndexBeforeTag(StringBuilder sb, String word) {
        return sb.indexOf(word);
    }
}
