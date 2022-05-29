package websiteGenerator.Util;

public enum FontFamily {
    TimesNewRoman("times"),
    ARIAL("arial");

    private String fontFamily;

    FontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
    }

    public String getFontFamily() {
        return fontFamily;
    }

    public void setFontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
    }
}
