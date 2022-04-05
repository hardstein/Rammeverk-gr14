package websiteGenerator.SemanticElements;

import websiteGenerator.Util.SemanticElementContent;

public class Nav implements SemanticElementContent {

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

    @Override
    public String content() {
        String links = "";
        for (String link : pageLinks) {
            links += "            <li>\n" +
                    "                <a href=\"" + link + ".html" + "\">" + link + "</a>\n" +
                    "            </li>\n";
        }
        String s = "" +
                "    <nav>\n" +
                "        <ul>\n" +
                " " + links + "\n" +
                "        </ul>\n" +
                "    </nav>";
        return s;
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
