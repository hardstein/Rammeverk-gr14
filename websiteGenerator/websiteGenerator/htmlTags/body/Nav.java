package websiteGenerator.htmlTags.body;

import websiteGenerator.pages.Page;
import websiteGenerator.util.Theme;

import java.util.ArrayList;

/**
 * class for defining and building a nav element for a Page {@link websiteGenerator.pages.Page}
 *
 * @version 1.0.0
 */
public class Nav {
    private StringBuilder nav;
    private final String logoImage;

    int i = 0;

    public String getLogoImage() {
        return logoImage;
    }

    /**
     * private constructor for Nav class
     *
     * @param builder
     */
    private Nav(Builder builder) {
        this.nav = builder.nav;
        this.logoImage = builder.addLogoImage;
    }


    /**
     * Factory for creating a nav object
     *
     * @return Builder
     */
    public static Builder createElementBuilder() {
        return new Builder();
    }

    /**
     * This will give you the entire nav tag structure for your page
     *
     * @return the final nav tag content
     */
    public StringBuilder createNav(Theme theme, Page[] pages) {
        // Jalla if check so that nav doesn't get appended each time. Which can result in multiple navs for a page...
        if (i < 1) {
        ArrayList<String> navlinks = new ArrayList<>();
        for (Page page: pages) {
            navlinks.add(page.getFileName());
        }

        StringBuilder links = new StringBuilder();
        for (String link : navlinks) {
            links.append("            <a class=\"nav-link\" href=\"")
                    .append(link)
                    .append("\">")
                    .append(link.substring(0, link.length() - 5)) // Removes the 5 last character from the string,
                    // which is ".html".
                    .append("</a>\n");
        }
        nav.append("    <nav class=\"navbar navbar-" + theme.getThemeColor() + " navbar-expand-md\"> \n")
                .append("        <a href=\"#\" class=\"navbar-brand\">")
                .append("            <img src=\"" + logoImage + "\" alt=\"\" width=\"30\" height=\"24\">")
                .append("</a>\n" +
                        "        <button class=\"navbar-toggler\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbar\">\n" +
                        "            <span class=\"navbar-toggler-icon \"></span>\n" +
                        "        </button>\n")
                .append("        <div class=\"navbar-collapse collapse \" id=\"navbar\">\n")
                .append("        <ul class=\"navbar-nav\">\n")
                .append(links)
                .append("        </ul>\n")
                .append("        </div>\n")
                .append("    </nav>\n");
        i = nav.length();
        }
        return nav;
    }

    /**
     * Builder class for building a header {@link Nav}
     */
    public static class Builder {
        private StringBuilder nav = new StringBuilder();
        private String addLogoImage;

        /**
         * Adds image logo path for picture in you navbar
         *
         * @param addLogoImage
         * @return image path
         */
        public Builder addLogoImage(String addLogoImage) {
            this.addLogoImage = addLogoImage;
            return this;
        }

        /**
         * Makes the complete Nav object
         *
         * @return Nav object
         */
        public Nav build() {
            return new Nav(this);
        }
    }

}
