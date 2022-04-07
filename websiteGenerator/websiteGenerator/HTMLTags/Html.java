package websiteGenerator.HTMLTags;

import websiteGenerator.Util.HTMLLanguageOptions;

public class Html {

    private String startTag; 

    private String language; 
    private final String endTag = "</html>";
   
    public static Html createHTMLTag(HTMLLanguageOptions value) { 

        String lang = value.lang; 
        return new Html(lang);

    }

    private Html(String language) {
        this.startTag = "<html lang=" + "\"" + language + "\">"; 
    }


    public void setStartTag(HTMLLanguageOptions language) {
        this.startTag = "<html lang=" + "\"" + language.lang + "\">";
    }


    public String getStartTag() {
        return this.startTag;
    }

    public String getLanguage() {
        return this.language;
    }

    public String getEndTag() {
        return this.endTag;
    }
    
}
