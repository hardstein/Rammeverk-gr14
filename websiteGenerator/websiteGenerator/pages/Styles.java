package websiteGenerator.pages;


/**
 * A class for the styles
 *
 * @version 1.0.0
 */
public class Styles {
    private StringBuilder stylesContent;
    private String filename;

    /**
     * @getter filename
     * @return returns a string for the filename
     */
    public String getFilename() {
        return filename;
    }

    /**
     * @getter styleContent
     * @return returns a stringBuilder for the styleContent
     */
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
