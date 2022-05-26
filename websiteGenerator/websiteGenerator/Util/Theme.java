package websiteGenerator.Util;

public enum Theme {
    DARK("dark"),
    LIGHT("light");

    public String themeColor;

    public String fontColor;

    Theme(String themeColor) {
        this.themeColor = themeColor;
        this.fontColor =  themeColor.equals("dark") ? "white" : "black";
    }

//    DARK,
//    LIGHT,
//    FORREST,
//    WATER,
//    RETARDTHEME
}
