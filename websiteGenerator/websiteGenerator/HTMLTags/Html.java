package websiteGenerator.HTMLTags;

import websiteGenerator.Util.HTMLLanguageOptions;

public class Html {

    private String startTag; 
    private String language; 
    private final String endTag = "</html>";
   
    public Html createHTMLTag(HTMLLanguageOptions value) { 

        String lang = value.lang; 
        return new Html(lang);

    }

    private Html(String language) {
        this.startTag = "<html lang=" + "\"" + language + "\">"; 
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
