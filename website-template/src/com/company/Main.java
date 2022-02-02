package com.company;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        String foldername = "websiteTemplate";  // Project name
        Folder folder = new Folder(foldername);
        folder.createFolder();
        HtmlTemplate index = new HtmlTemplate("./websiteTemplate/index.html");
        DummyText dummyText = new DummyText(20);
        String text = dummyText.createDummyText();
        index.htmlCompleteWebsiteTemplate("styles.css", "Template", text);
        CssTemplate styles = new CssTemplate("./websiteTemplate/styles.css");
        styles.fillCssTemplate();
        JavaScriptTemplate script = new JavaScriptTemplate("./websiteTemplate/script.js");
        script.createBasicScriptFile();
    }
}
