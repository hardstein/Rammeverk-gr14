package websiteGenerator.SemanticElements;

import websiteGenerator.Util.SemanticElementContent;

public class Header implements SemanticElementContent {

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

    private Header(Builder builder) {
        this.headerImageUrl = builder.headerImageUrl;
        this.headerHeading = builder.headerHeading;
        this.heroHeading = builder.heroHeading;
        this.heroImageUrl = builder.heroImageUrl;
    }

    public static Builder createElementBuilder() {
        return new Builder();
    }

//    @Override
//    public String content() {
//        String defaultHeaderImage = "https://natureconservancy-h.assetsadobe.com/is/image/content/dam/tnc/nature/en/photos/Zugpsitze_mountain.jpg";
//        if (headerImageUrl != null) {
//            defaultHeaderImage = headerImageUrl;
//        }
//
//        String s =
//                "    <header>\n" +
//                        "        <h1>" + headerHeading +"</h1>\n" +
//                        "        <img src=\"" + defaultHeaderImage + "\" alt=\"\">\n" +
//                        "    </header>";
//        return s;
//    }

    @Override
    public StringBuilder getContentOfElement() {
        StringBuilder content = new StringBuilder();
        content.append("    <header>\n" + "        <h1>")
                .append(headerHeading)
                .append("</h1>\n")
                .append("        <img src=\"")
                .append(headerImageUrl)
                .append("\" alt=\"\">\n")
                .append("    </header>");
        return content;
    }

    public static class Builder {
        private String headerImageUrl;
        private String headerHeading;
        private String heroHeading;
        private String heroImageUrl;

        private Builder() {

        }

        public Builder addHeaderImageUrl(final String addHeaderImageUrl) {
            this.headerImageUrl = addHeaderImageUrl;
            return this;
        }

        public Builder addHeaderHeading(final String addHeaderHeading) {
            this.headerHeading = addHeaderHeading;
            return this;
        }

        public Builder addHeroHeading(final String addHeroHeading) {
            this.heroHeading = addHeroHeading;
            return this;
        }

        public Builder addHeroImageUrl(final String addHeroImageUrl) {
            this.heroImageUrl = addHeroImageUrl;
            return this;
        }

        public Header build() {

            return new Header(this);
        }

    }

}