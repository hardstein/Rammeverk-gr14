package websiteGenerator.Pages;

import websiteGenerator.HTMLTags.HeadTag.Head;
import websiteGenerator.HTMLTags.Html;
import websiteGenerator.HTMLTags.Body.SemanticElements.*;
import websiteGenerator.Util.Generator;
import websiteGenerator.Util.HTMLLanguageOptions;
import websiteGenerator.Util.Theme;

import java.io.FileWriter;
import java.io.IOException;

public class Home extends Page implements Generator {

    private Home(Builder builder) {
        super.theme = builder.theme;
        super.fileName = builder.fileName;
        super.header = builder.header;
        super.nav = builder.nav;
        super.main = builder.main;
        super.aside = builder.aside;
        super.footer = builder.footer;
        super.html = builder.html; 
        super.head = builder.head;
    }

    public static Builder createPageBuilder() {
        return new Builder();
    }

    @Override
    public void generate() {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            fileWriter.write("<!DOCTYPE html>\n" +
                    "<html lang=\"en\">\n" +
                    "<head>\n" +
                    "   <meta charset=\"UTF-8\">\n" +
                    "   <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
                    "   <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                    "   <link rel=\"stylesheet\" href=\"" + "styles.css" + "\">\n" +
                    "   <title>Starter Project</title>\n" +
                    "</head>\n" +
                    "<body>\n" +
                    header.getContentOfElement() + "\n" +
                    nav.getContentOfElement() + "\n" +
                    main.getContentOfElement() + "\n" +
                    aside.getContentOfElement() + "\n" +
                    footer.getContentOfElement() + "\n" +
                    "</body>\n" +
                    "</html>");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("HTML template with style was successfully filled");
        try {
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static class Builder {
        // Default values
        String filename = "homepage.html";
        String heading = "Starter template";
        String content = "This is a starter project template.";

        private Html html = Html.createHTMLTag(HTMLLanguageOptions.EN);

        private Theme theme;

        private String fileName;
        private Header header;
        private Nav nav;
        private Main main;
        private Aside aside;
        private Footer footer;
        private Head head;

        private Builder() {
        }

        public Builder addLanguage(HTMLLanguageOptions lang) {
            this.html.setStartTag(lang);; 
            return this; 
 
        }

        public Builder addTheme(final Theme theme) {
            this.theme = theme;
            return this;
        }

        public Builder setFilename(final String fileName) {
            this.fileName = fileName;
            return this;
        }

        public Builder addHeader(final Header header) {
            this.header = header;
            return this;
        }

        public Builder addNav(final Nav nav) {
            this.nav = nav;
            return this;
        }

        public Builder addMain(final Main main) {
            this.main = main;
            return this;
        }

        public Builder addAside(final Aside aside) {
            this.aside = aside;
            return this;
        }

        public Builder addFooter(final Footer footer) {
            this.footer = footer;
            return this;
        }

        public Builder addHead(final Head head) {
            this.head = head;
            return this;
        }

        public Home build() throws IOException {
            return new Home(this);
        }

    }

}
