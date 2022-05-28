package websiteGenerator.HTMLTags.Body.SemanticElements;

import websiteGenerator.Util.Form;
import websiteGenerator.Util.GetHTMLTagContent;
import websiteGenerator.Util.Theme;

/**
 * A class for semantic main tag
 *
 * @version 1.0.0
 */
public class Main implements GetHTMLTagContent {

    private final String mainHeading;
    private final String mainContent;
    private final Form form;

    /**
     * Getter for main heading
     * @return heading for main tag
     */
    public String getMainHeading() {
        return mainHeading;
    }

    /**
     * Getter for main content
     *
     * @return main content
     */
    public String getMainContent() {
        return mainContent;
    }

    /**
     * private constructor for Main
     *
     * @param builder
     */

    private Main(Builder builder) {
        this.mainHeading = builder.mainHeading;
        this.mainContent = builder.mainContent;
        this.form = builder.form;
    }

    /**
     * Factory for building a main tag
     *
     * @return Builder
     */
    public static Builder createElementBuilder() {
        return new Builder();
    }


    /**
     * This will give you the entire main tag structure for your page
     *
     * @return the final main tag content
     */
    @Override
    public StringBuilder getContentOfElement() {
        StringBuilder content = new StringBuilder();
        content.append("    <main>\n");
        if (mainHeading != null)
            content.append("        <h1>" + mainHeading + "</h1>\n");
        if (mainContent != null)
            content.append("        <p>" + mainContent + "</p>\n");
        if (form != null)
            content.append(form.createLoginForm() + "\n");
        content.append("    </main>");
        return content;
    }

    @Override
    public StringBuilder getContentOfElement(Theme theme) {
        return null;
    }

    /**
     * Builder class for building a header {@link Main}
     */
    public static class Builder {
        private String mainHeading;
        private String mainContent;
        private Form form;

        /**
         * Adds the main heading
         *
         * @param mainHeading
         * @return main heading string text
         */
        public Builder addMainHeading(String mainHeading) {
            this.mainHeading = mainHeading;
            return this;
        }

        /**
         * Adds the main content
         *
         * @param mainContent
         * @return main content string text
         */
        public Builder addMainContent(String mainContent) {
            this.mainContent = mainContent;
            return this;
        }

        // Main with form
        public Builder addMainContent(Form loginForm) {
            this.form = loginForm;
            return this;
        }

        /**
         * Builds the complete Main object
         *
         * @return Main object
         */
        public Main build() {
            return new Main(this);
        }

    }
}
