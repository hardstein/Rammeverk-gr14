import websiteGenerator.Home;
import websiteGenerator.StarterProject;

import java.io.IOException;

public class Main {
    
    public static void main(String[] args) throws IOException {
        Home home = Home.createBuilder()
                .mainContent("Cool content")
                .mainHeading("Title")
                .headerImageUrl("image.png")
                .heroHeading("HERO")
                .heroImageUrl("heroImage.png")
                .build();

        home.hero();


        StarterProject starter = StarterProject.createBuilder()
                .folderName("starterProject")
                .mainHeading("Cool template")
                .mainContent("This is the content")
                .build();

        starter.createFolder();
        starter.htmlStylesTemplate();
        starter.createCssFile();
        starter.createJSFile();

    }
    
}
