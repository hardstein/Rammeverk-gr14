package scenarioes;

import java.io.IOException;

import websiteGenerator.HTMLTags.HeadTag.Head;
import websiteGenerator.Util.Form;
import websiteGenerator.Util.Theme;
import websiteGenerator.WebsiteBuilder;
import websiteGenerator.HTMLTags.Body.SemanticElements.*;
import websiteGenerator.Pages.*;
import websiteGenerator.Util.HTMLLanguageOptions;

/**
 * @hidden demonstration of framework, not a part of the library
 */
public class Main {
    public static void main(String[] args) throws IOException {

        String heroImageUrl = "https://images.unsplash.com/photo-1534171472159-edb6d1e0b63c?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxleHBsb3JlLWZlZWR8MjR8fHxlbnwwfHx8fA%3D%3D&auto=format&fit=crop&w=500&q=60";
        // Demonstration of our API (We will show a solution for all the scenarios here)
        // For now you can find scenario: 1, 3, 7, 9, 14

        //Creating page content
        Head head = Head.createHead("styles.css", "DENNE ER NY HEAD TITLE");
        // These will be the same for all pages:
        // Scenario 7:
        Footer footer = Footer.createElementBuilder()
                .addContactName("Group 14")
                .addContactEmail("gr14@email.com")
                .addContactPhoneNumber(14326969)
                .addGithubSocialMediaLink("github.com/gr14-template")
                .addFacebookSocialMediaLink("fb fakelink g14")
                .build();

        Aside aside = Aside.createElementBuilder()
                .addAsideTitle("Aside is usefull")
                .addAsideText("Awesome aside")
                .build();


        // Scenario 3:
        Nav nav = Nav.createElementBuilder()
                .addLogoImage("GR14.logo")
                .build();

        // Testing form
        Form articleForm = Form.createFormBuilder()
                .addNameField()
                .addButtonLabel("Register")
                .addEmailField()
                .addSubmitButton()
                .build();
        // Different main content on pages:
        // Article: 
        websiteGenerator.HTMLTags.Body.SemanticElements.Main articleMain = websiteGenerator.HTMLTags.Body.SemanticElements.Main.createElementBuilder()
                .addMainHeading("Title in the article template")
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
                .build();

        websiteGenerator.HTMLTags.Body.SemanticElements.Main homeMain = websiteGenerator.HTMLTags.Body.SemanticElements.Main.createElementBuilder()
                .addMainHeading("Main Title")
                .addMainBody("This is the content inside the frontpage.")
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


        // Testing login form
        Form loginForm = Form.createFormBuilder()
                .addButtonLabel("Log in")
                .addEmailField()
                .addPasswordField()
                .addSubmitButton()
                .build();

        websiteGenerator.HTMLTags.Body.SemanticElements.Main loginMain = websiteGenerator.HTMLTags.Body.SemanticElements.Main.createElementBuilder()
                .addMainHeading("Log in")
                .addMainBody(loginForm)
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
