package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CssTemplate {
    private String path;

    public CssTemplate(String path) {
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
            System.out.println("CSS file created");
        } else if (file.exists()) {
            System.out.println("CSS file already exists");
        } else {
            System.out.println("Error in creating the CSS file");
        }
    }

    public void fillCssTemplate() throws IOException {
        FileWriter fileWriter = new FileWriter(getPath());
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
}
