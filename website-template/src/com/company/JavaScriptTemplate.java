package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class JavaScriptTemplate {

    private String path;

    public JavaScriptTemplate(String path) {
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
            System.out.println("JS file created");
        } else if (file.exists()) {
            System.out.println("JS file already exists");
        } else {
            System.out.println("Error in creating the JS file");
        }
    }

    public void createBasicScriptFile() throws IOException {
        FileWriter fileWriter = new FileWriter(getPath());
        fileWriter.write("""
                (function helloTemplate() {
                    console.log("Hello template");
                })();""");
        System.out.println("Successfully written JS template");
        fileWriter.close();
    }
}
