package src.main.websiteBuilder.util;

/**
 * Enum class for font family.
 *
 * @version 1.0.0
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

    private final String fontFamily;

    /**
     * @Constructor for font family.
     */
    FontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
    }

    /**
     * @Getter for font family.
     */
    public String getFontFamily() {
        return fontFamily;
    }

}
