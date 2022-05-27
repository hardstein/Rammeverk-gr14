package websiteGenerator.Util;

public enum Theme {
    DARK("dark"),
    LIGHT("light");

    private String themeColor;

    private String fontColor;

    Theme(String themeColor) {
        this.themeColor = themeColor;
        this.fontColor =  themeColor.equals("dark") ? "white" : "black";
    }

    public String getThemeColor() {
        return themeColor;
    }

    public void setThemeColor(String themeColor) {
        this.themeColor = themeColor;
    }

    public String getFontColor() {
        return fontColor;
    }

    public void setFontColor(String fontColor) {
        this.fontColor = fontColor;
    }

    //    DARK,
//    LIGHT,
//    FORREST,
//    WATER,
//    RETARDTHEME
}
