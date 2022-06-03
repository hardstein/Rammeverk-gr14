package websiteGenerator.htmlTags.head;

//import websiteGenerator.util.GetHTMLTagContent;

import websiteGenerator.util.Theme;

/**
 * Class for body tag
 *
 * @version 1.0.0
 */
public class Head {

    protected final static String DEFAULT_TITLE = "WebsiteBuilder Page";
    protected final static String DEFAULT_STYLES = "styles.css";

    int i = 0;

    private final StringBuilder head;
    private final String style;
    private final String title;

    /**
     * @return StringBuilder with head
     */
    public StringBuilder getHead() {
        return head;
    }

    /**
     * @return String with style
     */
    public String getStyle() {
        return style;
    }

    /**
     * @return String with title
     */
    public String getTitle() {
        return title;
    }

    private Head(Builder builder) {
        this.head = builder.head;
        this.style = builder.style;
        this.title = builder.title;
    }

    /**
     * creates a builder
     *
     * @return Builder object
     */
    public static Builder createHeadBuilder() {
        return new Builder();
    }

    /**
     * Making the complete head string
     *
     * @return StringBuilder
     */
    public StringBuilder createHead() {
        if (i < 1) {
            head.setLength(0);
            head.append("<head>\n" +
                    "    <meta charset=\"UTF-8\">\n" +
                    "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
                    "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                    "    <link rel=\"stylesheet\" href=\"" + style + "\">\n" +
                    "    <title>" + title + "</title>\n" +
                    "    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor\" crossorigin=\"anonymous\">\n" +
                    "</head>\n");
            i = head.length();
        }
        return head;
    }

    /**
     * Builder for Head tag
     */
    public static class Builder {
        private final StringBuilder head = new StringBuilder();
        private String style = DEFAULT_STYLES;
        private String title = DEFAULT_TITLE;

        /**
         * @param style
         * @return Builder object
         */
        public Builder addStyle(String style) {
            this.style = style;
            return this;
        }

        /**
         * @param title
         * @return Builder object
         */
        public Builder addTitle(String title) {
            this.title = title;
            return this;
        }

        /**
         * @return Head object
         */
        public Head build() {
            return new Head(this);
        }
    }

}
