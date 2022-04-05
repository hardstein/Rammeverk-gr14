package websiteGenerator.Pages;

import websiteGenerator.SemanticElements.Header;
import websiteGenerator.Util.Theme;

public class Home {

    private Theme theme;
    private Header header;
//    private Header headerImageUrl;
//    private Header headerHeading;
    private String mainHeading;
    private String mainContent;
    private String heroHeading;
    private String heroImageUrl;

    public Theme getTheme() {
        return theme;
    }

//    public Header getHeaderImageUrl() {
//        return headerImageUrl;
//    }
//
//    public void setHeaderImageUrl(Header headerImageUrl) {
//        this.headerImageUrl = headerImageUrl;
//    }
//
//    public Header getHeaderHeading() {
//        return headerHeading;
//    }
//
//    public void setHeaderHeading(Header headerHeading) {
//        this.headerHeading = headerHeading;
//    }

    public String getMainHeading() {
        return mainHeading;
    }

    public void setMainHeading(String mainHeading) {
        this.mainHeading = mainHeading;
    }

    public String getMainContent() {
        return mainContent;
    }

    public void setMainContent(String mainContent) {
        this.mainContent = mainContent;
    }

    public String getHeroHeading() {
        return heroHeading;
    }

    public void setHeroHeading(String heroHeading) {
        this.heroHeading = heroHeading;
    }

    public String getHeroImageUrl() {
        return heroImageUrl;
    }

    public void setHeroImageUrl(String heroImageUrl) {
        this.heroImageUrl = heroImageUrl;
    }

    private Home(Builder builder) {
        this.theme = builder.theme;
//        this.headerImageUrl = builder.headerImageUrl;
//        this.headerHeading = builder.headerHeading;

        this.mainHeading = builder.mainHeading;
        this.mainContent = builder.mainContent;

        this.heroHeading = builder.heroHeading;
        this.heroImageUrl = builder.heroImageUrl;
    }

    public static Builder createBuilder() {
        return new Builder();
    }

    public static class Builder {
        private Theme theme;
        private Header headerImageUrl;
        private Header headerHeading;
        private String mainHeading;
        private String mainContent;
        private String heroHeading;
        private String heroImageUrl;

        private Builder() {}


        public Builder theme(final Theme theme) {
            this.theme = theme;
            return this;
        }



        public Builder headerImageUrl(final Header headerImageUrl) {
            this.headerImageUrl = headerImageUrl;
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

        public Builder headerHeading(final Header headerHeading) {
            this.headerHeading = headerHeading;
            return this;
        }

        public Builder heroHeading(final String heroHeading) {
            this.heroHeading = heroHeading;
            return this;
        }

        public Builder heroImageUrl(final String heroImageUrl) {
            this.heroImageUrl = heroImageUrl;
            return this;
        }

        public Home build() {
            return new Home(this);
        }
    }


    public void header() {

//        System.out.printf("Heading: %s, Image: %s\n", getHeaderHeading(), getHeaderImageUrl());
    }


    public void nav() {
        System.out.println("nav");
    }


    public void main() {
        System.out.println("Main: " + getMainHeading() + ". Content :" + getMainContent());
    }


    public void aside() {
        System.out.println("aside");
    }


    public void footer() {
        System.out.println("footer");
    }


    public void completeTemplate() {
        header();
        nav();
        main();
        aside();
        footer();
        System.out.println("complete template");
    }

    public void hero() {
//    public void hero(String text, String image) {
//        System.out.println("hero header with chosen text " + text + " and image " + image);
        System.out.println("Hero header: " + getHeroHeading() + " and image " + getHeroImageUrl());
    }

    public void setTheme(Theme theme) {
        this.theme = theme;
    }
}
