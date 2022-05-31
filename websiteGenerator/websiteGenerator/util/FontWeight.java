package websiteGenerator.util;

public enum FontWeight {

    BOLD("fw-bold"),
    NORMAL("fw-normal"),
    LIGHT("fw-light");

    private String fontWeight;

    FontWeight(String fontWeight) {
        this.fontWeight = fontWeight;
    }

    public String getFontWeight() {
        return fontWeight;
    }

    public void setFontWeight(String fontWeight) {
        this.fontWeight = fontWeight;
    }
}
