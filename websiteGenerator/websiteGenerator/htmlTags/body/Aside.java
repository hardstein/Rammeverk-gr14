package websiteGenerator.htmlTags.body;

import static websiteGenerator.util.FindIndexBeforeTag.findIndexBeforeTag;

/**
 * class for defining and building an aside element for a Page {@link websiteGenerator.pages.Page}
 *
 * @version 1.0.0
 */
public class Aside {
    private final StringBuilder aside;
    private final String asideTitle;
    private final String asideText;

    /**
     * Getter for title in aside
     *
     * @return String
     */
    public String getAsideTitle() {
        return asideTitle;
    }

    /**
     * Getter for getting aside text
     *
     * @return String with the aside text
     */
    public String getAsideText() {
        return asideText;
    }

    /**
     * Getter for getting the content of aside
     *
     * @return StringBuilder with the aside vontent
     */
    public StringBuilder getAside() {
        return aside;
    }

    private Aside(Builder builder) {
        this.aside = builder.aside;
        this.asideTitle = builder.asideTitle;
        this.asideText = builder.asideText;
    }

    /**
     * Starts the building process with returning a new builder object
     *
     * @return Builder object
     */
    public static Builder createElementBuilder() {
        return new Builder();
    }

    /**
     * @return StringBuilder with the content of aside
     */
    public StringBuilder createAside() {
        return aside;
    }

    /**
     * A builder for {@link Aside}
     */
    public static class Builder {
        private final StringBuilder aside = new StringBuilder("    <aside>\n" + "    </aside>\n");
        private String asideTitle;
        private String asideText;

        /**
         * Adds the aside title
         *
         * @param asideTitle
         * @return the aside title
         */
        public Builder addAsideTitle(final String asideTitle) {
            this.asideTitle = asideTitle;
            int index = findIndexBeforeTag(aside, "</aside>");
            aside.insert(index, "        <h3>" + asideTitle + "</h3>\n");
            return this;
        }

        /**
         * Adds the aside text
         *
         * @param asideText the text for the aside element
         * @return Builder with new aside text
         */
        public Builder addAsideText(final String asideText) {
            this.asideText = asideText;
            int index = findIndexBeforeTag(aside, "</aside>");
            aside.insert(index, "        <p>" + asideText + "</p>\n");
            return this;
        }

        /**
         * @return a new Aside object
         */
        public Aside build() {
            return new Aside(this);
        }
    }

}
