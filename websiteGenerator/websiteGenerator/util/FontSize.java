package websiteGenerator.util;

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

    public String getFontSize() {
        return fontSize;
    }

    public void setFontSize(String fontSize) {
        this.fontSize = fontSize;
    }
}
