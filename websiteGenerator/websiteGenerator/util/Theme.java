package websiteGenerator.util;

/**
 *  Enum for deciding thems for pages
 *
 *  @version 1.0.0
 */
public enum Theme {
    /**
     * enum values for dark and light theme.
     */
    DARK("dark"),
    LIGHT("light");

    private String themeColor;

    private String fontColor;

    Theme(String themeColor) {
        this.themeColor = themeColor;
        this.fontColor =  themeColor.equals("dark") ? "white" : "black";
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
