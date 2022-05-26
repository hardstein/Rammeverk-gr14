package websiteGenerator;

import websiteGenerator.Pages.*;
import websiteGenerator.Util.Theme;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Class that creates and generats a project folder
 */
public class WebsiteBuilder {

    private String projectFolder;
    private Page[] pages;
    private Theme theme;
    private String robots;

    /**
     * Getter for pages attribute
     *
     * @return a list of page objects
     */
    public Page[] getPages() {
        return pages;
    }

    /**
     * Getter for projectFolder attribute
     *
     * @return folder name
     */
    public String getProjectFolder() {
        return projectFolder;
    }

    /**
     * Factory for creating a websiteBuilder
     *
     * @return Builder
     */
    public static Builder createWebsiteBuilder() {
        return new Builder();
    }

    /**
     * Constructor for flass
     *
     * @param builder
     */
    private WebsiteBuilder(Builder builder) {
        this.pages = builder.page;
        this.projectFolder = builder.projectFolder;
        this.theme = builder.theme;
        this.robots = builder.robots;
    }

    /**
     * This method will generate the end product of your entire project build.
     * It will make a folder structur for you, and build your page as you have requested.
     * It will make the HTML pages you have specified, and also a robots.txt file if you have added that aswell
     */
    public void generate() {
        String htmlHeadElement = "<!DOCTYPE html>\n";
        if (projectFolder == null) {
            projectFolder = ("starterproject");
        }
        File file = new File(projectFolder);

        boolean bool = file.mkdir();
        if (bool) {
            System.out.println(projectFolder + " folder was created successfully");
        } else {
            System.out.println("Error, folder was not created. It might already exist");
        }


        for (Page page : pages) {
            try {
                FileWriter fileWriter = new FileWriter("./" + projectFolder + "/" + page.getFileName());
                fileWriter.write(
                        htmlHeadElement +
                                page.getHtml().getStartTag() + "\n" +
                                page.getHead().getContentOfElement() + "\n" +
                                // Add Theme
                                "<body class=\"container h-100 bg-" + theme.themeColor +" text-" + theme.fontColor + "\">\n" +
                                page.getHeader().getContentOfElement() + "\n" +
                                page.getNav().getContentOfElement() + "\n" +
                                page.getMain().getContentOfElement() + "\n" +
                                page.getAside().getContentOfElement() + "\n" +
                                page.getFooter().getContentOfElement() + "\n" +
                                "    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2\" crossorigin=\"anonymous\"></script>\n" +
                                "</body>\n" +
                                page.getHtml().getEndTag());
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        if(robots != null) {
            try {
                FileWriter fileWriter = new FileWriter("./" + projectFolder + "/" + robots);
                fileWriter.write("User-agent: * \n Allow: /");
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }


        }
    }

    /**
     * A builder for WebsiteBuilder {@link WebsiteBuilder}
     */
    public static class Builder {
        private String projectFolder = "WebsiteProject";
        private Page[] page;
        private Theme theme;
        private String robots;

        /**
         * Adds a projectFolder
         * @param projectFolderName
         * @return projectFolder name
         */
        public Builder addProjectFolder(String projectFolderName) {
            this.projectFolder = projectFolderName;
            return this;
        }

        /**
         * adds html pages to your project
         * @param page
         * @return A list of HTML pages
         */
        public Builder addHTMLPages(Page[] page) {
            this.page = page;
            return this;
        }

        /**
         * Adds a theme for the project
         *
         * @param theme
         * @return a specified theme
         */
        public Builder addTheme(Theme theme) {
            this.theme = theme;
            return this;
        }

        /**
         * Adds a robots.txt file to your project
         *
         * @return robots.txt string value
         */
        public Builder addRobots() {
            this.robots = "Robots.txt";
            return this;
        }

        /**
         * Builds and makes the complete object for the project
         *
         * @return WebsiteBuilder object
         */
        public WebsiteBuilder build() {

            return new WebsiteBuilder(this);
        }
    }
}
