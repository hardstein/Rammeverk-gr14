package websiteGenerator.Pages;

import websiteGenerator.Util.SemanticElements;
import websiteGenerator.Util.Theme;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class StarterProject implements SemanticElements {

    private static final String defaultFolder = "";

    private Theme theme;
    private String folderName;
    private String mainHeading;
    private String mainContent;

    public Theme getTheme() {
        return theme;
    }

    public void setTheme(Theme theme) {
        this.theme = theme;
    }

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

    public String getFolderName() {
        return folderName;
    }

    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }

    private StarterProject(Builder builder) {
        this.theme = builder.theme;

        this.folderName = builder.folderName;
        this.mainHeading = builder.mainHeading;
        this.mainContent = builder.mainContent;
    }

    public static StarterProject.Builder createBuilder() {
        return new Builder();
    }

    public static class Builder {
        private Theme theme;
        private String folderName;
        private String mainHeading;
        private String mainContent;

        private Builder() {
        }

        public StarterProject.Builder theme(final Theme theme) {
            this.theme = theme;
            return this;
        }

        public StarterProject.Builder folderName(final String folderName) {
            this.folderName = folderName;
            return this;
        }

        public StarterProject.Builder mainHeading(final String mainHeading) {
            this.mainHeading = mainHeading;
            return this;
        }

        public StarterProject.Builder mainContent(final String mainContent) {
            this.mainContent = mainContent;
            return this;
        }

        public StarterProject build() {
            return new StarterProject(this);
        }
    }

    public void createFolder() {
        if (getFolderName() == null) {
            setFolderName("starterproject");
        }
        System.out.println(getFolderName());
        File file = new File(getFolderName());

        boolean bool = file.mkdir();
        if (bool) {
            System.out.println("Folder was created successfully");
        } else {
            System.out.println("Error, folder was not created. It might already exist");
        }
    }

    public void htmlStylesTemplate() throws IOException {
        FileWriter fileWriter = new FileWriter("./" + getFolderName() + "/index.html");
        if (getMainHeading() == null) {
            setMainHeading("Starter template");
        }
        if (getMainContent() == null) {
            setMainContent("This is a starter project template.");
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
                "   <h1>" + getMainHeading() + "</h1>\n" +
                "   <p>" + getMainContent() + "</p>\n" +
                "</body>\n" +
                "</html>");
        System.out.println("HTML template with style was successfully filled");
        fileWriter.close();
    }

    public void createCssFile() throws IOException {
        FileWriter fileWriter = new FileWriter("./" + getFolderName() + "/styles.css");
        fileWriter.write(
                """
                        html, body {
                            margin: 0;
                            padding: 0;
                            box-sizing: border-box;
                            font-size: x-large;
                            text-align: center;
                        }"""
        );
        System.out.println("Successfully written CSS template");
        fileWriter.close();
    }

    public void createJSFile() throws IOException {
        FileWriter fileWriter = new FileWriter("./" + getFolderName() + "/script.js");
        fileWriter.write("""
                (function helloTemplate() {
                    console.log("Hello template");
                })();""");
        System.out.println("Successfully written JS template");
        fileWriter.close();
    }

    @Override
    public void header() {

    }

    @Override
    public void nav() {

    }

    @Override
    public void main() {

    }

    @Override
    public void aside() {

    }

    @Override
    public void footer() {

    }

    @Override
    public void completeTemplate() {
        createFolder();
        try {
            htmlStylesTemplate();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            createCssFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            createJSFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
