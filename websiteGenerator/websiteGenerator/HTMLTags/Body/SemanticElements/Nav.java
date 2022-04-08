package websiteGenerator.HTMLTags.Body.SemanticElements;

import websiteGenerator.Util.GetHTMLTagContent;

/**
 * A class for semantic nav tag
 *
 * @version 1.0.0
 */
public class Nav implements GetHTMLTagContent {

    private final String[] pageLinks;
    private final String logoImage;

    /**
     * Getter for page links attribute, this is the navbar menu
     *
     * @return a list of page lings
     */
    public String[] getAddPageLinks() {
        return pageLinks;
    }

    /**
     * Getter for image logo path
     *
     * @return path for image
     */
    public String getAddLogoImage() {
        return logoImage;
    }

    /**
     * private constructor for Nav class
     *
     * @param builder
     */
    private Nav(Builder builder) {
        this.pageLinks = builder.addPageLinks;
        this.logoImage = builder.addLogoImage;
    }


    /**
     * Factory for creating a nav object
     *
     * @return Builder
     */
    public static Builder createElementBuilder() {
        return new Builder();
    }

    /**
     * This will give you the entire nav tag structure for your page
     *
     * @return the final nav tag content
     */
    @Override
    public StringBuilder getContentOfElement() {
        StringBuilder content = new StringBuilder();
        StringBuilder links = new StringBuilder();
        for (String link : pageLinks) {
            links.append("            <li>\n")
                    .append("                <a href=\"")
                    .append(link)
                    .append(".html")
                    .append("\">")
                    .append(link)
                    .append("</a>\n")
                    .append("            </li>");
        }
        content.append("    <nav> \n")
                .append("        <ul>\n")
                .append(links)
                .append("\n")
                .append("        </ul>\n")
                .append("    </nav>");

        return content;
    }

    /**
     * Builder class for building a header {@link Nav}
     */
    public static class Builder {
        private String[] addPageLinks;
        private String addLogoImage;

        /**
         * Adds a list of page links for you navbar menu
         * @param addPageLink
         * @return list of pagelinks for menu
         */
        public Builder addPageLinks(final String[] addPageLink) {
            this.addPageLinks = addPageLink;
            return this;
        }

        /**
         * Adds image logo path for picture in you navbar
         *
         * @param addLogoImage
         * @return image path
         */
        public Builder addLogoImage(final String addLogoImage) {
            this.addLogoImage = addLogoImage;
            return this;
        }

        /**
         * Makes the complete Nav object
         *
         * @return Nav object
         */
        public Nav build() {
            return new Nav(this);
        }
    }

}
