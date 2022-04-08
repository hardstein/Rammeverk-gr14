package websiteGenerator;

import websiteGenerator.Pages.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WebsiteBuilder {

    private String projectFolder;
    private Page[] pages;

    public Page[] getPages() {
        return pages;
    }

    public String getProjectFolder() {
        return projectFolder;
    }

    public static Builder createWebsiteBuilder() {
        return new Builder();
    }

    private WebsiteBuilder(Builder builder) {
        this.pages = builder.page;
        this.projectFolder = builder.projectFolder;
    }

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
                                "<body>\n" +
                                page.getHeader().getContentOfElement() + "\n" +
                                page.getNav().getContentOfElement() + "\n" +
                                page.getMain().getContentOfElement() + "\n" +
                                page.getAside().getContentOfElement() + "\n" +
                                page.getFooter().getContentOfElement() + "\n" +
                                "</body>\n" +
                                page.getHtml().getEndTag());
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    public static class Builder {
        private String projectFolder = "WebsiteProject";
        private Page[] page;

        public Builder addProjectFolder(String projectFolderName) {
            this.projectFolder = projectFolderName;
            return this;
        }

        public Builder addPages(Page[] page) {
            this.page = page;
            return this;
        }

        public WebsiteBuilder build() {

            return new WebsiteBuilder(this);
        }
    }
}
