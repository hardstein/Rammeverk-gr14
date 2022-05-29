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
    private StringBuilder main;
    private final String mainHeading;
    private final String introduction;
    private final String body;
    private final String conclusion;
    private final Form form;

    /**
     * Getter for main heading
     * @return heading for main tag
     */
    public String getMainHeading() {
        return mainHeading;
    }

    /**
     * Getter for main body / content
     *
     * @return main body
     */
    public String getMainContent() {
        return body;
    }

    /**
     * private constructor for Main
     *
     * @param builder
     */
    private Main(Builder builder) {
        this.main = builder.main;
        this.mainHeading = builder.mainHeading;
        this.introduction = builder.introduction;
        this.body = builder.body;
        this.conclusion = builder.conclusion;
        this.form = builder.form;
    }

    public StringBuilder createMain() {
        if (form != null)
            main.append(form.createForm());
        main.append("    </main>\n");
        return main;
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
        return null;
    }

    @Override
    public StringBuilder getContentOfElement(Theme theme) {
        return null;
    }

    /**
     * Builder class for building a header {@link Main}
     */
    public static class Builder {
        private final StringBuilder main = new StringBuilder("    <main>\n");
        private String mainHeading;
        private String introduction;
        private String body;
        private String conclusion;
        private Form form;

        /**
         * Adds the main heading
         *
         * @param mainHeading
         * @return main heading string text
         */
        public Builder addMainHeading(String mainHeading) {
            this.mainHeading = "        <h2>" + mainHeading + "</h2>\n";
            main.append(this.mainHeading);
            return this;
        }

        public Builder addIntroduction(String introduction) {
            this.introduction = "        <p>" + introduction + "</p>\n";
            main.append(this.introduction);
            return this;
        }

        public Builder addBody(String body) {
            this.body = "        <p>" + body + "</p>\n";
            main.append(this.body);
            return this;
        }

        public Builder addConclusion(String conclusion) {
            this.conclusion = "        <p>" + conclusion + "</p>\n";
            main.append(this.conclusion);
            return this;
        }

        /**
         * Adds the main body
         *
         * @param body
         * @return main content string text
         */
        public Builder addMainBody(String body) {
            this.body = body;
            return this;
        }

        // Main with form
        public Builder addMainBody(Form loginForm) {
            this.form = loginForm;
            return this;
        }

        public Builder addForm(Form form) {
            this.form = form;
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
