package websiteGenerator.HTMLTags.Body.SemanticElements;

import websiteGenerator.Util.GetHTMLTagContent;
import websiteGenerator.Util.Theme;

/**
 * class for defining and building an aside element for a Page {@link websiteGenerator.Pages.Page}
 *
 * @version 1.0.0
 */
public class Aside implements GetHTMLTagContent {
    private final String asideTitle;
    private final String asideText;

    /**
     * Getter for title in aside
     *
     * @return String
     */
    public String getAsideTitle() {
        return asideTitle;
    }

    /**
     * Getter for getting aside text
     *
     * @return String with the aside text
     */
    public String getAsideText() {
        return asideText;
    }

    /**
     * A constructor for adding properties from inner builder class to the Aside class properties
     *
     * @param builder the builder for aside
     */
    private Aside(Builder builder) {
        this.asideTitle = builder.asideTitle;
        this.asideText = builder.asideText;

    }

    /**
     * Starts the building process with returning a new builder object
     *
     * @return Builder object
     */
    public static Builder createElementBuilder() {
        return new Builder();
    }

    /**
     * Builds the complete aside tag information
     *
     * @return StringBuilder with the complete build for aside tag
     */
    @Override
    public StringBuilder getContentOfElement() {
        StringBuilder content = new StringBuilder();
        content.append("    <aside>\n" + "        <h2>")
                .append(asideTitle)
                .append("</h2>\n")
                .append("        <p>")
                .append(asideText)
                .append("</p>\n")
                .append("    </aside>");
        return content;
    }

    @Override
    public StringBuilder getContentOfElement(Theme theme) {
        return null;
    }

    /**
     * A builder for {@link Aside}
     */
    public static class Builder {
        private String asideTitle;
        private String asideText;

        /**
         * Adds the aside title
         *
         * @param asideTitle
         * @return the aside title
         */
        public Builder addAsideTitle(final String asideTitle) {
            this.asideTitle = asideTitle;
            return this;
        }

        /**
         * Adds the aside text
         *
         * @param asideText the text for the aside element
         * @return Builder with new aside text
         */
        public Builder addAsideText(final String asideText) {
            this.asideText = asideText;
            return this;
        }

        /**
         *
         * @return a new Aside object
         */
        public Aside build() {
            return new Aside(this);
        }
    }

}
