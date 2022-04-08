package websiteGenerator.Pages;
import websiteGenerator.HTMLTags.HeadTag.Head;
import websiteGenerator.HTMLTags.Html;
import websiteGenerator.HTMLTags.Body.SemanticElements.*;
import websiteGenerator.Util.HTMLLanguageOptions;
import websiteGenerator.Util.Theme;

/**
 * Class for an article page.
 */
public class Article extends Page  {

    /**
     * This is a factory for Builder.
     * @return a new Builder.
     */
   public static Builder createArticlePageBuilder() {
    return new Builder();
    }

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
     * Class Builder used to create an Article page object.
     */
   public static class Builder {

        /**
         * The name of the file. Default is "article.html".
         */
       private String fileName = "article.html";
        /**
         * The html-tag in the html file, used to set language the file.
         * Default is english (EN).
         */
       private Html html = Html.createHTMLTag(HTMLLanguageOptions.EN);
        /**
         * The header-tag used by the html file.
         */
       private Header header;
        /**
         * The color theme used by the html file.
         */
       private Theme theme;
        /**
         * The head-tag used by the html file.
         */
       private Head head;
        /**
         * The main-tag used by the html file.
         */
       private Main main;
        /**
         * The nav-tag used by the html file.
         */
       private Nav nav;
        /**
         * The aside-tag used by the html file.
         */
       private Aside aside;
        /**
         * The footer-tag used by the html file.
         */
       private Footer footer;

        /**
         * Add file name to a page.
         * @param fileName a string used as the name for the file.
         * @return Builder object when done.
         */
       public Builder addFileName(String fileName) {
           this.fileName = fileName; 
           return this; 

       }

        /**
         * Add a theme to a page.
         * @param theme emun used to specify the theme.
         * @return Builder object when done.
         */
        public Builder addTheme(Theme theme) {
            this.theme = theme;
            return this;
        }

        /**
         * Set ISO language code for the file.
         * @param lang enum used to select a language of the web page.
         * @return Builder object when done.
         */
       public Builder setLanguage(HTMLLanguageOptions lang) {
           this.html.setStartTag(lang);
           return this; 

       }

        /**
         * Add header-tag to the file.
         * @param header The header used in the page.
         * @return Builder object when done.
         */
       public Builder addHeader(Header header) {
           this.header = header;
           return this;
       }

        /**
         * Add main-tag to the file.
         * @param main The main used in the page.
         * @return Builder object when done.
         */
       public Builder addMain(Main main) {
           this.main = main;
           return this;
       }

        /**
         * Add nav-tag to the file.
         * @param nav The nav used in the page.
         * @return Builder object when done.
         */
       public Builder addNav(Nav nav) {
           this.nav = nav;
           return this;
       }

        /**
         * Add aside-tag to the file.
         * @param aside The aside used in the page.
         * @return Builder object when done.
         */
       public Builder addAside(Aside aside) {
           this.aside = aside;
           return this;
       }

        /**
         * Add footer-tag to the file.
         * @param footer The footer used in the page.
         * @return Builder object when done.
         */
       public Builder addFooter(Footer footer) {
           this.footer = footer;
           return this;
       }

        /**
         * Add head-tag to the file.
         * @param head The head used in the page.
         * @return Builder object when done.
         */
       public Builder addHead(Head head) {
           this.head = head;
           return this;
       }

        /**
         * Builds the page.
         * @return Article with values set by the user, or default.
         */
       public Article build() {
                    return new Article(this);
       }
   }

}
