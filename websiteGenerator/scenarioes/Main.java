package scenarioes;

import java.io.IOException;

import websiteGenerator.HTMLTags.HeadTag.Head;
import websiteGenerator.Util.*;
import websiteGenerator.WebsiteBuilder;
import websiteGenerator.HTMLTags.Body.SemanticElements.*;
import websiteGenerator.Pages.*;

import static websiteGenerator.Util.FontFamily.TimesNewRoman;
import static websiteGenerator.Util.FontSize.*;
import static websiteGenerator.Util.FontWeight.*;

/**
 * @hidden demonstration of framework, not a part of the library
 */
public class Main {
    public static void main(String[] args) throws IOException {

        String heroImageUrl = "https://images.unsplash.com/photo-1534171472159-edb6d1e0b63c?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxleHBsb3JlLWZlZWR8MjR8fHxlbnwwfHx8fA%3D%3D&auto=format&fit=crop&w=500&q=60";
        // Demonstration of our API (We will show a solution for all the scenarios here)
        // For now you can find scenario: 1, 3, 7, 9, 14

        //Creating page content
        Head head = Head.createHead("styles.css", "Title of the page");
        // These will be the same for all pages:
        // Scenario 7:
        Footer footer = Footer.createElementBuilder()
                .addContactInformationContainer()
                .addSocialMediaLinksContainer()
                .addContactName("Group 14")
                .addContactEmail("gr14@email.com")
                .addContactPhoneNumber(14326969)
                .addTwitterSocialMediaLink("Twitter link")
                .addInstagramSocialMediaLink("Instagram link")
                .addFacebookSocialMediaLink("facebook link")
                .build();

        Footer articleFooter = Footer.createElementBuilder()
                .addSocialMediaLinksContainer()
                .addContactInformationContainer()
                .addContactName("Per")
                .addTwitterSocialMediaLink("Twitter link")
                .addContactName("Pål")
                .addContactPhoneNumber(32352345)
                .addContactName("Per")
                .addContactPhoneNumber(765476548)
                .addTwitterSocialMediaLink("Twitter link")
                .addFacebookSocialMediaLink("facebook link")
                .addFacebookSocialMediaLink("facebook link")
                .addContactName("Askeladden")
                .build();

        Aside aside = Aside.createElementBuilder()
                .addAsideTitle("Aside is usefull")
                .addAsideText("Awesome aside")
                .build();

        // Scenario 3:
        Nav nav = Nav.createElementBuilder()
                .addLogoImage("https://images.unsplash.com/photo-1650447973536-f2c1019c62e3?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTJ8fDE0JTIwbnVtYmVyfGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=500&q=60")
                .build();

        // Testing form
        Form articleForm = Form.createFormBuilder()
                .addTextLabel("Name")
                .addTextField()
                .addTextLabel("Address")
                .addTextField()
                .addTextLabel("ZIP")
                .addTextField()
                .addEmailField()
                .addNumberLabel("Age")
                .addNumberField()
                .addButtonLabel("Register")
                .addSubmitButton()
                .build();
        // Different main content on pages:
        // Article: 
        websiteGenerator.HTMLTags.Body.SemanticElements.Main articleMain = websiteGenerator.HTMLTags.Body.SemanticElements.Main.createElementBuilder()
                .addMainHeading("Title in the article template")
                .addFontFamily(TimesNewRoman)
                .addMainHeading("Another heading")
                .addIntroduction("This is the introduction")
                .addMainBody("This is the content article template")
                .addForm(articleForm)
                .addConclusion("The conclusion is...")
                .build();

        Header articleHeader = Header.createElementBuilder()
                .addHeaderHeading("ARTICLE ER NICE")
                .addHeaderImageUrl("background.png")
                .build();

        // Home: 
        Header homeHeader = Header.createElementBuilder()
                .addHeroHeading("Hero-Title")
                .addHeroImageUrl(heroImageUrl)
                .createHeroHeader()
                .createHeroHeader()
                .build();

        websiteGenerator.HTMLTags.Body.SemanticElements.Main homeMain = websiteGenerator.HTMLTags.Body.SemanticElements.Main.createElementBuilder()
                .addMainHeading("Main Title")
                .addFontFamily(TimesNewRoman)
                .addMainHeading("Main Title 2")
                .addIntroduction("The homepage is nice")
                .addBody("A sentence in font size 3, choose between FONTSIZE1 - FONTSIZE6.", FONTSIZE3)
                .addBody("Another sentence now this one with font size 4 and bold.", FONTSIZE4, BOLD)
                .addBody("Just as sentence that has light font weight", LIGHT)
                .addBody("Just as normal sentence.")
                .addIntroduction("Even a introduction after the body.")
                .build();

        // Creating pages
        Header loginHeader = Header.createElementBuilder().build();

        Article article = Article.createArticlePageBuilder()
                .addHead(head)
                .setLanguage(HTMLLanguageOptions.NB)
                .addHeader(articleHeader)
                .addNav(nav)
                .addMain(articleMain)
                .addAside(aside)
                .addFooter(articleFooter)
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


        // Testing login form
        Form loginForm = Form.createFormBuilder()
                .addButtonLabel("Log in")
                .addEmailField()
                .addPasswordField()
                .addSubmitButton()
                .build();

        websiteGenerator.HTMLTags.Body.SemanticElements.Main loginMain = websiteGenerator.HTMLTags.Body.SemanticElements.Main.createElementBuilder()
                .addMainHeading("Log in")
                .addFontFamily(TimesNewRoman)
                .addForm(loginForm)
                .build();

        Login loginPage = Login.createPageBuilder()
                .addHead(head)
                .addMain(loginMain)
                .addNav(nav)
                .addHeader(loginHeader)
                .addAside(aside)
                .addFooter(footer)
                .build();

        // Making project:
        // Scenario 1, 9 and 14:
        Page[] HTMLpages = new Page[]{homePage, article, loginPage};
        WebsiteBuilder project = WebsiteBuilder.createWebsiteBuilder()
                .addRobots()
                .addTheme(Theme.DARK)
                .addProjectFolder("testFolder")
                .addHTMLPages(HTMLpages)
                .build();

        project.generate();

        System.out.println();
    }

}
