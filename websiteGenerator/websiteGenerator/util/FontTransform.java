package websiteGenerator.util;

/**
 * Enum for tranforming text from upper to lowercase
 *
 * @version 1.0.0
 */
public enum FontTransform {
    // TODO
    LOWERCASED("text-lowercase"),
    UPPERCASED("text-uppercase");
    private String fontTransform;

    FontTransform(String fontTransform) {
        this.fontTransform = fontTransform;
    }

    /**
     *
     * @return returns (skriv her)
     */
    public String getFontTransform() {
        return fontTransform;
    }

}
