package websiteGenerator.HTMLTags.Body.SemanticElements;

import websiteGenerator.Pages.Page;
import websiteGenerator.Util.GetHTMLTagContent;
import websiteGenerator.Util.Theme;

import java.util.ArrayList;

/**
 * A class for semantic nav tag
 *
 * @version 1.0.0
 */
public class Nav implements GetHTMLTagContent {

//    private final String[] pageLinks;
    private final String logoImage;

    /**
     * Getter for page links attribute, this is the navbar menu
     *
     * @return a list of page lings
     */
//    public String[] getAddPageLinks() {
//        return pageLinks;
//    }

    /**
     * Getter for image logo path
     *
     * @return path for image
     */
    public String getAddLogoImage() {
        return logoImage;
    }

    /**
     * private constructor for Nav class
     *
     * @param builder
     */
    private Nav(Builder builder) {
//        this.pageLinks = builder.addPageLinks;
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

    @Override
    public StringBuilder getContentOfElement() {
        return null;
    }

    /**
     * This will give you the entire nav tag structure for your page
     *
     * @return the final nav tag content
     */
//    @Override
//    public StringBuilder getContentOfElement(Theme theme) {
//        StringBuilder content = new StringBuilder();
//        StringBuilder links = new StringBuilder();
//        for (String link : pageLinks) {
//            links.append("            <a class=\"nav-link\" href=\"")
//                    .append(link)
//                    .append(".html")
//                    .append("\">")
//                    .append(link)
//                    .append("</a>\n");
//        }
//        content.append("    <nav class=\"navbar navbar-" + theme.getThemeColor() + " navbar-expand-md\"> \n")
//                .append("        <a href=\"#\" class=\"navbar-brand\">Logo</a>\n" +
//                        "        <button class=\"navbar-toggler\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbar\">\n" +
//                        "            <span class=\"navbar-toggler-icon \"></span>\n" +
//                        "        </button>\n")
//                .append("        <div class=\"navbar-collapse collapse \" id=\"navbar\">\n")
//                .append("        <ul class=\"navbar-nav\">\n")
//                .append(links)
//                .append("        </ul>\n")
//                .append("        </div>\n")
//                .append("    </nav>");
//
//        return content;
//    }

    @Override
    public StringBuilder getContentOfElement(Theme theme) {
        return null;
    }

    public StringBuilder getContentOfElementWithLinks(Theme theme, Page[] pages) {
        ArrayList<String> navlinks = new ArrayList<>();
        for (Page page: pages) {
            navlinks.add(page.getFileName());
        }

        StringBuilder content = new StringBuilder();
        StringBuilder links = new StringBuilder();
        for (String link : navlinks) {
            links.append("            <a class=\"nav-link\" href=\"")
                    .append(link)
                    .append("\">")
                    .append(link.substring(0, link.length() - 5)) // Removes the 5 last character from the string,
                    // which is ".html".
                    .append("</a>\n");
        }
        content.append("    <nav class=\"navbar navbar-" + theme.getThemeColor() + " navbar-expand-md\"> \n")
                .append("        <a href=\"#\" class=\"navbar-brand\">Logo</a>\n" +
                        "        <button class=\"navbar-toggler\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbar\">\n" +
                        "            <span class=\"navbar-toggler-icon \"></span>\n" +
                        "        </button>\n")
                .append("        <div class=\"navbar-collapse collapse \" id=\"navbar\">\n")
                .append("        <ul class=\"navbar-nav\">\n")
                .append(links)
                .append("        </ul>\n")
                .append("        </div>\n")
                .append("    </nav>");
        return content;
    }

    /**
     * Builder class for building a header {@link Nav}
     */
    public static class Builder {
//        private String[] addPageLinks;
        private String addLogoImage;

        /**
         * Adds a list of page links for you navbar menu
         * @param addPageLink
         * @return list of pagelinks for menu
         */
//        public Builder addPageLinks(final String[] addPageLink) {
//            this.addPageLinks = addPageLink;
//            return this;
//        }

        /**
         * Adds image logo path for picture in you navbar
         *
         * @param addLogoImage
         * @return image path
         */
        public Builder addLogoImage(final String addLogoImage) {
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
