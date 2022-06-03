package websiteGenerator;

import websiteGenerator.pages.*;
import websiteGenerator.util.Theme;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;

/**
 * Class that creates and generats a project folder
 */
public class WebsiteBuilder {

    private final String projectFolder;
    private final Page[] pages;
    private final Theme theme;
    private final String robots;
    private final Styles styles;

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

    private WebsiteBuilder(Builder builder) {
        this.pages = builder.pages;
        this.projectFolder = builder.projectFolder;
        this.theme = builder.theme;
        this.robots = builder.robots;
        this.styles = builder.styles;
    }

    private static void createProjectFolder(String projectFolder) {
        File file = new File(projectFolder);

        boolean bool = file.mkdir();
        if (bool) {
            System.out.println(projectFolder + " folder was created successfully");
        } else {
            System.out.println("Error, folder was not created. It might already exist");
        }
    }


    /**
     * A builder for WebsiteBuilder {@link WebsiteBuilder}
     */
    public static class Builder {
        private String projectFolder = "WebsiteBuilderProject";
        private Page[] pages;
        private Theme theme;
        private String robots;
        private Styles styles;

        /**
         * Adds a projectFolder
         *
         * @param projectFolderName
         * @return projectFolder name
         */
        public Builder addProjectFolder(String projectFolderName) {
            this.projectFolder = projectFolderName;
            WebsiteBuilder.createProjectFolder(this.projectFolder);

            return this;
        }

        /**
         * Adds html pages to your project
         *
         * @param page
         * @return A list of HTML pages
         */
        public Builder addHTMLPages(Page[] page) {
            this.pages = page;
            for (Page p : pages) {
                try {
                    FileWriter fileWriter = new FileWriter("./" + projectFolder + "/" + p.getFileName());
                    fileWriter.write(p.createPageString(p, pages, theme));
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
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

            try {
                FileWriter fileWriter = new FileWriter("./" + projectFolder + "/" + robots);
                fileWriter.write("User-agent: * \n Allow: /");
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            return this;
        }

        /**
         * Adds a stylesheet file to your project
         *
         * @return Styles
         */
        public Builder addStylesheetFile(Styles styles) {
            this.styles = styles;
            try {
                FileWriter fileWriter = new FileWriter("./" + projectFolder + "/" + styles.getFilename());
                fileWriter.write(String.valueOf(styles.getStylesContent()));
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
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
