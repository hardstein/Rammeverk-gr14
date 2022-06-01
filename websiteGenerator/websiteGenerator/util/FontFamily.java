package websiteGenerator.util;

/**
 * Enum class for font family.
 */
public enum FontFamily {
    /**
     * Font family for Times New Roman.
     */
    TimesNewRoman("times"),
    /**
     * Font family for Arial.
     */
    ARIAL("arial");

    private String fontFamily;

    /**
     * Constructor for font family.
     */
    FontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
    }

    /**
     * Getter for font family.
     */
    public String getFontFamily() {
        return fontFamily;
    }

    /**
     * Setter for font family.
     */
    public void setFontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
    }
}
