package src.main.websiteGenerator.htmlTags.body;

/**
 * class for defining and building a header element for a Page {@link src.main.websiteGenerator.pages.Page}
 *
 * @version 1.0.0
 */
public class Header {
    private final StringBuilder header;
    private final String headerImageUrl;
    private final String headerHeading;
    private final String heroHeading;
    private final String heroImageUrl;

    /**
     * @return String
     * @getter for image url string
     */
    public String getHeaderImageUrl() {
        return headerImageUrl;
    }

    /**
     * @return String
     * @getter for header heading
     */
    public String getHeaderHeading() {
        return headerHeading;
    }

    /**
     * @return String
     * @getter for hero heading
     */
    public String getHeroHeading() {
        return heroHeading;
    }

    /**
     * @return String
     * @getter for heroImageUrl
     */
    public String getHeroImageUrl() {
        return heroImageUrl;
    }

    /**
     * private constructor for header class
     *
     * @param builder
     */
    private Header(Builder builder) {
        this.header = builder.header;
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
     * Creating the header
     *
     * @return header
     */
    public StringBuilder createHeader() {
        header.append("    </header>\n");
        return header;
    }

    /**
     * Builder class for building a header {@link Header}
     */
    public static class Builder {
        private final StringBuilder header = new StringBuilder("    <header>\n");
        private String headerImageUrl = "";
        private String headerHeading = "Heading";
        private String heroHeading = "Hero Heading";
        private String heroImageUrl = "";

        /**
         * Adds a string of header image url
         *
         * @param addHeaderImageUrl
         * @return image url
         */
        public Builder addHeaderImageUrl(String addHeaderImageUrl) {
            this.headerImageUrl = addHeaderImageUrl;
            header.append("        <img src=\"" + headerImageUrl + "\" alt=\"\">\n");
            return this;
        }

        /**
         * Adds header heading
         *
         * @param addHeaderHeading
         * @return header heading
         */
        public Builder addHeaderHeading(String addHeaderHeading) {
            this.headerHeading = addHeaderHeading;
            header.append("    <h1>" + headerHeading + "</h1>\n");
            return this;
        }

        /**
         * adds heroHeading
         *
         * @param addHeroHeading
         * @return hero heading text
         */

        public Builder addHeroHeading(String addHeroHeading) {
            this.heroHeading = addHeroHeading;
            return this;
        }

        /**
         * Adds hero image url
         *
         * @param addHeroImageUrl
         * @return image url
         */
        public Builder addHeroImageUrl(String addHeroImageUrl) {
            this.heroImageUrl = addHeroImageUrl;
            return this;
        }

        /**
         * Creates hero header
         *
         * @return Builder object
         */
        public Builder createHeroHeader() {
            header.append("        <div class=\"bg-image text-center mb-1\" style=\"background-image: url('" + heroImageUrl + "'); padding: 7rem;\">\n")
                    .append("          <h1 class=\"mb-3 h1\">" + heroHeading + "</h1>\n")
                    .append("        </div>\n");
            return this;
        }

        /**
         * Builds the object
         *
         * @return Header object
         */
        public Header build() {
            return new Header(this);
        }

    }

}
