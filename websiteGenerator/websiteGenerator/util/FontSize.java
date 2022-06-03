package websiteGenerator.util;

/**
 * Enum for changing on fontsize text
 *
 * @version 1.0.0
 */

public enum FontSize {
    /**
     * Value for fontszie 1
     */
    FONTSIZE1("fs-1"),
    /**
     * Value for fontszie 2
     */
    FONTSIZE2("fs-2"),
    /**
     * Value for fontszie 3
     */
    FONTSIZE3("fs-3"),
    /**
     * Value for fontszie 4
     */
    FONTSIZE4("fs-4"),
    /**
     * Value for fontszie 5
     */
    FONTSIZE5("fs-5"),
    /**
     * Value for fontszie 6
     */
    FONTSIZE6("fs-6");

    private final String fontSize;

    FontSize(String fontSize) {
        this.fontSize = fontSize;
    }

    /**
     * @return A string of the fontsize type
     */
    public String getFontSize() {
        return fontSize;
    }

}
