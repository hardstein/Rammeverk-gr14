package src.main.websiteGenerator.pages;


/**
 * A class for the styles
 *
 * @version 1.0.0
 */
public class Styles {
    private final StringBuilder stylesContent;
    private final String filename;

    /**
     * @return returns a string for the filename
     * @getter filename
     */
    public String getFilename() {
        return filename;
    }

    /**
     * @return returns a stringBuilder for the styleContent
     * @getter styleContent
     */
    public StringBuilder getStylesContent() {
        return stylesContent;
    }


    private Styles(Builder builder) {
        this.stylesContent = builder.stylesContent;
        this.filename = builder.filename;
    }

    /**
     * this is a factory for builder.
     *
     * @return a new Builder
     */
    public static Builder createStylesBuilder() {
        return new Builder();
    }

    /**
     * Class Builder used to create a Styles page object.
     */
    public static class Builder {
        private final StringBuilder stylesContent = new StringBuilder("/* This is the stylesheet. There is no functionally at this time.*/");
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
