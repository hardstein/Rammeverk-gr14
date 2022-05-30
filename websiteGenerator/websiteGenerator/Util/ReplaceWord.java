package websiteGenerator.Util;

import java.util.regex.Pattern;

public class ReplaceWord {
    // Borrowed: https://www.javacodeexamples.com/java-stringbuilder-replace-replace-all-example-stringbuffer/1546
    public static StringBuilder replaceAllWords(StringBuilder sb, String find, String replace){
        return new StringBuilder(Pattern.compile(find).matcher(sb).replaceAll(replace));
    }
}
