package src.main.websiteGenerator.util;

/**
 * Enum for deciding thems for pages
 *
 * @version 1.0.0
 */
public enum Theme {
    /**
     * enum values for dark
     */
    DARK("dark"),
    /**
     * enum value for light
     */
    LIGHT("light");

    private final String themeColor;

    private final String fontColor;

    Theme(String themeColor) {
        this.themeColor = themeColor;
        this.fontColor = themeColor.equals("dark") ? "white" : "black";
    }

    /**
     * @return String for theme color
     */

    public String getThemeColor() {
        return themeColor;
    }

    /**
     * @return String for font color
     */

    public String getFontColor() {
        return fontColor;
    }


}
