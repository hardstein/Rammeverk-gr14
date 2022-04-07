package websiteGenerator;

import websiteGenerator.Pages.*;
import websiteGenerator.Util.Generator;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WebsiteBuilder implements Generator {

    private String projectFolder;
    private Page[] pages;
    private Home home;
    private StarterProject starterProject;
    private Article article;
    private Registration registration;
    private Login login;

    public Home getHome() {
        return home;
    }

    public StarterProject getStarterProject() {
        return starterProject;
    }

    public Article getArticle() {
        return article;
    }

    public Registration getRegistration() {
        return registration;
    }

    public Login getLogin() {
        return login;
    }

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
        this.home = builder.home;
        this.starterProject = builder.starterProject;
        this.article = builder.article;
        this.login = builder.login;
        this.registration = builder.registration;
        this.projectFolder = builder.projectFolder;
    }

    @Override
    public void generate() {
        String htmlHeadElement = """
                <!DOCTYPE html>
                
                <head>
                    <meta charset="UTF-8">
                    <meta http-equiv="X-UA-Compatible" content="IE=edge">
                    <meta name="viewport" content="width=device-width, initial-scale=1.0">
                    <title>Website template</title>
                </head>
                   """;
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
                                "<body>\n" +
                                page.getHeader().getContentOfElement() + "\n" +
                                page.getNav().getContentOfElement() + "\n" +
                                page.getMain().getContentOfElement() + "\n" +
                                page.getAside().getContentOfElement() + "\n" +
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
        private Home home;
        private StarterProject starterProject;
        private Article article;
        private Registration registration;
        private Login login;

        public Builder addProjectFolder(String projectFolderName) {
            this.projectFolder = projectFolderName;
            return this;
        }

        public Builder addPages(Page[] page) {
            this.page = page;
            return this;
        }

        public Builder addHome(Home home) {
            this.home = home;
            return this;
        }

        public Builder addStarterProject(StarterProject starterProject) {
            this.starterProject = starterProject;
            return this;
        }

        public Builder addArticle(Article article) {
            this.article = article;
            return this;
        }

        public Builder addRegistration() {
            this.registration = new Registration();
            return this;
        }

        public Builder addLogin() {
            this.login = new Login();
            return this;
        }

        public WebsiteBuilder build() {

            return new WebsiteBuilder(this);
        }
    }
}
