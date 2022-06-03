package src.main.websiteGenerator.util;

/**
 * Enum for deciding htmllanguage on site
 *
 * @version 1.0.0
 */
public enum HTMLLanguageOptions {
    /**
     * Value for english language
     */
    EN("en"),
    /**
     * Value for norwegian language
     */
    NB("nb");

    private final String lang;

    HTMLLanguageOptions(String lang) {
        this.lang = lang;
    }

    /**
     * @return String og language
     */
    public String getLang() {
        return lang;
    }

}
