package websiteGenerator.pages;

public class Styles {
    private StringBuilder stylesContent;
    private String filename;

    public String getFilename() {
        return filename;
    }

    public StringBuilder getStylesContent() {
        return stylesContent;
    }

    public Styles(Builder builder) {
        this.stylesContent = builder.stylesContent;
        this.filename = builder.filename;
    }

    public static Builder createStylesBuilder() {
        return new Builder();
    }

    public static class Builder {
        private StringBuilder stylesContent = new StringBuilder("/* This is the stylesheet. There is no functionally at this time.*/");
        private String filename = "styles.css";

        public Builder addFilename(String filename) {
            this.filename = filename;
            return this;
        }

        public Styles build() {
            return new Styles(this);
        }
    }
}
