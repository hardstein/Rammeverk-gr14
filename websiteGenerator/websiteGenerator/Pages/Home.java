package websiteGenerator.Pages;

import websiteGenerator.SemanticElements.*;
import websiteGenerator.Util.Theme;

import java.io.FileWriter;
import java.io.IOException;

public class Home {
<<<<<<< HEAD
    private  String fileName;
    private  Theme theme;
    private  Header header;
    private  Nav nav;
    private  Main main;
    private  Footer footer;

    public Home() {} 
=======
    private final String fileName;
    private final Theme theme;
    private final Header header;
    private final Nav nav;
    private final Main main;
    private final Aside aside;
    private final Footer footer;
>>>>>>> a28662a6d7d467988f77ee4a9782ecb7d2fbc612

    public Theme getTheme() {
        return theme;
    }

    public String getFileName() {
        return fileName;
    }

    public Header getHeader() {
        return header;
    }

    public Nav getNav() {
        return nav;
    }

    public Main getMain() {
        return main;
    }

    public Footer getFooter() {
        return footer;
    }

    private Home(Builder builder) {
        this.theme = builder.theme;
        this.fileName = builder.fileName;
        this.header = builder.header;
        this.nav = builder.nav;
        this.main = builder.main;
        this.aside = builder.aside;
        this.footer = builder.footer;
    }

    public static Builder createPageBuilder() {
        return new Builder();
    }

    public static class Builder {
        // Default values
        String filename = "homepage.html";
        String heading = "Starter template";
        String content = "This is a starter project template.";

        private Theme theme;
        private String fileName;
        private Header header;
        private Nav nav;
        private Main main;
        private Aside aside;
        private Footer footer;

        private Builder() {
        }

        public Builder theme(final Theme theme) {
            this.theme = theme;
            return this;
        }

        public Builder setFilename(final String fileName) {
            this.fileName = fileName;
            return this;
        }

        public Builder header(final Header header) {
            this.header = header;
            return this;
        }

        public Builder nav(final Nav nav) {
            this.nav = nav;
            return this;
        }

        public Builder main(final Main main) {
            this.main = main;
            return this;
        }

        public Builder aside(final Aside aside) {
            this.aside = aside;
            return this;
        }

        public Builder footer(final Footer footer) {
            this.footer = footer;
            return this;
        }

        public Home build() throws IOException {
            // Trenger refaktorering
            if (fileName != null) {
                filename = fileName;
            }
            FileWriter fileWriter = new FileWriter(filename);
            if (header.getHeaderHeading() != null) {
                heading = header.getHeaderHeading();
            }
            if (main.getMainContent() != null) {
                content = main.getMainContent();
            }
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
                    header.content() + "\n" +
                    nav.content() + "\n" +
                    main.content() + "\n" +
                    aside.content() + "\n" +
                    footer.content() + "\n" +
                    "</body>\n" +
                    "</html>");
            System.out.println("HTML template with style was successfully filled");
            fileWriter.close();

            return new Home(this);
        }

    }

    public void hero() {
        System.out.println("Hero header: " + header.getHeroHeading() + " and image " + header.getHeroImageUrl());
    }

    public void navbar() {
        System.out.println(nav.getAddLogoImage());
        for (String link : nav.getAddPageLinks()) {
            System.out.println(link);
        }
    }
}
