package websiteGenerator.util;

public enum FontTransform {
    // TODO
    LOWERCASED("text-lowercase"),
    UPPERCASED("text-uppercase");
    private String fontTransform;

    FontTransform(String fontTransform) {
        this.fontTransform = fontTransform;
    }

    public String getFontTransform() {
        return fontTransform;
    }

    public void setFontTransform(String fontTransform) {
        this.fontTransform = fontTransform;
    }
}
