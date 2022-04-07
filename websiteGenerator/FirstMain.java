import websiteGenerator.Pages.Article;
import websiteGenerator.Pages.Home;
import websiteGenerator.Pages.Page;
import websiteGenerator.WebsiteBuilder;
import websiteGenerator.HTMLTags.Body.SemanticElements.Aside;
import websiteGenerator.HTMLTags.Body.SemanticElements.Footer;
import websiteGenerator.HTMLTags.Body.SemanticElements.Header;
import websiteGenerator.HTMLTags.Body.SemanticElements.Nav;

import java.io.IOException;

public class FirstMain {

    public static void main(String[] args) throws IOException {

        Article article = Article.createArticlePageBuilder()
                .addHeader(Header.createElementBuilder()
                        .addHeaderHeading("ARTICLE ER NICE")
                        .addHeaderImageUrl("background.png")
                        .build()
                )
                .addNav(Nav.createElementBuilder()
                        .addPageLinks(new String[]{"home", "registration", "login"})
                        .addLogoImage("GR14.logo")
                        .build()
                )
                // Blir problemer pga. klassenavn.
                .addMain(websiteGenerator.HTMLTags.Body.SemanticElements.Main.createElementBuilder()
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
                .build();


//        Home home = Home.createPageBuilder()
//                .setFilename("homepage.html")
//                .header(Header.createElementBuilder()
//                        .addHeaderHeading("MAN TRENGER EN HOMEPAGE")
//                        .addHeaderImageUrl("background.png")
//                        .addHeroHeading("Hero-Title")
//                        .addHeroImageUrl("hero.png")
//                        .build()
//                )
//                .nav(Nav.createElementBuilder()
//                        .addPageLinks(new String[]{"home", "registration", "login"})
//                        .addLogoImage("GR14.logo")
//                        .build()
//                )
//                // Blir problemer pga. klassenavn.
//                .main(websiteGenerator.SemanticElements.Main.createElementBuilder()
//                        .addMainHeading("Main Title")
//                        .addMainContent("This is the content")
//                        .build())
//                .aside(Aside.createElementBuilder()
//                        .addAsideTitle("Aside is usefully")
//                        .addAsideText("Awesome aside")
//                        .build())
//                .footer(Footer.createElementBuilder()
//                        .addContactName("Group 14")
//                        .addContactEmail("gr14@email.com")
//                        .addContactPhoneNumber(14326969)
//                        .addSocialMediaLink("github.com/gr14-template")
//                        .build()
//                )
//                .build();

        WebsiteBuilder project = WebsiteBuilder.createWebsiteBuilder()
                .addPages(new Page[]{Home.createPageBuilder()
                        .setFilename("homepage.html")
                        .addHeader(Header.createElementBuilder()
                                .addHeaderHeading("MAN TRENGER EN HOMEPAGE")
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
                        .addMain(websiteGenerator.HTMLTags.Body.SemanticElements.Main.createElementBuilder()
                                .addMainHeading("Main Title")
                                .addMainContent("This is the content")
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
                        .build(), article})
                .build();

        project.generate();


    }
}
