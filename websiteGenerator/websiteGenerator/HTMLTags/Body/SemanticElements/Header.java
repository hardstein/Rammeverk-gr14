package websiteGenerator.HTMLTags.Body.SemanticElements;

import websiteGenerator.Util.GetHTMLTagContent;

/**
 * A class for semantic header tag
 *
 * @version 1.0.0
 */
public class Header implements GetHTMLTagContent {

    private final String headerImageUrl;
    private final String headerHeading;
    private final String heroHeading;
    private final String heroImageUrl;


    public String getHeaderImageUrl() {
        return headerImageUrl;
    }

    public String getHeaderHeading() {
        return headerHeading;
    }

    public String getHeroHeading() {
        return heroHeading;
    }

    public String getHeroImageUrl() {
        return heroImageUrl;
    }

    /**
     * private constructor for header class
     *
     * @param builder
     */
    private Header(Builder builder) {
        this.headerImageUrl = builder.headerImageUrl;
        this.headerHeading = builder.headerHeading;
        this.heroHeading = builder.heroHeading;
        this.heroImageUrl = builder.heroImageUrl;
    }

    /**
     * Facotry for building a header
     *
     * @return builder object
     */
    public static Builder createElementBuilder() {
        return new Builder();
    }

    /**
     * This will give you the entire header tag structure for your page
     *
     * @return the final header tag content
     */
    @Override
    public StringBuilder getContentOfElement() {
        StringBuilder content = new StringBuilder();
        content.append("    <header>\n")
                .append("    <h1>")
                .append(headerHeading)
                .append("</h1>\n")
                .append("        <img src=\"")
                .append(headerImageUrl)
                .append("\" alt=\"\">\n")
                .append("    </header>");
        return content;
    }

    /**
     * Builder class for building a header {@link Header}
     */
    public static class Builder {
        private String headerImageUrl;
        private String headerHeading;
        private String heroHeading;
        private String heroImageUrl;


        /**
         * Adds a string of header image url
         *
         * @param addHeaderImageUrl
         * @return image url
         */

        public Builder addHeaderImageUrl(final String addHeaderImageUrl) {
            this.headerImageUrl = addHeaderImageUrl;
            return this;
        }

        /**
         * Adds header heading
         *
         * @param addHeaderHeading
         * @return header heading
         */

        public Builder addHeaderHeading(final String addHeaderHeading) {
            this.headerHeading = addHeaderHeading;
            return this;
        }

        /**
         * adds heroHeading
         *
         * @param addHeroHeading
         * @return hero heading text
         */

        public Builder addHeroHeading(final String addHeroHeading) {
            this.heroHeading = addHeroHeading;
            return this;
        }

        /**
         * Adds hero image url
         *
         *
         * @param addHeroImageUrl
         * @return image url
         */
        public Builder addHeroImageUrl(final String addHeroImageUrl) {
            this.heroImageUrl = addHeroImageUrl;
            return this;
        }

        /**
         * Builds the object
         *
         *
         * @return Header object
         */
        public Header build() {
            return new Header(this);
        }

    }

}
