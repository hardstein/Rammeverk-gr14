package websiteGenerator.HTMLTags.HeadTag;

import websiteGenerator.Util.GetHTMLTagContent;

/**
 * Class for body tag
 *
 * @version 1.0.0
 */
public class Head implements GetHTMLTagContent {

    private String style;
    private String title;

    /**
     * Factory for creating Head tag
     *
     * @param style style sheet
     * @param title tile for the page
     * @return
     */
    public static Head createHead(String style, String title) {

        return new Head(style, title); 
        
    }

    /**
     * Private constructor for Head class
     *
     * @param style style sheet for page
     * @param title title for page
     */
    private Head(String style, String title) {
        this.style = style;
        this.title = title;
    }

    /**
     * Getter for style sheet
     *
     * @return style sheet name
     */
    public String getStyle() {
        return style;
    }

    /**
     * Setter for stylesheet
     *
     * @param style A string value for stylesheet name
     */
    public void setStyle(String style) {
        this.style = style;
    }

    /**
     * Getter for title
     *
     * @return title for page
     */
    public String getTitle() {
        return title;
    }

    /**
     * Setter for title
     *
     * @param title A string value for title for page
     */

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * This will give you the entire head tag structure for your page
     *
     * @return the final head tag content
     */
    @Override
    public StringBuilder getContentOfElement() {
        StringBuilder content = new StringBuilder();
        content.append("<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <link rel=\"stylesheet\" href=\""+style+"\">\n" +
                "    <title>"+ title +"</title>\n" +
                "    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor\" crossorigin=\"anonymous\">\n" +
                "</head>");

        return content;
    }
}
