package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class HtmlTemplate {

    private String path;

    public HtmlTemplate(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void createFile() throws IOException {
        File file = new File(getPath());
        if (file.createNewFile()) {
            System.out.println("HTML file created");
        } else if (file.exists()) {
            System.out.println("HTML file already exists.");
        } else {
            System.out.println("Error in creating the HTML file");
        }
    }

    public void basicTemplate() throws IOException {
        FileWriter fileWriter = new FileWriter(getPath());
        fileWriter.write("""
                <!DOCTYPE html>
                <html lang="en">
                <head>
                    <meta charset="UTF-8">
                    <meta http-equiv="X-UA-Compatible" content="IE=edge">
                    <meta name="viewport" content="width=device-width, initial-scale=1.0">
                    <title>Website template</title>
                </head>
                <body>
                    <h1>Template</h1>
                </body>
                </html>
                """);
        System.out.println("HTML template was successfully filled");
        fileWriter.close();
    }

    public void htmlStylesTemplate(String cssFile, String title, String text) throws IOException {
        FileWriter fileWriter = new FileWriter(getPath());
        fileWriter.write("<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "   <meta charset=\"UTF-8\">\n" +
                "   <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
                "   <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "   <link rel=\"stylesheet\" href=\"" + cssFile + "\">\n" +
                "   <title>" + title + "</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "   <h1>" + text + "</h1>" +
                "\n" +
                "</body>\n" +
                "</html>");
        System.out.println("HTML template with style was successfully filled");
        fileWriter.close();
    }

    public void htmlCompleteWebsiteTemplate(String cssFile, String title, String text) throws IOException {
        FileWriter fileWriter = new FileWriter(getPath());
        fileWriter.write("<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "   <meta charset=\"UTF-8\">\n" +
                "   <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
                "   <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "   <link rel=\"stylesheet\" href=\"" + cssFile + "\">\n" +
                "   <title>" + title + "</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "   <h1>" + text + "</h1>" +
                "\n" +
                "   <script src=\"script.js\"></script>\n" +
                "</body>\n" +
                "</html>");
        System.out.println("HTML template with style was successfully filled");
        fileWriter.close();
    }

}
