package websiteGenerator.HTMLTags.HeadTag;

import websiteGenerator.Util.SemanticElementContent;

public class Head implements SemanticElementContent {

    private String style;
    private String title;

    public Head(String style, String title) {
        this.style = style;
        this.title = title;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public StringBuilder getContentOfElement() {
        StringBuilder content = new StringBuilder();
        content.append("<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <title>"+ title +"</title>\n" +
                "</head>");

        return content;
    }
}
