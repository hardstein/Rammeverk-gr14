package websiteGenerator.SemanticElements;

public class Header {

    private final String headerImageUrl;
    private final String headerHeading;
    private final String heroHeading;
    private final String heroImageUrl;

    public String getAddHeaderImageUrl() {
        return headerImageUrl;
    }

    public String getAddHeaderHeading() {
        return headerHeading;
    }

    public String getAddHeroHeading() {
        return heroHeading;
    }

    public String getAddHeroImageUrl() {
        return heroImageUrl;
    }

    private Header(Builder builder) {
        this.headerImageUrl = builder.addHeaderImageUrl;
        this.headerHeading = builder.addHeaderHeading;
        this.heroHeading = builder.addHeroHeading;
        this.heroImageUrl = builder.addHeroImageUrl;
    }

    public static Builder createElementBuilder() {
        return new Builder();
    }

    public static class Builder {
        private String addHeaderImageUrl;
        private String addHeaderHeading;
        private String addHeroHeading;
        private String addHeroImageUrl;

        private Builder() {

        }

        public Builder addHeaderImageUrl(final String addHeaderImageUrl) {
            this.addHeaderImageUrl = addHeaderImageUrl;
            return this;
        }

        public Builder addHeaderHeading(final String addHeaderHeading) {
            this.addHeaderHeading = addHeaderHeading;
            return this;
        }

        public Builder addHeroHeading(final String addHeroHeading) {
            this.addHeroHeading = addHeroHeading;
            return this;
        }

        public Builder addHeroImageUrl(final String addHeroImageUrl) {
            this.addHeroImageUrl = addHeroImageUrl;
            return this;
        }

        public Header build(){
            return new Header(this);
        }

    }

}
