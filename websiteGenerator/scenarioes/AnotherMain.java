package scenarioes;

import java.io.IOException;

import websiteGenerator.HTMLTags.HeadTag.Head;
import websiteGenerator.WebsiteBuilder;
import websiteGenerator.HTMLTags.Body.SemanticElements.*;
import websiteGenerator.Pages.*;
import websiteGenerator.Util.HTMLLanguageOptions;

/**
 * @hidden demonstration of framework, not a part of the library
 */
public class AnotherMain {
    public static void main(String[] args) throws IOException {

        // Scenarioes:
        // 1.
        // 2.
        // 7.
        // 9.
        // 14.

        //Creating page content
        Head head = Head.createHead("styles.css", "DENNE ER NY HEAD TITLE"); 
        // These will be the same for all pages: 
        Footer footer = Footer.createElementBuilder()
                        .addContactName("Group 14")
                        .addContactEmail("gr14@email.com")
                        .addContactPhoneNumber(14326969)
                        .addSocialMediaLink("github.com/gr14-template")
                        .build(); 

        Aside aside = Aside.createElementBuilder()
                        .addAsideTitle("Aside is usefull")
                        .addAsideText("Awesome aside")
                        .build(); 
        
        String[] menu = new String[]{"home", "registration", "login", "banan"}; 

        Nav nav = Nav.createElementBuilder()
                .addPageLinks(menu)
                .addLogoImage("GR14.logo")
                .build();

        // Different main content on pages: 
        // Article: 
        Main articleMain = Main.createElementBuilder()
                .addMainHeading("Main Title in the article template")
                .addMainContent("This is the content article template")
                .build(); 

        Header articleHeader = Header.createElementBuilder()
                .addHeaderHeading("ARTICLE ER NICE")
                .addHeaderImageUrl("background.png")
                .build(); 
        
        // Home: 
       Header homeHeader =  Header.createElementBuilder()
                        .addHeaderHeading("MAN TRENGER EN HOMEPAGE")
                        .addHeaderImageUrl("background.png")
                        .addHeroHeading("Hero-Title")
                        .addHeroImageUrl("hero.png")
                        .build(); 

        Main homeMain = Main.createElementBuilder()
                .addMainHeading("Main Title")
                .addMainContent("This is the content")
                .build(); 

        // Creating pages
        Article article = Article.createArticlePageBuilder()
                .addHead(head)
                .setLanguage(HTMLLanguageOptions.NB)
                .addHeader(articleHeader)
                .addNav(nav)
                .addMain(articleMain)
                .addAside(aside)
                .addFooter(footer)
                .build();

        Home homePage = Home.createPageBuilder()
                .addFileName("homepage.html")
                .addHead(head)
                .addHeader(homeHeader)
                .addNav(nav)
                .addMain(homeMain)
                .addAside(aside)
                .addFooter(footer)
                .build(); 


        // Making project:         
        Page[] HTMLpages = new Page[] {homePage, article}; 
        WebsiteBuilder project = WebsiteBuilder.createWebsiteBuilder()
        .addProjectFolder("dog")
        .addPages(HTMLpages)
        .build();

        project.generate();


        System.out.println();
    }
    
}
