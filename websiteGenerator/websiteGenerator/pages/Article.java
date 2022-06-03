package websiteGenerator.pages;

import websiteGenerator.htmlTags.body.*;
import websiteGenerator.htmlTags.head.Head;
import websiteGenerator.htmlTags.Html;
import websiteGenerator.util.HTMLLanguageOptions;
import websiteGenerator.util.Theme;

/**
 * Class for an article page.
 *
 * @version 1.0.0
 */
public class Article extends Page {
    /**
     * The name of the file. Default is "article.html".
     */
    public static final String DEFAULT_ARTICLE_FILENAME = "article.html";

    private Article(Builder builder) {
        super.theme = builder.theme;
        super.fileName = builder.fileName;
        super.header = builder.header;
        super.main = builder.main;
        super.nav = builder.nav;
        super.aside = builder.aside;
        super.footer = builder.footer;
        super.html = builder.html;
        super.head = builder.head;
    }

    /**
     * This is a factory for Builder.
     *
     * @return a new Builder.
     */
    public static Builder createArticlePageBuilder() {
        return new Builder();
    }

    /**
     * Class Builder used to create an Article page object.
     */
    public static class Builder {

        private String fileName = DEFAULT_ARTICLE_FILENAME;
        private Html html = Html.createHTMLTag(DEFAULT_LANGUAGE);
        private Header header = DEFAULT_HEADER;
        private Theme theme;
        private Head head = DEFAULT_HEAD;
        private Main main = DEFAULT_MAIN;
        private Nav nav = DEFAULT_NAV;
        private Aside aside = DEFAULT_ASIDE;
        private Footer footer = DEFAULT_FOOTER;

        /**
         * Add a file name to the Article page.
         *
         * @param fileName a string used as the name for the file.
         * @return Builder object when done.
         */
        public Builder addFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }

        /**
         * Add a theme to a page.
         *
         * @param theme emun used to specify the theme.
         * @return Builder object when done.
         */
        public Builder addTheme(Theme theme) {
            this.theme = theme;
            return this;
        }

        /**
         * Set ISO language code for the file.
         *
         * @param lang enum used to select a language of the web page.
         * @return Builder object when done.
         */
        public Builder setLanguage(HTMLLanguageOptions lang) {
            this.html.setStartTag(lang);
            return this;
        }

        /**
         * Add header-tag to the file.
         *
         * @param header The header used in the page.
         * @return Builder object when done.
         */
        public Builder addHeader(Header header) {
            this.header = header;
            return this;
        }

        /**
         * Add main-tag to the file.
         *
         * @param main The main used in the page.
         * @return Builder object when done.
         */
        public Builder addMain(Main main) {
            this.main = main;
            return this;
        }

        /**
         * Add nav-tag to the file.
         *
         * @param nav The nav used in the page.
         * @return Builder object when done.
         */
        public Builder addNav(Nav nav) {
            this.nav = nav;
            return this;
        }

        /**
         * Add aside-tag to the file.
         *
         * @param aside The aside used in the page.
         * @return Builder object when done.
         */
        public Builder addAside(Aside aside) {
            this.aside = aside;
            return this;
        }

        /**
         * Add footer-tag to the file.
         *
         * @param footer The footer used in the page.
         * @return Builder object when done.
         */
        public Builder addFooter(Footer footer) {
            this.footer = footer;
            return this;
        }

        /**
         * Add head-tag to the file.
         *
         * @param head The head used in the page.
         * @return Builder object when done.
         */
        public Builder addHead(Head head) {
            this.head = head;
            return this;
        }

        /**
         * Builds the page.
         *
         * @return Article with values set by the user, or default.
         */
        public Article build() {
            return new Article(this);
        }
    }

}
