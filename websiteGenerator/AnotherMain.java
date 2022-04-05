

import java.io.IOException;

import websiteGenerator.WebsiteBuilder;
import websiteGenerator.Pages.*;
import websiteGenerator.SemanticElements.*;

public class AnotherMain {
    public static void main(String[] args) throws IOException {

        WebsiteBuilder project = WebsiteBuilder.createWebsiteBuilder()
            .addHome(Home.createPageBuilder()
                .setFilename("homepage.html")
                .header(Header.createElementBuilder()
                        .addHeaderHeading("Nice Title")
                        .addHeaderImageUrl("background.png")
                        .addHeroHeading("Hero-Title")
                        .addHeroImageUrl("hero.png")
                        .build()
                )
                .nav(Nav.createElementBuilder()
                        .addPageLinks(new String[]{"home", "registration", "login"})
                        .addLogoImage("GR14.logo")
                        .build()
                )
                // Blir problemer pga. klassenavn.
                .main(websiteGenerator.SemanticElements.Main.createElementBuilder()
                        .addMainHeading("Main Title")
                        .addMainContent("This is the content")
                        .build())
                .aside(Aside.createElementBuilder()
                        .addAsideTitle("Aside is usefully")
                        .addAsideText("Awesome aside")
                        .build())
                .footer(Footer.createElementBuilder()
                        .addContactName("Group 14")
                        .addContactEmail("gr14@email.com")
                        .addContactPhoneNumber(14326969)
                        .addSocialMediaLink("github.com/gr14-template")
                        .build()
                )
                .build()

            )
            .addArticle(Article.createArticlePageBuilder()
                .addHeader(Header.createElementBuilder()
                    .addHeaderHeading("Nice Title")
                    .addHeaderImageUrl("background.png")
                    .addHeroHeading("Hero-Title")
                    .addHeroImageUrl("hero.png")
                    .build()
                )
                .addNav(Nav.createElementBuilder()
                        .addPageLinks(new String[]{"home", "registration", "login"})
                        .addLogoImage("GR14.logo")
                        .build()
                )
                // Blir problemer pga. klassenavn.
                .addMain(websiteGenerator.SemanticElements.Main.createElementBuilder()
                        .addMainHeading("Main Title in the article template")
                        .addMainContent("This is the content article template")
                        .build())
                .addAside(Aside.createElementBuilder()
                        .addAsideTitle("Aside is usefully")
                        .addAsideText("Awesome aside")
                        .build())
                .addFooter(Footer.createElementBuilder()
                        .addContactName("Group 14")
                        .addContactEmail("gr14@email.com")
                        .addContactPhoneNumber(14326969)
                        .addSocialMediaLink("github.com/gr14-template")
                        .build()
                ) 
                .build()
            )
            .build(); 
 
      
    }
    
}
