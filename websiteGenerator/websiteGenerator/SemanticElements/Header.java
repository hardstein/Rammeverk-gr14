package websiteGenerator.SemanticElements;

public class Header {

    private final String headerImageUrl;
    private final String headerHeading;


    private Header(Builder builder) {
        this.headerImageUrl = builder.headerImageUrl;
        this.headerHeading = builder.headerImageUrl;
    }

    public static Builder createBuilder() {
        return new Builder();
    }

    public static class Builder {
        private String headerImageUrl;
        private String headerHeading;

        private Builder() {

        }

        public Builder 
    }
}
