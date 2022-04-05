import websiteGenerator.Pages.Home;
import websiteGenerator.Pages.StarterProject;

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


        // Vår drøm
//        Home home = HomeBuilder.createBuilder().
//                addNav().creatBuilder().addImage("nice.png").addText("Nice!").build()
//                main().addImage("nice.png").addText("Nice!").build()
//                .build();
//
//        ProjectBuilder.build(home)(article).completeProject();


    }

}
