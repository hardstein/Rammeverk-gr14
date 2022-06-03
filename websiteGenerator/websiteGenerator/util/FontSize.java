package websiteGenerator.util;

/**
 * Enum for changing on fontsize text
 *
 * @version 1.0.0
 */

public enum FontSize {
    FONTSIZE1("fs-1"),
    FONTSIZE2("fs-2"),
    FONTSIZE3("fs-3"),
    FONTSIZE4("fs-4"),
    FONTSIZE5("fs-5"),
    FONTSIZE6("fs-6");
    private String fontSize;

    FontSize(String fontSize) {
        this.fontSize = fontSize;
    }

    /**
     * @getter
     * @return A string of the fontsize type
     */
    public String getFontSize() {
        return fontSize;
    }

}
