package websiteGenerator.htmlTags.head;

import websiteGenerator.util.GetHTMLTagContent;
import websiteGenerator.util.Theme;

/**
 * Class for body tag
 *
 * @version 1.0.0
 */
public class Head {
    /**
     * The default value for title in head tag.
     */
    protected final static String DEFAULT_TITLE = "WebsiteBuilder Page";
    /**
     * The default value for style in head tag.
     */
    protected final static String DEFAULT_STYLES = "styles.css";


    private StringBuilder head;
    private String style;
    private String title;

    public StringBuilder getHead() {
        return head;
    }

    public String getStyle() {
        return style;
    }

    public String getTitle() {
        return title;
    }

    private Head(Builder builder) {
        this.head = builder.head;
        this.style = builder.style;
        this.title = builder.title;
    }

    public static Builder createHeadBuilder() {
        return new Builder();
    }

    public StringBuilder createHead() {
        head.append("<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <link rel=\"stylesheet\" href=\""+style+"\">\n" +
                "    <title>"+ title +"</title>\n" +
                "    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor\" crossorigin=\"anonymous\">\n" +
                "</head>\n");
        return head;
    }

    public static class Builder {
        private StringBuilder head = new StringBuilder();
        private String style = DEFAULT_STYLES;
        private String title = DEFAULT_TITLE;

        public Builder addStyle(String style) {
            this.style = style;
            return this;
        }

        public Builder addTitle(String title) {
            this.title = title;
            return this;
        }

        public Head build() {
            return new Head(this);
        }
    }

}
