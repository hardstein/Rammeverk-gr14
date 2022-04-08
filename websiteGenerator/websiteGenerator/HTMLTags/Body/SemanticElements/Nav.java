package websiteGenerator.HTMLTags.Body.SemanticElements;

import websiteGenerator.Util.GetHTMLTagContent;

public class Nav implements GetHTMLTagContent {

    private final String[] pageLinks;
    private final String logoImage;

    public String[] getAddPageLinks() {
        return pageLinks;
    }

    public String getAddLogoImage() {
        return logoImage;
    }

    private Nav(Builder builder) {
        this.pageLinks = builder.addPageLinks;
        this.logoImage = builder.addLogoImage;
    }

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

    public static class Builder {
        private String[] addPageLinks;
        private String addLogoImage;

        public Builder addPageLinks(final String[] addPageLink) {
            this.addPageLinks = addPageLink;
            return this;
        }

        public Builder addLogoImage(final String addLogoImage) {
            this.addLogoImage = addLogoImage;
            return this;
        }

        public Nav build() {
            return new Nav(this);
        }
    }

}
