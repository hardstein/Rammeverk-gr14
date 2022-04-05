package websiteGenerator.SemanticElements;

public class Nav {

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
