package src.main.websiteGenerator.htmlTags;

import src.main.websiteGenerator.util.HTMLLanguageOptions;

/**
 * Class for html tag
 *
 * @version 1.0.0
 */
public class Html {

    private String startTag;
    private String language;
    private final String endTag = "</html>";

    /**
     * Factory for creating a HTML tag
     *
     * @param value this value will edit the lang attribute in the html tag
     * @return HTML object
     */
    public static Html createHTMLTag(HTMLLanguageOptions value) {
        String lang = value.getLang();
        return new Html(lang);
    }

    private Html(String language) {
        this.startTag = "<html lang=" + "\"" + language + "\">";
    }

    /**
     * Setter for chosing to edit the lang attribute of the html tag
     *
     * @param language a enum value with a specific ISO code for language
     */
    public void setStartTag(HTMLLanguageOptions language) {
        this.startTag = "<html lang=" + "\"" + language.getLang() + "\">";
    }

    /**
     * Getter for startTag attribute
     *
     * @return the start tag of the html tag
     */
    public String getStartTag() {
        return this.startTag;
    }

    /**
     * Getter for language attribute
     *
     * @return language for tag
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * Getter for end
     *
     * @return end html tag
     */
    public String getEndTag() {
        return this.endTag;
    }

}
