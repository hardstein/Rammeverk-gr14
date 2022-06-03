package websiteGenerator.util;

/**
 * Enum for setting font weight
 *
 * @version 1.0.0
 */

public enum FontWeight {

    /**
     * Value for bold text
     */
    BOLD("fw-bold"),
    /**
     * Value for normal text
     */
    NORMAL("fw-normal"),
    /**
     * Value for light text
     */
    LIGHT("fw-light");

    private final String fontWeight;

    FontWeight(String fontWeight) {
        this.fontWeight = fontWeight;
    }

    /**
     * @return String fontweight
     */
    public String getFontWeight() {
        return fontWeight;
    }

}
