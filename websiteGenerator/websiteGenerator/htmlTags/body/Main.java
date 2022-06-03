package websiteGenerator.htmlTags.body;
import websiteGenerator.util.*;
import static websiteGenerator.util.FindIndexBeforeTag.findIndexBeforeTag;
import static websiteGenerator.util.ReplaceWord.replaceAllWords;

/**
 * class for defining and building a main element for a Page {@link websiteGenerator.pages.Page}
 *
 * @version 1.0.0
 */
public class Main {
    private static final String FONT = "inherit";
    private final StringBuilder main;
    private final FontFamily fontFamily;
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
     *
     * @getter for main
     * @return StringBuilder
     */
    public StringBuilder getMain() {
        return main;
    }

    /**
     *
     * @getter for introduction
     * @return String
     */
    public String getIntroduction() {
        return introduction;
    }

    /**
     *
     * @getter for body
     * @return String
     */
    public String getBody() {
        return body;
    }
    /**
     *
     * @getter for main
     * @return String conclusion
     */
    public String getConclusion() {
        return conclusion;
    }

    /**
     *
     * @getter for form
     * @return Form
     */
    public Form getForm() {
        return form;
    }

    /**
     *
     * @getter for font family
     * @return FontFamily
     */
    public FontFamily getFontFamily() {
        return fontFamily;
    }

    /**
     * private constructor for Main
     *
     * @param builder
     */
    private Main(Builder builder) {
        this.main = builder.main;
        this.fontFamily = builder.fontFamily;
        this.mainHeading = builder.mainHeading;
        this.introduction = builder.introduction;
        this.body = builder.body;
        this.conclusion = builder.conclusion;
        this.form = builder.form;
    }

    /**
     * Creates main
     * @return main
     */
    public StringBuilder createMain() {
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
     * Builder class for building a header {@link Main}
     */
    public static class Builder {
        private StringBuilder main = new StringBuilder("    <main style=\"font-family:"+ FONT +"\">\n" + "    </main>\n");
        private FontFamily fontFamily;
        private String mainHeading;
        private String introduction;
        private String body;
        private String conclusion;
        private Form form;

        /**
         * Adds font family
         * @param fontFamily
         * @return Builder object
         */
        public Builder addFontFamily(FontFamily fontFamily) {
            this.fontFamily = fontFamily;
            StringBuilder mainWithFF = replaceAllWords(main, FONT, fontFamily.getFontFamily());
            main.setLength(0);
            main.insert(0, mainWithFF);
            return this;
        }
        /**
         * Adds the main heading
         *
         * @param mainHeading
         * @return main heading string text
         */
        public Builder addMainHeading(String mainHeading) {
            this.mainHeading = "        <h2 class='fw-bold'>" + mainHeading + "</h2>\n";
            int index = findIndexBeforeTag(main, "</main>");
            main.insert(index, this.mainHeading);
            return this;
        }

        /**
         * Adds introduction
         * @param introduction
         * @return Builder object
         */
        public Builder addIntroduction(String introduction) {
            this.introduction = "        <p class=\"fw-light\">" + introduction + "</p>\n";
            int index = findIndexBeforeTag(main, "</main>");
            main.insert(index, this.introduction);
            return this;
        }

        /**
         * Adds body text to main
         * @param s
         * @return Builder
         */
        public Builder addBody(String s) {
            this.body = "        <p>" + s + "</p>\n";
            main.append(this.body);
            return this;
        }

        /**
         * Adds body text to main
         *
         * @param body
         * @param fontSize
         * @return Builder object
         */
        public Builder addBody(String body, FontSize fontSize) {
            this.body = "        <p class=\"" + fontSize.getFontSize() + "\">" + body + "</p>\n";
            int index = findIndexBeforeTag(main, "</main>");
            main.insert(index, this.body);
            return this;
        }

        /**
         * Adds body text to main
         *
         * @param body
         * @param weight
         * @return Builder object
         */
        public Builder addBody(String body, FontWeight weight) {
            this.body = "        <p class=\"" + weight.getFontWeight() + "\">" + body + "</p>\n";
            int index = findIndexBeforeTag(main, "</main>");
            main.insert(index, this.body);
            return this;
        }

        /**
         * Adds body txt in main
         *
         * @param body
         * @param fontSize
         * @param weight
         * @return Builder object
         */
        public Builder addBody(String body, FontSize fontSize, FontWeight weight) {
            this.body = "        <p class=\"" + fontSize.getFontSize() + " " + weight.getFontWeight() + "\">" + body + "</p>\n";
            int index = findIndexBeforeTag(main, "</main>");
            main.insert(index, this.body);
            return this;
        }

        /**
         * Adds conclusion
         *
         * @param conclusion
         * @return Builder object
         */
        public Builder addConclusion(String conclusion) {
            this.conclusion = "        <p>" + conclusion + "</p>\n";
            int index = findIndexBeforeTag(main, "</main>");
            main.insert(index, this.conclusion);
            return this;
        }

        /**
         * Adds form to main
         * @param form
         * @return Builder object
         */
        // Main with form
        public Builder addForm(Form form) {
            this.form = form;
            int index = findIndexBeforeTag(main, "</main>");
            main.insert(index, form.createForm());
//            if (form != null)
//                main.append(form.createForm());
            return this;
        }

        /**
         * Parse a text file to html content
         * @param filepath
         *
         * @return Builder object
         */
        public Main.Builder addTxtToHtml(String filepath) {
            this.main.append(Parse.txtToHtml(filepath));
            return this;
        }

        /**
         * Parse CSV to HTML content
         *
         * @param filepath
         * @param parsingCharacter
         * @return Builder object
         */

        public Main.Builder addCSVToHtml(String filepath, String parsingCharacter ) {
            this.main.append(Parse.CSVtoHTMLTable(filepath, parsingCharacter));
            return this;
        }

        /**
         * Adds table to main
         * @param table
         * @return Builder object
         */
        public Main.Builder addTable(Table table) {
            this.main.append(table.table);
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
