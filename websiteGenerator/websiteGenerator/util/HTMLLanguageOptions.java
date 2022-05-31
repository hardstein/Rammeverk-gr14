package websiteGenerator.util;

public enum HTMLLanguageOptions {
    EN("en"), 
    NB("nb");  

    private String lang;

    HTMLLanguageOptions(String lang) {
        this.lang = lang;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }
}
