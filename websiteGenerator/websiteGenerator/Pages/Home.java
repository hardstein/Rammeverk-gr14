package websiteGenerator.Pages;

import websiteGenerator.SemanticElements.Footer;
import websiteGenerator.SemanticElements.Header;
import websiteGenerator.SemanticElements.Nav;
import websiteGenerator.Util.Theme;

public class Home {

    private final Theme theme;
    private final Header header;
    private final Nav nav;
    private final Footer footer;
    private final String mainHeading;
    private final String mainContent;

    public Theme getTheme() {
        return theme;
    }

    public Header getHeader() {
        return header;
    }

    public Nav getNav() {
        return nav;
    }

    public String getMainHeading() {
        return mainHeading;
    }

    public String getMainContent() {
        return mainContent;
    }

    private Home(Builder builder) {
        this.theme = builder.theme;
        this.header = builder.header;
        this.nav = builder.nav;
        this.footer = builder.footer;
        this.mainHeading = builder.mainHeading;
        this.mainContent = builder.mainContent;
    }

    public static Builder createPageBuilder() {
        return new Builder();
    }

    public static class Builder {
        private Theme theme;
        private Header header;
        private Nav nav;
        private Footer footer;
        private String mainHeading;
        private String mainContent;

        private Builder() {
        }


        public Builder theme(final Theme theme) {
            this.theme = theme;
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

        public Builder footer(final Footer footer) {
            this.footer = footer;
            return this;
        }

        public Builder mainHeading(final String mainHeading) {
            this.mainHeading = mainHeading;
            return this;
        }

        public Builder mainContent(final String mainContent) {
            this.mainContent = mainContent;
            return this;
        }

        public Home build() {
            return new Home(this);
        }

        public Header getHeader() {
            return header;
        }

        public void setHeader(Header header) {
            this.header = header;
        }
    }

    public void hero() {
        System.out.println("Hero header: " + header.getAddHeroHeading() + " and image " + header.getAddHeroImageUrl());
    }

    public void navbar() {
        System.out.println(nav.getAddLogoImage());
        for (String link : nav.getAddPageLinks()) {
            System.out.println(link);
        }
    }
}
